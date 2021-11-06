package com.company;

public class Famaly {
    private int age;
    private String name;
    private Habit habit;

    public Famaly(int age, String name, Habit habit) {
        this.age = age;
        this.name = name;
        this.habit = habit;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Habit getHabit() {
        return habit;
    }
    private String getInfo(){
        return "Age " + age + " Name " + name;
    }
}
