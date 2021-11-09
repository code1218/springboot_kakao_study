package com.springboot.kakao.model.json;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class NoticeVo {
	private String notice_title;
	private String notice_writer;
	private MultipartFile[] file;
	private String notice_content;
	
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_writer() {
		return notice_writer;
	}
	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}
	public MultipartFile[] getFile() {
		return file;
	}
	public void setFile(MultipartFile[] file) {
		this.file = file;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	@Override
	public String toString() {
		return "NoticeVo [notice_title=" + notice_title + ", notice_writer=" + notice_writer + ", file="
				+ Arrays.toString(file) + ", notice_content=" + notice_content + "]";
	}
	
}
