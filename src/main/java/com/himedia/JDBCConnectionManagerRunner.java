package com.himedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

//우리가 생성했던 board-spring-boot-starter를 가져왔다.
import com.himedia.jdbc.util.JDBCConnectionManager;

@Service //컨테이너가 컴포넌트를 스캔하도록 추가
public class JDBCConnectionManagerRunner implements ApplicationRunner{

	@Autowired
	public JDBCConnectionManager connectionManager;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("커넥션 메니저"+connectionManager);
		
	}
	
	
}
