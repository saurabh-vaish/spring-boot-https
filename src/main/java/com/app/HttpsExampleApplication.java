package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class HttpsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpsExampleApplication.class, args);
	}

	record Test(String name,String password){}

	List<Test> list = new ArrayList<>();

	@GetMapping("/")
	public String hello() {
		return "enabled https in application";
	}

	@PostMapping("/save")
	public Test save(@RequestBody Test test) {
		System.out.println(test);
		list.add(test);
		return test;
	}

	@GetMapping("/data")
	public List<Test> getData() {
		return list;
	}

}
