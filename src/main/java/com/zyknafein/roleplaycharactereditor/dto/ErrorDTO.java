package com.zyknafein.roleplaycharactereditor.dto;

import com.zyknafein.roleplaycharactereditor.exceptions.ErrorCode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    private ErrorCode errorCode;
    private String message;
}
