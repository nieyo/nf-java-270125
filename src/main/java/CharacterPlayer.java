public class CharacterPlayer {
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
    }


}
