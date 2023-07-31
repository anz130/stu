package sbt.controller;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbt.MyDataSource;
import sbt.domain.Book;

@RestController
@RequestMapping("/books")
public class BookController {
	
	//定义读取yml配置文件的环境变量
	@Autowired
	private Environment env;
	//定义读取配置文件中类的变量
	@Autowired
	private MyDataSource MyDataSource;
	
	@GetMapping("/{id}")
	public String getById(Integer id) {
		System.out.println("book getById..."+id);
		System.out.println("==lseson=>"+env.getProperty("lesson"));
		System.out.println("==name=>"+env.getProperty("enterprise.name"));
		System.out.println("==age=>"+env.getProperty("enterprise.age"));
		System.out.println("==arr=>"+env.getProperty("likes[1]"));
		System.out.println("-----------------------------------------");
		System.out.println("yml==datasource=>"+MyDataSource);
		return "{'module':'book getByid'}";
	}
	
	
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public String save(Book book) {
		System.out.println("book save..."+book);
		return "{'module':'book save'}";
	}
	
	//@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	@DeleteMapping("/{id}")
	public String delete(Integer id) {
		System.out.println("book delete..."+id);
		return "{'module':'book delete'}";
	}
	
   @PutMapping
	public String update(Book book) {
		System.out.println("book update..."+book);
		return "{'module':'book update'}";
	}
	

	@GetMapping
	public String getAll() {
		System.out.println("book getall...");
		return "{'module':'book getall'}";
	}
	
	

}

