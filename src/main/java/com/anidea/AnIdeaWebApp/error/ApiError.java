package com.anidea.AnIdeaWebApp.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ApiError {

    @Getter
    @Setter
    private int status;

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private String path;

    @Getter
    @Setter
    private long timestamp = new Date().getTime();

    @Getter
    @Setter
    private Map<String,String> validationErrors = null;

}
