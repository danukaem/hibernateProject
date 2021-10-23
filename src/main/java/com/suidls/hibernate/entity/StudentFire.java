package com.suidls.hibernate.entity;

public class StudentFire {

//    private int id;
    private int age;

    private String name;

    public StudentFire() {
    }


    public StudentFire(  int age, String name) {
        this.age = age;
        this.name = name;
    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
