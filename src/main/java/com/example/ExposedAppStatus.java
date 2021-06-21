package com.example;

public class ExposedAppStatus {
    private String host;

    public ExposedAppStatus() {
    }

    public ExposedAppStatus(String hostname) {
        this.host = hostname;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    // Add Status information here
}
