package org.example.module1_java;

public class PlayerCharacter {
    static int x = 0;
    static int y = 0;

    public static void setX(int newX) {
        x = newX;
    }

    public static void setY(int newY) {
        y = newY;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String input) {

        switch (input) {
            case "W" -> y++;
            case "S" -> y--;
            case "D" -> x++;
            case "A" -> x--;
        }

        /*
        if(input.equals("W")) {
            y++;
        }
        if(input.equals("S")) {
            y--;
        }
        if(input.equals("A")) {
            x--;
        }
        if(input.equals("D")) {
            x++;
        }
         */
    }


}
