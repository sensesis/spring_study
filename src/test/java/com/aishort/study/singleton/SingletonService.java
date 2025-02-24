package com.aishort.study.singleton;

public class SingletonService {

    private static final SingletonService instanse = new SingletonService();

    public static SingletonService getInstance() {
        return instanse;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
