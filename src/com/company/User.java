package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {

        if(name.length()>5){
            throw new IllegalNameLengthException("IllegalNameException");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException  {
        if(age<0||age>100){
            throw new IllegalAgeException("Неправильный возрост");
        }
        this.age = age;
    }
//    public void getInfo(String name, int age){
//        System.out.println("User: "+name +" "+"Age: "+age);
//    }
}
