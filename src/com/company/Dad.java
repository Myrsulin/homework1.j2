package com.company;

public class Dad extends Famaly{
    private int Dad;

    public Dad(int age, String name, Habit habit, int dad) {
        super(age, name, habit);
        Dad = dad;
    }
    public String hobby(String hobby){
        return " Hobby";
    }
    public String jk(String jk){
        return " DD";
    }
    public final String game(){
        return " Game";
    }

}
