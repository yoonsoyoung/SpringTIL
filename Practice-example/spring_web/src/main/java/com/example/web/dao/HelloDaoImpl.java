package com.example.web.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl implements HelloDao{

	// datasource�� ����� -> root-context�� bean �ۼ�
	
	
	@Override
	public String greeting() {
		return "�ȳ��ϼ���~ Dao �Դϴ�. DB���� �����ٰ� ����~";
	}

}
