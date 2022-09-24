package study.spring.commonmodule.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Code {
	SUCCESS("0000", "SUCCESS"),
	UNKNOWN_ERROR("9999", "UNKNOWN_ERROR");

	private String code;
	private String message;
}
