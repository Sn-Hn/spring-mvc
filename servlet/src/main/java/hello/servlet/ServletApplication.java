package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan	// 서블릿 자동 등록 (하위 패키지를 뒤져 서블릿 찾아 등록)
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}
	
	/* 빈 등록
	@Bean
	SpringMemberFormControllerV1 springMemberFormControllerV1() {
		return new SpringMemberFormControllerV1();
	}
	*/
}
