package whileLoops;
import org.junit.jupiter.api.Test;

import static whileLoops.MyWhileLoopFunction.myWhileLoopFunction;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class MyWhileLoopFunctionTest {
    @Test
    void testCase1() {
        // Define the inputs and expected output for a test case
        int input = 5;
        String[] expectedOutput = {
                "Hello for the 0th time",
                "Hello for the 1st time",
                "Hello for the 2nd time",
                "Hello for the 3rd time",
                "Hello for the 4th time"
        };

        // Call the function and check if the output matches the expected output
        String[] output = myWhileLoopFunction(input);

        assertArrayEquals(output, expectedOutput);
    }

}