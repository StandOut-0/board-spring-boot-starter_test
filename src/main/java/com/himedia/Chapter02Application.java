package com.himedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@componentScan을 먼저 처리하여 사용자가 등록한빈을 먼저 메모리에 올림
//나중에 @enableautoConfiguration을 실행해 자동설정 빈등록을함.
@SpringBootApplication  
public class Chapter02Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter02Application.class, args);
	}

}
