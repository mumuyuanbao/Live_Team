package com.live.liveteam.common.QrUtil;


import com.alibaba.fastjson.JSONObject;
import com.live.liveteam.common.constant.BizConfiguration;
import com.live.liveteam.common.utils.FastDfsUtil;
import com.live.liveteam.vo.UploadVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：木木豹
 * 时间2019-09-11 11:44
 * 描述：
 */
public class CreateQrcore {

    /*
     * 获取 token
     * 普通的 get 可获 token
     */
    public  static String getToken() {
        try {
            Map<String, String> map = new LinkedHashMap<>();
            map.put("grant_type", "client_credential");
            map.put("appid","wx8c0c3f88ccb07111");
            map.put("secret", "71719ee4e483fcd726fee6cd28b828c1");
            String rt = UrlUtil.sendPost("https://api.weixin.qq.com/cgi-bin/token", map);
            System.out.println("what is:"+rt);
            JSONObject rowData = JSONObject.parseObject(rt);

            if (rowData.getString("access_token") != null || rowData.getString("access_token") != "") {
                return rowData.getString("access_token");
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /*
     * 获取二维码图片
     *
     */
    public static String getminiqrQr(String accessToken, HttpServletRequest request,String scene) {
//        String p=""; //二维码生产的地址  本地F盘code文件夹
//        System.out.println(p);
//        String codeUrl=p+"/twoCode.png";
        String str="";
//        String twoCodeUrl="twoCode.png";
        try
        {
            URL url = new URL("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+accessToken);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");// 提交模式
            // conn.setConnectTimeout(10000);//连接超时 单位毫秒
            // conn.setReadTimeout(2000);//读取超时 单位毫秒
            // 发送POST请求必须设置如下两行
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            // 发送请求参数
            JSONObject paramJson = new JSONObject();
            paramJson.put("scene",scene);//这就是你二维码里携带的参数 String型  名称不可变
            paramJson.put("path", "pages/index/index"); //这是设置扫描二维码后跳转的页面
            paramJson.put("width", 430);
            paramJson.put("is_hyaline", true);
            paramJson.put("auto_color", true);

            System.out.println("httpURLConnection"+httpURLConnection);
            System.out.println("paramJson.toString()"+paramJson.toString());
            printWriter.write(paramJson.toString());
            // flush输出流的缓冲
            printWriter.flush();
            //开始获取数据
            BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
            //输出到fastdfs服务器上
            str = FastDfsUtil.fdfsUpload(bis, ".png");
//            OutputStream os = new FileOutputStream(new File(codeUrl));
//            int len;
//            byte[] arr = new byte[1024];
//            while ((len = bis.read(arr)) != -1)
//            {
//                os.write(arr, 0, len);
//                os.flush();
//            }
//            os.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return BizConfiguration.FASTDFS_PREFIX_URL_HEAD+str;
    }
}
