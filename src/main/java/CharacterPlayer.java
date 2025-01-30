public class CharacterPlayer {
    static int x = 0;
    static int y = 0;

    public static void setX() {
        x = 0;
    }

    public static void setY() {
        y = 0;
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
        if(input.equals("D")) {
            x++;
        }
    }


}
