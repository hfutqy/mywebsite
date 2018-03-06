package com.qiyu.mywebsite.utils;

import com.qiyu.mywebsite.constant.BaseErrorCode;
import com.qiyu.mywebsite.vo.ResponseVo;

/**
 * 出参工具类
 * Created by qiyu on 2018/2/27.
 */
public class ResponseVoUtils {

    public static ResponseVo buildSuccessResponseVo(Object data){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setSuccess(true);
        responseVo.setErrorCode(BaseErrorCode.SUCCESS.getKey());
        responseVo.setMessage(BaseErrorCode.SUCCESS.getValue());
        responseVo.setData(data);
        return responseVo;
    }

    public static ResponseVo buildErrorResponseVo(BaseErrorCode baseErrorCode){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setSuccess(false);
        responseVo.setErrorCode(baseErrorCode.getKey());
        responseVo.setMessage(baseErrorCode.getValue());
        return responseVo;
    }
}
