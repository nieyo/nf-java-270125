package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    void initial_setCoordinatesToZero() {
        PlayerCharacter.setX(0);
        PlayerCharacter.setY(0);
        // CharacterPlayer.x = 0;
    }

    @Test
    // methodName_givenCondition_expectedBehavior
    void getX_whenPlayerInCenter_returnsZero() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getY_whenPlayerInCenter_returnsZero() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_givenUpInput_increasesYByOne() {
        // GIVEN
        String input = "W";
        int expected = 1;
        // WHEN
        PlayerCharacter.move(input);
        // THEN
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_givenRightInput_increasesXByOne() {
        // GIVEN
        String input = "D";
        int expected = 1;
        // WHEN
        PlayerCharacter.move(input);
        // THEN
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void move_givenDownInput_decreasesYByOne() {
        // GIVEN
        String input = "S";
        int expected = -1;
        // WHEN
        PlayerCharacter.move(input);
        // THEN
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_givenRightInput_decreasesXByOne() {
        // GIVEN
        String input = "A";
        int expected = -1;
        // WHEN
        PlayerCharacter.move(input);
        // THEN
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void move_givenWrongInput_returnsZero() {
        // GIVEN
        String input = "E";
        int expectedX = 0;
        int expectedY = 0;
        // WHEN
        PlayerCharacter.move(input);
        // THEN
        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();
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
            PlayerCharacter.move(movement);
        }
        // THEN
        assertAll(
            () -> Assertions.assertEquals(expectedX, PlayerCharacter.getX()), // Zurück zum Ursprung
            () -> Assertions.assertEquals(expectedY, PlayerCharacter.getY())
        );
    }
}
