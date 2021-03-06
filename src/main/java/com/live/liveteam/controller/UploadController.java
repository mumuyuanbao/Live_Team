package com.live.liveteam.controller;


import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.FastDfsUtil;
import com.live.liveteam.vo.UploadVO;
import io.swagger.annotations.Api;
import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 作者：木木豹
 * 时间2019-09-03 20:49
 * 描述：
 */
@Api(description = "上传文件接口")
@RestController
@RequestMapping("upload")
public class UploadController {


    @Autowired
    private FastFileStorageClient fastClient;

    /**
     *上传单张图片
     * @param file
     * @throws IOException
     * @throws MyException
     */
    @PostMapping("addupload")
    public ResultVO<UploadVO> UploadFile(MultipartFile file) throws IOException, MyException {
        ResultVO<UploadVO> result = new ResultVO<UploadVO>();
        UploadVO uploadVo = new UploadVO();
        String uploadUrl="";
        if (file!=null){
          uploadUrl = FastDfsUtil.Upload(file);
          uploadVo.setUrl(uploadUrl);
          uploadVo.setFileName(file.getName());
          uploadVo.setFileType(file.getOriginalFilename());
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setData(uploadVo);
        return  result;

    }
}
