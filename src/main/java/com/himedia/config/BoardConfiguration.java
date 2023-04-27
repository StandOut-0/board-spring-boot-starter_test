package com.himedia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.himedia.jdbc.util.JDBCConnectionManager;

@Configuration
public class BoardConfiguration {

	
	//데이터베이스 정보를 변경하고 싶을때
	//@Bean //properties파일을 이용해 get을 board-spring-stater에서 수행하니 이 bean은 이제필요없다.
	public JDBCConnectionManager getJDBCConnectionManager() {
		JDBCConnectionManager manager = new JDBCConnectionManager();
		manager.setDriverClass("org.h2.Driver");
		manager.setUrl("jdbc:h2:tcp://localhost/~/test");
		manager.setUsername("sa");
		manager.setPassword("1234");
		return manager;
	}
}
