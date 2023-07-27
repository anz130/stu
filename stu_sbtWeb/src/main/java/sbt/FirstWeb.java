package sbt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstWeb {
	@RequestMapping("/first")
	public String first() {
		System.out.println("this is first run...change-this");
		return "first spb";
	}

}
