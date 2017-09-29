package com.ovupark.it.demo.user.service;

import org.springframework.data.domain.Pageable;

import com.github.pagehelper.PageInfo;
import com.ovupark.it.demo.user.vo.UserVO;

public interface IUserService {
	
	
	public PageInfo<UserVO> findAllUser(Pageable pageable);
	
	
	public void createUser(UserVO userVO);
}
