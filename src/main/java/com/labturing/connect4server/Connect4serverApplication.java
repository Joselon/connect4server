package com.labturing.connect4server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Connect4serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Connect4serverApplication.class, args);
	}

    @GetMapping("/hello/{name}")
    //public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    public String hello(@PathVariable() String name) {
      //return String.format("Hello %s!", name);
      return "Hello " +  name;
    }

}
