package com.springreact.springreact;

import com.springreact.springreact.model.User;
import com.springreact.springreact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringreactApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Roshan", "Sourav", "roshansouravj@gmail.com"));
		this.userRepository.save(new User("Shubham", "Singh", "shubhamsingh@gmail.com"));
		this.userRepository.save(new User("Aditya", "Jain", "adityajain@gmail.com"));
		this.userRepository.save(new User("Jitendra", "Singh", "jiturajput@gmail.com"));
	}
}
