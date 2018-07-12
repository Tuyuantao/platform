package com.ticketnew.qe.exceptions;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/18
 */
public class ParamIsRequiredException extends RuntimeException{

    public ParamIsRequiredException() {
        super();
    }

    public ParamIsRequiredException(String message) {
        super(message);
    }
}
