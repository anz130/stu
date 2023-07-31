package sbt.dao.impl;

import org.springframework.stereotype.Repository;

import sbt.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao{
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("book dao is running");
	}

}
