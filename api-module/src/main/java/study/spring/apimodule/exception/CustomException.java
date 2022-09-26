package study.spring.apimodule.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import study.spring.commonmodule.enums.Code;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomException extends RuntimeException {

	private String code;
	private String message;

	public CustomException(Code code) {
		super(code.getMessage());
		setCode(code.getCode());
		setMessage(code.getMessage());
	}
}
