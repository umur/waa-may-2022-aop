package com.project.spring.exception;

public class AopIsAwesomeHeaderException extends Exception {

    public AopIsAwesomeHeaderException(Throwable message) {
        super(message);
    }

    public AopIsAwesomeHeaderException(String message) {
        super(message);
    }

    public AopIsAwesomeHeaderException(String message, Throwable cause) {
        super(message, cause);
    }
}
