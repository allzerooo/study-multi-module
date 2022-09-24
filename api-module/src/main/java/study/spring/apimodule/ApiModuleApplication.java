package study.spring.apimodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"study.spring.apimodule", "study.spring.commonmodule"}
)
public class ApiModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiModuleApplication.class, args);
	}

}
