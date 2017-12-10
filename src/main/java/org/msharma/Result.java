/*
 * Copyright (c) 1/23/15 4:14 PM.Mohan Sharma - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package org.msharma;

import com.google.common.collect.Lists;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * @author Mohan Sharma Created on 1/20/2017.
 * This class demonstrates how we can send generic error to view in Spring MVC.
 */
@Getter
public final class Result {

    private static String successMsg = "";

    private static String failureMsg = "Could not complete operation,Contact Administrator";

    public enum RESULT_TYPE {
        SUCCESS("200"), ERROR("500");

        private String code;

        RESULT_TYPE(String code) {
            this.code = code;

        }
    }

    private String status;

    private String message;

    private RESULT_TYPE resultType;

    private String id;

    private Object data;

    private String failureDetails;


    public Result(String message, RESULT_TYPE resultType) {
        this.message = message;
        this.resultType = resultType;
        this.status = resultType.code;
    }


    static Result failureResultWithErrorDetails(String message, String failureDetails) {
        Result result = new Result(message, RESULT_TYPE.ERROR);
        result.failureDetails = failureDetails;
        return result;
    }

    public Result(String message, RESULT_TYPE resultType, String id) {
        this(message, resultType);
        this.id = id;
    }

    public static Result success() {
        return new Result(successMsg, RESULT_TYPE.SUCCESS);
    }

    public static Result success(String message) {
        return new Result(message, RESULT_TYPE.SUCCESS);
    }

    public static Result success(String message, Object data) {
        Result result = new Result(message, RESULT_TYPE.SUCCESS);
        result.data = data;
        return result;
    }

    public static Result success(String message, String id) {
        return new Result(message, RESULT_TYPE.SUCCESS, id);
    }

    public static Result failure(String message, Object data) {
        Result result = new Result(message, RESULT_TYPE.ERROR);
        result.data = data;
        return result;
    }

    public static Result failure(String message) {
        return new Result(message, RESULT_TYPE.ERROR);
    }

    public static Result failure(String message, List<ObjectError> errors) {
        final List<String> errorCodes = Lists.newArrayList();
        for (ObjectError error : errors) {
            errorCodes.add(error.getDefaultMessage());
        }
        return failureResultWithErrorDetails(message, StringUtils.join(errorCodes, ","));
    }

    public static Result failure() {
        return new Result(failureMsg, RESULT_TYPE.ERROR);
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", resultType=" + resultType +
                '}';
    }
}
