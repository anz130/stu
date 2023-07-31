package sbt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sbt.dao.BookDao;

//如测试类与引导类不在一个包下，需引用class@SpringBootTest(classes = StuSbtWebApplication.class)
@SpringBootTest
class StuSbtWebApplicationTests {
	//1.注入你要测试的对象
	@Autowired
	private BookDao bookdao;
	//2.执行要测试的对象对应的方法

	@Test
	void contextLoads() {
		System.out.println("this is test...");
		bookdao.save();
	}

}
