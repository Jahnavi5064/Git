package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.ModelEntity;
import com.demo.repository.ModelRepository;


	@RestController
	@RequestMapping ("/User")
	public class ModelController {
		@Autowired
		private ModelRepository UserRepo;
//		@PostMapping("/saveUser")
//		public String saveStudents(@RequestBody ProductEntity user)
//		{
//			ProductEntity save = UserRepo.save(user);
//			if(save!=null)
//			{
//				return "your registration was success";
//			}
//			else
//			{
//				return "your registration was un success";
//			}
//		}
//		
//		@GetMapping("/verifylogin/{email}/{password}")
//		public String verifylogin(@PathVariable String email,@PathVariable String password)
//	{
//		System.out.println(email);
//		ProductEntity user=UserRepo.findByEmail(email);
//		if(user!=null)
//		{
//			if(user.getEmail().equals (email)&& user.getPassword().equals(password))
//			{
//				return "Successfully login";
//			}
//			else
//			{
//				return "login was unsuccessfull! failed please enter valid username and password";
//			}
//		}
//		else
//		{
//			return "login was failed enter valid user name:";
//			
//			
//			}
//		}
		@GetMapping("/Data")
		public List<ModelEntity> getUsers()
		{
			List<ModelEntity> u = UserRepo.findAll();
			return u;
		}
	}


