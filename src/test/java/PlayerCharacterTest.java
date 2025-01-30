import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    void setValues() {
        CharacterPlayer.setX();
        CharacterPlayer.setY();
        // CharacterPlayer.x = 0;
    }

    @Test
    void expectX0_whenPlayerInCenter() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = CharacterPlayer.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void expectY0_whenPlayerInCenter() {
        // GIVEN
        // WHEN
        int expected = 0;
        int actual = CharacterPlayer.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void expectY1_whenPlayerMovesUp() {
        // GIVEN
        String input = "W";
        int expected = 1;
        // WHEN
        CharacterPlayer.move(input);
        // THEN
        int actual = CharacterPlayer.getY();
        assertEquals(expected, actual);
    }

    @Test
    void expectX1_whenPlayerMovesRight() {
        // GIVEN
        String input = "D";
        int expected = 1;
        // WHEN
        CharacterPlayer.move(input);
        // THEN
        int actual = CharacterPlayer.getX();
        assertEquals(expected, actual);
    }

    @Test
    void expectYMinus1_whenPlayerMovesDown() {
        // GIVEN
        String input = "S";
        int expected = -1;
        // WHEN
        CharacterPlayer.move(input);
        // THEN
        int actual = CharacterPlayer.getY();
        assertEquals(expected, actual);
    }
}
