package com.zyknafein.roleplaycharactereditor.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@Data
public class InvalidDataException extends RuntimeException {

    private ErrorCode errorCode;

    public InvalidDataException(String s, ErrorCode errorCode) {
        super(s);
        this.errorCode = errorCode;
    }
}
