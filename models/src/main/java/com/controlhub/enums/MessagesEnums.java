package com.controlhub.enums;

import io.micronaut.core.annotation.Introspected;
import lombok.Getter;

import java.net.HttpURLConnection;


@Getter
@Introspected
public enum MessagesEnums {

    INVALID_INDEX(HttpURLConnection.HTTP_BAD_REQUEST,"100","Invalid index.");


    private String httpCode;
    private String code;
    private String message;

    MessagesEnums(Integer httpCode,String code, String message){
        this.httpCode = String.valueOf(httpCode);
        this.message = message;
        this.code = code;
    }

    public String getAll(){
        return (new StringBuffer(httpCode).append("-").append(code).append("-").append(message)).toString();
    }
}
