package com.example.demo.conrtoller;

import com.example.demo.database.Database;
import com.example.demo.model.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    private Database database;

    HomeController(){
        database = Database.getInstance();
    }

    @GetMapping("/")
    public List<Example> index(){
        return database.getExamples();
    }



}
