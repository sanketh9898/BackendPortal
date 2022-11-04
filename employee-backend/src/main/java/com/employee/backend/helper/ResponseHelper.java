package com.employee.backend.helper;

public class ResponseHelper {

    public ResponseHelper(){

    }

    public static Response getSuccessResponse(String message,Object data,Integer code,String status){
        Response response = new Response();
        response.setMessage(message);
        response.setCode(code);
        response.setData(data);
        response.setStatus(status);
        return response;
    }
}
