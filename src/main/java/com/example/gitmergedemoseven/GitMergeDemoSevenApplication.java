package com.example.gitmergedemoseven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitMergeDemoSevenApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitMergeDemoSevenApplication.class, args);
        System.out.println("111");
    }
    public void hello(){
        System.out.println("hello");
    }
    public void helloOne(){
        System.out.println("222");
    }
    public void helloTwo(){

    }
}
