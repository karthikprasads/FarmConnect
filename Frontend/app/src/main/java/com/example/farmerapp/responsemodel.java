package com.example.farmerapp;

import android.widget.TextView;

public class responsemodel {
    String message;
    public responsemodel() {
    }

    public responsemodel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
