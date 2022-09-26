package study.spring.apimodule.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import study.spring.commonmodule.enums.Code;

@Getter
@Setter
@Builder
@JsonInclude(Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {

	private String code;
	private String message;
	private T data;

	public CommonResponse(Code code) {
		setCode(code.getCode());
		setMessage(code.getMessage());
	}

	public CommonResponse(T data) {
		setCode(Code.SUCCESS.getCode());
		setMessage(Code.SUCCESS.getMessage());
		setData(data);
	}

	public CommonResponse(Code code, T data) {
		setCode(code.getCode());
		setMessage(code.getMessage());
		setData(data);
	}
}
