package com.ovupark.it.demo.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ovupark.it.demo.user.dao.IUserDao;
import com.ovupark.it.demo.user.service.IUserService;
import com.ovupark.it.demo.user.vo.UserVO;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	public PageInfo<UserVO> findAllUser(Pageable pageable) {
		PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
		List<UserVO> listUser = userDao.findAllUser(pageable);
		PageInfo<UserVO> pageInfo = new PageInfo<UserVO>(listUser);
		return pageInfo;
	}

	@Override
	public void createUser(UserVO userVO) {

		userDao.createUser(userVO);
	}

}
