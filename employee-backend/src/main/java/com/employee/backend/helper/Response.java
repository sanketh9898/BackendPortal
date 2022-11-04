package com.employee.backend.helper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

    private String status;
    private String message;
    private Integer code;

    private Object data;

    public Response(){
    }
    public Response(Object data){
        this.data = data;
    }
}
