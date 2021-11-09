package com.springboot.kakao.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.kakao.model.dto.UserDto;
import com.springboot.kakao.model.json.SignInVo;
import com.springboot.kakao.model.json.SignUpVo;

@Mapper
public interface UserDao {
	public int emailCheck(String signUpEmail);
	public int phoneCheck(SignUpVo signUpVo);
	public int signUp(SignUpVo signUpVo);
	public int signIn(SignInVo signInVo);
	public UserDto getUser(String user_email);
}
