package lambdas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static lambdas.MyLambdas.*;

public class MyLambdasTest {
    @Test
    void testCase1() {
        // Define the inputs and expected output for a test case
        int input = 5;
        int expectedOutput = 5 * 2;

        // Call the function and check if the output matches the expected output
        int output = doubler.run(input);
        assertEquals(expectedOutput, output);
    }

    @Test
    void testCase2() {
        // Define the inputs and expected output for a test case
        String input = "Hello";
        String expectedOutput = "Helloay";

        // Call the function and check if the output matches the expected output
        String output = ayString.run(input);
        assertEquals(expectedOutput, output);
    }

    @Test
    void testCase3() {
        // Define the inputs and expected output for a test case
        int input = 10;
        int expectedOutput = -10;

        // Call the function and check if the output matches the expected output
        int output = negator.run(input);
        assertEquals(expectedOutput, output);
    }

}
