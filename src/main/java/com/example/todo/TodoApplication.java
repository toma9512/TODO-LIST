package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * SpringBootServletInitializer
 * - war 파일을 배포할 경우 해당 클래스를 반드시 상속 받아야 한다
 * - 외부 톰캣에서 동작하도록 하기 위해서는 web.xml에 애플리케이션 컨텍스트를 등록해야 한다
 * 아파치 톰캣이 구동될 때 web.xml을 읽어 웹 애플리케이션을 구동한다
 */

@SpringBootApplication
public class TodoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
	

}
