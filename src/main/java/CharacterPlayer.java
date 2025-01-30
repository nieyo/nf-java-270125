public class CharacterPlayer {

    public static void main(String[] args) {

    }

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static int move(String input) {
        if(input.equals("W")) {
            return 1;
        }
        return 0;
    }
}
