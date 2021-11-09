package com.springboot.kakao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.kakao.service.NoticeService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private NoticeService noticeService;
	
	@DeleteMapping("notice-delete1/{notice_code}")
	public String delete(@PathVariable Long notice_code) {
		System.out.println(notice_code);
		return "test";
	}
}
