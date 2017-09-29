package com.ovupark.it.demo.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ovupark.it.demo.user.service.IUserService;
import com.ovupark.it.demo.user.vo.UserVO;


@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private IUserService userServiceImpl;
	
	
	@GetMapping("/list-user")
	public String findAllUser(HttpServletRequest request,@ModelAttribute UserVO userVO,@PageableDefault(size=10,page=1) Pageable pageable){
		
		request.setAttribute("users", userServiceImpl.findAllUser(pageable));
		return "user/list-user";
	}
	
	@GetMapping("/add-user")
	public String addUser() {
		return "user/add-user";
	}
	
	@PostMapping("/register")
	public String saveUser(@ModelAttribute UserVO userVO) {
		userServiceImpl.createUser(userVO);
		return "index";
	}
	
}
