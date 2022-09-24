package com.example.service.model.request;

import javax.validation.constraints.NotBlank;

public class EchoRequest {
    @NotBlank
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
