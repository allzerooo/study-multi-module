package study.spring.apimodule.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import study.spring.apimodule.exception.CustomException;
import study.spring.apimodule.response.CommonResponse;
import study.spring.commonmodule.enums.Code;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public CommonResponse handlerCustomException(CustomException e) {
		return CommonResponse.builder()
				.code(e.getCode())
				.message(e.getMessage())
				.build();
	}

	@ExceptionHandler(Exception.class)
	public CommonResponse handlerException(Exception e) {
		return CommonResponse.builder()
				.code(Code.UNKNOWN_ERROR.getCode())
				.message(Code.UNKNOWN_ERROR.getMessage())
				.build();
	}
}
