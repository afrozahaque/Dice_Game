package com.company;

public class Players {
    String player_name;
    int player_age;
    String player_gender;

    public Players(String name, int age, String gender){
        this.player_name = name;
        this.player_age = age;
        this.player_gender = gender;
    }

    public Players(String name, String gender) {
        this.player_name = name;
        this.player_gender = gender;
    }

    public int roll(){
        //return random numbers from 1 to 6
        return ((int) (Math.random()*(6-1)))+1;
    }
}
