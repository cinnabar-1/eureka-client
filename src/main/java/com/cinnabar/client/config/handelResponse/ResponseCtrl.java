package com.cinnabar.client.config.handelResponse;

/**
 * @author cinnabar-1
 * @version 1.0.0
 * @ClassName ResponseCtrl.java
 * @Description
 * @createTime 2020-11-18  13:09:00
 */
public class ResponseCtrl {

    private static RespEntity RespEntity = new RespEntity();
    /*稍微异常处理*/
    public static RespEntity in(Body body) {
        try {
            ResponseCtrl.RespEntity.setCode(200);
            ResponseCtrl.RespEntity.setMessage("success");
            body.include(ResponseCtrl.RespEntity);
        } catch (Exception e) {
            ResponseCtrl.RespEntity.setCode(202);
            ResponseCtrl.RespEntity.setMessage(e.getMessage());
        }
        return RespEntity;
    }
}
