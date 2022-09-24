package study.spring.apimodule.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.spring.apimodule.service.DemoService;

@RestController
@RequiredArgsConstructor
public class DecoController {

	private final DemoService demoService;

	@GetMapping("/save")
	public String save() {
		return demoService.save();
	}

	@GetMapping("/find")
	public String find() {
		return demoService.find();
	}
}
