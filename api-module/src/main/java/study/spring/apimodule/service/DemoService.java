package study.spring.apimodule.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.spring.commonmodule.enums.Code;

@Service
@Slf4j
public class DemoService {

	public String save() {
		log.info(Code.SUCCESS.getCode());
		return "save";
	}

	public String find() {
		return "find";
	}
}
