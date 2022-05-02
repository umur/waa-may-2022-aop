package edu.miu.springaop.aspect;

import edu.miu.springaop.exception.AopIsAwesomeHeaderException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandlerAspect {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(AopIsAwesomeHeaderException.class)
    public Map<String, String> handleInvalidArgument(AopIsAwesomeHeaderException exception) {
        Map<String, String> errorMessage = new HashMap<>();
        errorMessage.put("AopISAwesomeException", exception.getMessage());
        return errorMessage;
    }

}
