package com.company;

public class Main {

    public static void main(String[] args) {
	Dad objectA = new Dad(30, "John", Habit.SMOKES,65);
        System.out.println(objectA.hobby("Курить"));
        System.out.println(objectA.game());


        Sun objectB = new Sun(15,"Bob", Habit.GAMES,30);
        System.out.println(objectB.hobby("Играть"));
        System.out.println(objectB.jk(" <бегать"));


        Sun objectC= new Sun(15,"Bob", Habit.GAMES,30);
        System.out.println(objectC.hobby(" Учится"));




    }
}
