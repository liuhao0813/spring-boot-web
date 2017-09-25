package com.ovupark.it.demo.user.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.ovupark.it.demo.user.vo.UserVO;

public interface IUserService {
	
	public List<UserVO> findAllUser(Pageable pageable);
	
	
	public void createUser(UserVO userVO);
}
