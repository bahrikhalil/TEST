package com.example.fok;

import com.example.fok.models.book;
import com.example.fok.repo.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;

@RestController
@SpringBootApplication

public class FokApplication {

	//@Bean
	//CommandLineRunner run(BookRepo bookRepo) {
		//return args -> {
			//bookRepo.save(new book(8,"arnold","123",9));

		//};
	//}


	public static void main(String[] args) {
		SpringApplication.run(FokApplication.class, args);
	}



}
