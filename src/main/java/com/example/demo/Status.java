package com.example.demo;

public class Status {

    public static int count = 0;

    private String status;

    public Status(String status) {
        this.status = status;

        count++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


