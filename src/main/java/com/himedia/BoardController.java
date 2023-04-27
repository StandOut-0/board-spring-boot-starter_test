package com.himedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller 대신 스프링 4 부터 지원하는 @RestController사용, rest
//uri 요청방식 작업명+기본키+메서드+데이터
@RestController
public class BoardController {

	public BoardController() {
	System.out.println("=====>BoardController 생성");
	}

	@GetMapping("/hello")
	public String hello(String name) {
		return "hello" + name;
	}
	
}
