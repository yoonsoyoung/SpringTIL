package com.practice.doeat.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Entity(name="board")
@DynamicInsert
public class Board {
	
	int seq; // 글 번호
	String title; // 글 제목
	String content; // 내용
	String category; // 분류
	int uid; // 작성자 고유id
	String indate; // 작성일
	String lastdate; // 수정일
	
	
}
