#include <iostream>
#include <string>
#include <gtest/gtest.h>

std::vector<std::string> my_for_loop_function(int n) {
    std::vector<std::string> output;

    // WRITE FOR LOOP ON THIS LINE
    for (int i = 0; i < n; i++) {
        std::string phrase;
        if (i == 0 || i >= 4) {
            phrase = "Hello for the " + std::to_string(i) + "th time";
        } else if (i == 1) {
            phrase = "Hello for the " + std::to_string(i) + "st time";
        } else if (i == 2) {
            phrase = "Hello for the " + std::to_string(i) + "nd time";
        } else if (i == 3) {
            phrase = "Hello for the " + std::to_string(i) + "rd time";
        } else {
            phrase = ""; // Handle other cases if needed
        }

        output.push_back(phrase); // Appending phrase to vector here
    }

    return output;
}

// Define test cases using Google Test (gtest)
TEST(MyForLoopTest, TestCase1) {
    // Define the inputs and expected output for a test case
    int input = 5;
    std::vector<std::string> expectedOutput = {
        "Hello for the 0th time",
        "Hello for the 1st time",
        "Hello for the 2nd time",
        "Hello for the 3rd time",
        "Hello for the 4th time"
    };

    // Call the function and check if the output matches the expected output
    std::vector<std::string> output = my_for_loop_function(input);
    EXPECT_EQ(expectedOutput, output);
}

// Add more test cases as needed

// Main function to run the tests
int main(int argc, char** argv) {
    testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}