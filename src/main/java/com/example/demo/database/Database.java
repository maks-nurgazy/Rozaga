package com.example.demo.database;

import com.example.demo.model.Example;
import com.example.demo.model.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database instance;

    private List<Example> examples;

    private Database() {
        examples = new ArrayList<>();
        initData();
    }


    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }


    private void initData() {

        UserInfo userInfo = UserInfo.builder()
                .userId(6)
                .userLogin("bakyt_sh")
                .userPassword( "4756435")
                .userStatus("coach")
                .build();


        Example example = Example.builder()
                .coachId(1)
                .coachKod("1104.05053")
                .coachName("Bakyt")
                .coachSurname("Sharshembaev")
                .userInfo(userInfo)
                .build();

        examples.add(example);



        UserInfo maksInfo = UserInfo.builder()
                .userId(4)
                .userLogin("maksnurgazy")
                .userPassword( "roza004")
                .userStatus("student")
                .build();


        Example maks = Example.builder()
                .coachId(1)
                .coachKod("1704.01020")
                .coachName("Maksatbek")
                .coachSurname("Bolushov")
                .userInfo(maksInfo)
                .build();

        examples.add(maks);


    }

    public List<Example> getExamples(){
        return examples;
    }

}
