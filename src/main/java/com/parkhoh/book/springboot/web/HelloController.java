package com.parkhoh.book.springboot.web;

import com.parkhoh.book.springboot.web.dto.HelloResponsesDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponsesDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponsesDto(name, amount);
    }

}
