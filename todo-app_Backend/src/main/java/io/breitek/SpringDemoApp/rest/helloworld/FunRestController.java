package io.breitek.SpringDemoApp.rest.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FunRestController {

	@Value("${name}")
	private String name;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello, " + name;
	}
	
	@GetMapping(path = "/hello-world")
	public HelloWorldBean helloWorld() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path = "/hello-world-var/{name}")
	public HelloWorldBean helloWorldWithVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
