package com.ovupark.it.demo.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ovupark.it.demo.user.dao.IUserDao;
import com.ovupark.it.demo.user.service.IUserService;
import com.ovupark.it.demo.user.vo.UserVO;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	public List<UserVO> findAllUser(Pageable pageable) {
		return userDao.findAllUser(pageable);
	}

	@Override
	public void createUser(UserVO userVO) {

		userDao.createUser(userVO);
	}

}
