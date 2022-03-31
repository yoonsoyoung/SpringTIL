package com.example.web.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl implements HelloDao{

	// datasource도 여기다 -> root-context에 bean 작성
	
	
	@Override
	public String greeting() {
		return "안녕하세요~ Dao 입니다. DB에서 보낸다고 가정~";
	}

}
