package com.ovupark.it.demo.user.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.ovupark.it.demo.user.vo.UserVO;

public interface IUserDao {

	public List<UserVO> findAllUser(Pageable pageable);

	public void createUser(UserVO userVO);

}
