package com.example.accessingdatamysql;

public class Response {
    private String message;
    private Integer success;

    public Response(String message, Integer success) {
        this.message = message;
        this.success = success;
    }

    public Integer getSuccess() {
        return success;
    }
    public String getMessage() {
        return message;
    }

}