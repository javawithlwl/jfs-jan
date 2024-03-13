package com.careerit.jfs.oop.abstractexample;

import java.util.Scanner;

sealed abstract class Game permits Car, Bike, Ship{
    public void start(){
        System.out.println("You have started the game "+this.getClass().getSimpleName());
    }
    public abstract void play();
    public void stop(){
        System.out.println("You have stopped the game "+this.getClass().getSimpleName());
    }
}
final class Car extends Game{
    public void play(){
        System.out.println("You are playing the game "+this.getClass().getSimpleName()+", Please wear seat belt and drive safely");
    }

}
final class Bike extends Game{
    @Override
    public void play(){
        System.out.println("You are playing the game "+this.getClass().getSimpleName()+", Please wear helmet and drive safely");
    }
}

final class Ship extends Game{
    @Override
    public void play(){
        System.out.println("You are playing the game "+this.getClass().getSimpleName()+", Please wear life jacket and drive safely");
    }
}
public class GameManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Car 2. Bike 3. Ship 4.Exit");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            if (ch == 4) {
                System.out.println("Thanks for playing the game");
                System.exit(0);
            }
            Game game = getGame(ch);
            game.start();
            game.play();
            game.stop();
            System.out.println("Do you want to play again (yes/no):");
            String option = sc.next();
            if(option.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing the game");
                System.exit(0);
            }
        }
    }

    public static Game getGame(int ch){
       return switch (ch) {
            case 1 -> new Car();
            case 2 -> new Bike();
            case 3 -> new Ship();
            default -> throw new IllegalArgumentException("Invalid choice");
        };
    }
}
