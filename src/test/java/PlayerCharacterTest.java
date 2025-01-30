import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    void initial_setCoordinatesToZero() {
        CharacterPlayer.setX();
        CharacterPlayer.setY();
        // CharacterPlayer.x = 0;
    }

    @Test
    // methodName_givenCondition_expectedBehavior
    void getX_whenPlayerInCenter_returnsZero() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = CharacterPlayer.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getY_whenPlayerInCenter_returnsZero() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = CharacterPlayer.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_givenUpInput_increasesYByOne() {
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
    void move_givenRightInput_increasesXByOne() {
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
    void move_givenDownInput_decreasesYByOne() {
        // GIVEN
        String input = "S";
        int expected = -1;
        // WHEN
        CharacterPlayer.move(input);
        // THEN
        int actual = CharacterPlayer.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_givenRightInput_decreasesXByOne() {
        // GIVEN
        String input = "A";
        int expected = -1;
        // WHEN
        CharacterPlayer.move(input);
        // THEN
        int actual = CharacterPlayer.getX();
        assertEquals(expected, actual);
    }

    @Test
    void move_givenWrongInput_returnsZero() {
        // GIVEN
        String input = "E";
        int expectedX = 0;
        int expectedY = 0;
        // WHEN
        CharacterPlayer.move(input);
        // THEN
        int actualX = CharacterPlayer.getX();
        int actualY = CharacterPlayer.getY();
        assertAll(
            () -> assertEquals(expectedX, actualX),
            () -> assertEquals(expectedY, actualY)
        );
    }

    @Test
    void move_givenMultipleInputs_updatesCoordinatesCorrectly() {
        // GIVEN
        int expectedX = -2;
        int expectedY = 1;
        String[] movements = {"W", "A", "D", "A", "S", "A", "W"};
        // WHEN
        for (String movement : movements) {
            CharacterPlayer.move(movement);
        }
        // THEN
        assertAll(
            () -> assertEquals(expectedX, CharacterPlayer.getX()), // Zurück zum Ursprung
            () -> assertEquals(expectedY, CharacterPlayer.getY())
        );
    }
}
