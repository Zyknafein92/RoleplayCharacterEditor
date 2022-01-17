//package com.zyknafein.roleplaycharactereditor.exceptions;
//
//import com.zyknafein.roleplaycharactereditor.dto.ErrorDTO;
//import org.springframework.context.support.DefaultMessageSourceResolvable;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import java.util.Date;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@ControllerAdvice
//public class CustomGlobalExceptionError extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<ErrorDTO> handleException(RuntimeException exception) {
//        ErrorCode errorCode = ErrorCode.UNKNOWN_ERROR;
//        String message = "unknown error";
//
//        if(exception instanceof InvalidDataException) {
//            errorCode = ((InvalidDataException) exception).getErrorCode();
//            message = exception.getMessage();
//        }
//
//        return ResponseEntity
//                .status(HttpStatus.BAD_REQUEST)
//                .body(
//                        ErrorDTO
//                                .builder()
//                                .errorCode(errorCode)
//                                .message(message)
//                                .build()
//                );
//    }
//
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//                                                                  HttpHeaders headers,
//                                                                  HttpStatus status, WebRequest request) {
//
//        Map<String, Object> body = new LinkedHashMap<>();
//        body.put("timestamp", new Date());
//        body.put("status", status.value());
//
//        //Get all errors
//        List<String> errors = ex.getBindingResult()
//                .getFieldErrors()
//                .stream()
//                .map(DefaultMessageSourceResolvable::getDefaultMessage)
//                .collect(Collectors.toList());
//
//        body.put("errors", errors);
//
//        return new ResponseEntity<>(body, headers, status);
//
//    }
//
//}
