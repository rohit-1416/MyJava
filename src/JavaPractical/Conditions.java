package JavaPractical;

import java.util.*;
class Conditions{
    public static void main(String[]args) {
        int score = 160;
        String ground = "wankhede";

        if (score > 150) {
            System.out.println("Good Score on" + ground + " " + score);
            score = 140;
        }
        if (ground.equals("wankhede")) { //.equlals for str comparision
            System.out.println(score + " Changed");
            ground = "pune";

        }
        System.out.println(score + " " + ground);
        score = 160;
        switch (score) {
            case 140:
                System.out.println("Bad Score");
                break;
            case 150:
                System.out.println("Better Score");
                break;
            case 160:
                System.out.println("Best Score");
                break;
            default: // to be executed if all cases not match
                System.out.println("Let it be");
        }
    }

}