package com.live.liveteam.controller;


import com.alibaba.fastjson.JSONObject;
import com.live.liveteam.common.QrUtil.CreateQrcore;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.vo.UploadVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 作者：木木豹
 * 时间2019-09-11 11:53
 * 描述：
 */
@Api(description = "用户个人二维码")
@RestController
@RequestMapping("core")
public class CoreController {


    /**
     * 接收二维码
     *
     * @param request
     * @return
     * @throws IOException
     */
    @ApiImplicitParam(name = "openId", value = "用户openId", dataType = "String", paramType = "query")
    @PostMapping(value = "/quertQrCode",produces = "text/html;charset=utf-8")
    public ResultVO<UploadVO> quertQrCode(HttpServletRequest request, String openId) throws IOException {
        ResultVO<UploadVO> result = new ResultVO<>();
        String accessToken = CreateQrcore.getToken();
        System.out.println("accessToken;" + accessToken);
        String CodeUrl = CreateQrcore.getminiqrQr(accessToken, request, openId);
        if (CodeUrl==null||CodeUrl.length()<=0){
            throw  new BizException(EnumResult.FAILED_TO_GENERATE_QR_CODE);
        }
        UploadVO vo = new UploadVO();
        vo.setFileType("png");
        vo.setFileType("携带OpenId二维码");
        vo.setUrl(CodeUrl);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setData(vo);
        return result;
    }
}