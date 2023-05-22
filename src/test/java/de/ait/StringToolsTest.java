package de.ait;

import jdk.jfr.Name;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {

    @Nested
    @Name("Test FirstToUpperCaseTest")
    class ForFirstToUpperCaseTest {
        @Test
        @Name("Test 1 of 3: class StringTools, method firstToUpperCase")
        public void firstToUpperCase_bob_BobReturned() {
            //arrange
            // action
            String actual = StringTools.firstToUpperCase("bob");
            //assert
            String expected = "Bob";
            assertEquals(expected, actual);
        }

        @Test
        @Name("Test 2 of 3: class StringTools, method firstToUpperCase")
        public void firstToUpperCase_Ivan_IvanReturned() {
            //arrange
            // action
            String actual = StringTools.firstToUpperCase("Ivan");
            //assert
            String expected = "Ivan";
            assertEquals(expected, actual);
        }
        @Test
        @Name("Test 3 of 3: class StringTools, method firstToUpperCase")
        public void firstToUpperCase_spaceBeforemama_MamaReturned() {
            //arrange
            //action
            String actual = StringTools.firstToUpperCase(" mama");
            //assert
            String expected = "Mama";
            assertEquals(expected, actual);
        }


    }

    @Nested
    @Name("Test isStartingFromCapital")
    class IsStartingFromCapital{

        @Test
        @Name("Test 1 of 2: class StringTools, method isStartingFromCapital")
        public void isStartingFromCapital_Ivan_TrueReturned() {
            //arrange
            // action
            Boolean actual = StringTools.isStartingFromCapital("Ivan");
            //assert
            Boolean expected = true;
            assertEquals(expected, actual);
        }

        @Test
        @Name("Test 2 of 2: class StringTools, method isStartingFromCapital")
        public void isStartingFromCapital_ivan_FalseReturned() {
            //arrange
            // action
            Boolean actual = StringTools.isStartingFromCapital("ivan");
            //assert
            Boolean expected = false;
            assertEquals(expected, actual);
        }

    }


}