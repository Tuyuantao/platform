package com.ticketnew.qe.exceptions;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/18
 */
public class ParamIncorrectException extends RuntimeException{

    public ParamIncorrectException() {
        super();
    }

    public ParamIncorrectException(String message) {
        super(message);
    }
}
