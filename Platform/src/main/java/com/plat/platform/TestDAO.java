package com.plat.platform;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDAO {
	
	@Autowired
	private SqlSession sql;
	
	public int TestDAO(){ return  sql.selectOne("TestDAO"); }

}
