import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {
    @Test
    void expectX0_whenPlayerInCenter() {
        // GIVEN
        // WHEN
        int expected = 0;
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
}
