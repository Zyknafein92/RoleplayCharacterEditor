package com.zyknafein.roleplaycharactereditor.exceptions;

import com.zyknafein.roleplaycharactereditor.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionError extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDTO> handleException(RuntimeException exception) {
        ErrorCode errorCode = ErrorCode.UNKNOWN_ERROR;
        String message = "unknown error";
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        ErrorDTO
                                .builder()
                                .errorCode(errorCode)
                                .message(message)
                                .build()
                );
    }
}
