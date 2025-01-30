import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {
    @Test
    void expect0_whenPlayerInCenter() {
        // GIVEN
        // WHEN
        int expected = 0;
        int actual = CharacterPlayer.getX();
        // THEN
        assertEquals(expected, actual);
    }
}
