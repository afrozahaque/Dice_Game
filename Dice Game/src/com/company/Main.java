package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the dice game. The player who scores 10 first wins the game. Please enter number of players (2 or 3): ");
        int player_number = Integer.parseInt(in.nextLine());

        String[] pl_name = new String[player_number];
        String[] pl_gender = new String[player_number];

        if (player_number > 3 || player_number < 2) {
            System.out.println("Invalid player number. Please choose player between two or three.");
        }
        else {
            for (int i = 0; i < player_number; i++) {
                System.out.println("Enter player " + (i + 1) + " name: ");
                pl_name[i] = in.nextLine();
                System.out.println("Enter player " + (i + 1) + " gender: ");
                pl_gender[i] = in.nextLine();
            }
        }

        int player1_total=0;
        int player2_total=0;
        int player3_total=0;
        int player1_roll=0;
        int player2_roll=0;
        int player3_roll=0;


        switch(player_number) {
            case 2:
                Players player1 = new Players(pl_name[0], pl_gender[0]);
                Players player2 = new Players(pl_name[1], pl_gender[1]);

                while (player1_total<10 && player2_total<10) {
                    player1_roll = player1.roll();
                    player2_roll = player2.roll();
                    System.out.println(pl_name[0] + " scored " + player1_roll);
                    System.out.println(pl_name[1] + " scored " + player2_roll);

                    player1_total = player1_total + player1_roll;
                    player2_total = player2_total + player2_roll;
                }
                if (player1_total>=10) {
                        System.out.println(pl_name[0] + " won the game. Congratulations " + pl_name[0]);
                }
                else {
                    System.out.println( pl_name[1] + " won the game. Congratulations " + pl_name[1]);
                }

                break;
            case 3:

                Players player3 = new Players(pl_name[0], pl_gender[0]);
                Players player4 = new Players(pl_name[1], pl_gender[1]);
                Players player5 = new Players(pl_name[2], pl_gender[2]);

                while (player1_total<10 && player2_total<10 && player3_total<10) {
                    player1_roll = player3.roll();
                    player2_roll = player4.roll();
                    player3_roll = player5.roll();
                    System.out.println(pl_name[0] + " scored " + player1_roll);
                    System.out.println(pl_name[1] + " scored " + player2_roll);
                    System.out.println(pl_name[2] + " scored " + player3_roll);

                    player1_total = player1_total + player1_roll;
                    player2_total = player2_total + player2_roll;
                    player3_total = player3_total + player3_roll;
                }
                if (player1_total>=10) {
                    System.out.println(pl_name[0] + " won the game. Congratulations " + pl_name[0]);
                }
                else if (player2_total>=10) {
                    System.out.println( pl_name[1] + " won the game. Congratulations " + pl_name[1]);
                }
                else {
                    System.out.println( pl_name[2] + " won the game. Congratulations " + pl_name[2]);
                }
                break;
            default:
                System.out.println("Disqualified for entering invalid players number. Best of luck next time.....");
        }

    }
}
