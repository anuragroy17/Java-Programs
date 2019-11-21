package com.anuragroy.initial;

public class PlayingCat {
    public static void main(String[] args) {

        boolean cond=isCatPlaying(true,10);
        System.out.println("Is the cat playing? Ans: "+cond);
        cond=isCatPlaying(false,36);
        System.out.println("Is the cat playing? Ans: "+cond);
        cond=isCatPlaying(false,35);
        System.out.println("Is the cat playing? Ans: "+cond);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean scenario=summer;
        if (scenario==false){
            if(temperature>=25 && temperature<=35) {
                scenario = true;
                return true;
            }
            else
                return scenario;
        }else if(scenario) {
            if(temperature>=25 && temperature<=45)
                return scenario;
            else {
                scenario = false;
                return scenario;
            }
        }
        return scenario;
    }
}
