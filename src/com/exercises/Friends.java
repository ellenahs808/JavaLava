package com.exercises;

import java.util.*;


public class Friends {

    private String name;
    private int age;
    private char sex;

    Friends(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public char getSex() { return this.sex ;}

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSex(char sex) { this.sex = sex; }




    public static void main(String[] args) {

        List<Friends> allFriends = Arrays.asList(
                new Friends("Sherry", 28, 'F'),
                new Friends("Chris", 33, 'M'),
                new Friends("Lea", 20, 'F'),
                new Friends("JD", 45, 'M'),
                new Friends("Abby", 23, 'F'),
                new Friends("Mikko", 19, 'M'),
                new Friends("Gayle", 20, 'F')
        );



    }


    public static Map<List> femalePower(List<String>) {
//        Map<List, >
    }

}
