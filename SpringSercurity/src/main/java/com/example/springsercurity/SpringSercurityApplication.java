package com.example.springsercurity;

import com.example.springsercurity.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSercurityApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringSercurityApplication.class, args);
	}
//	@Autowired
//	AccountRepository accountRepository;
//
//
//	@Override
//	public void run(String... args) throws Exception {
//		// Khi chương trình chạy
//		// Insert vào csdl một user.
//		User user = new User();
//		user.setUsername("keu");
//		user.setPassword("123456"));
//		userRepository.save(user);
//		System.out.println(user);
////	}
}
