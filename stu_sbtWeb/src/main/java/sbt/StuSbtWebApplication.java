package sbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import sbt.controller.BookController;



@SpringBootApplication
public class StuSbtWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(StuSbtWebApplication.class, args);
		BookController bean=ctx.getBean(BookController.class);
		System.out.println("bean==>"+bean);
		User user=ctx.getBean(User.class);
		System.out.println("userbena===>"+user);
	}

}
