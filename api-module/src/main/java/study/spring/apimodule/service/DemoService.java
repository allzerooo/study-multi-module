package study.spring.apimodule.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.spring.apimodule.exception.CustomException;
import study.spring.commonmodule.enums.Code;
import study.spring.commonmodule.service.CommonDemoService;

@Service
@Slf4j
@RequiredArgsConstructor
public class DemoService {

	private final CommonDemoService commonDemoService;

	public String save() {
		log.info(Code.SUCCESS.getCode());
		return "save";
	}

	public String find() {
		log.info(commonDemoService.commonDemoService());
		return "find";
	}

	public String exception() {
		if (true) {
			throw new CustomException(Code.UNKNOWN_ERROR);
		}
		return "exception";
	}
}
