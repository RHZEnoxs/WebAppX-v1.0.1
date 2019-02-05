package spring.mvc.code.ch3.exception;


import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason="查詢數據失敗(ResponseStatus)")
public class ResponseStatusException extends RuntimeException {
}
