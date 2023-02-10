package com.jpa.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.springboot.dao.UserRepository;
import com.jpa.springboot.entity.User;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		// saving a single user
		
		/*
		 
			User user = new User();
			
			user.setName("Anurag");
			user.setCity("Kolkata");
			user.setStatus("Node Js and Spring developer");
			
			User save = userRepository.save(user);
			System.out.println(save);
		
		*/
		
		
		//Saving multiple users
		
		/*
		
				User user1 = new User();
				
				user1.setName("Anuradha");
				user1.setCity("London");
				user1.setStatus("Spring and Spring boot developer");
				
				User user2 = new User();
				
				user2.setName("Priyanshu");
				user2.setCity("USA");
				user2.setStatus("Ruby on rails developer");
				
				ArrayList<User> al = new ArrayList<User>();
				al.add(user1);
				al.add(user2);
				
				Iterable<User> result = userRepository.saveAll(al);
				
				result.forEach(user->{
					System.out.println(user);
				});
		
		*/
		
		
		// Updating the value
		
		/*
				Optional<User> optional = userRepository.findById(2);
				
				User user = optional.get();
				System.out.println(user);
				
				user.setName("Raj");
				
				User result = userRepository.save(user);
				System.out.println(result);
		*/
		
		// Find by Id
		
		/*
		
				Optional<User> optional = userRepository.findById(1);
				
				User user = optional.get();
				System.out.println(user);
		
		*/
		
//		Find all the data
		
		/*
				
				Iterable<User> result = userRepository.findAll();
				
				result.forEach(user->{
					System.out.println(user);
				});
		
		*/
		
		// Deleting the data
		
		/*
		  
				userRepository.deleteById(2);
				
				System.out.println("deleted");
				
		*/
		
		// Deleting all the users
		
		/*
		Iterable<User> allUsers = userRepository.findAll();
		
		userRepository.deleteAll(allUsers);
		
		System.out.println("deleted");
		
		*/
			
			
		// Calling Custom finder methods
		// Finding data by name
		
		/*
				
				List<User> users = userRepository.findByName("Anuradha");
				
				users.forEach(e->{
					System.out.println(e);
				});
		
		*/
		
		// Executing JPQL
		
		/*
		
				List<User> allUser = userRepository.getAllUser();
				
				allUser.forEach(e->{
					System.out.println(e);
				});
		
		*/
		
		// Executing JPQL with parameters
		
		/*
		
				List<User> allUser = userRepository.findByName("Anuradha");
				
				allUser.forEach(e->{
					System.out.println(e);
				});
		
		*/
		
		// Executing native query
		
		List<User> user = userRepository.getUser();
		
		user.forEach(e->{
			System.out.println(e);
		});
		
	}

}
