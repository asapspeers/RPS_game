package com.company.week1reviewexercise;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public int startGame(){
        Scanner scanner = new Scanner(System.in);

        //start game

        //create a variable to hold the user reponse using the Scanner object. The response needs to be an integer between 1-3 (1 = Rock, 2 = Paper, 3 = Scissors)
        int userResponse = scanner.nextInt();
        // create a variable to hold the cpu response generated by the getCPUResponse() method.
        int CPUResponse = getCPUResponse();
        Rock rock ;
        Paper paper;
        Scissors scissors;


        //compare user and cpu response with each other to decide the winner.
        return CPUResponse;
    }

    public int getCPUResponse(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        // Generate random integers in range 1 to 3

        return randomNum;
    }
}
