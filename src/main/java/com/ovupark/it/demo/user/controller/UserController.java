package com.ovupark.it.demo.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String findAllUser(HttpServletRequest request, @SortDefault("username") Pageable pageable){
		
		List<UserVO> listUser = userServiceImpl.findAllUser(pageable);
		request.setAttribute("users", listUser);
		
		return "user/list-user";
	}
	
	@GetMapping("/add_user")
	public String addUser() {
		return "user/add_user";
	}
	
	@PostMapping("/save")
	public String saveUser(UserVO userVO) {
		userServiceImpl.createUser(userVO);
		return "redirect:list";
	}
	
}