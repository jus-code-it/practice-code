#include <gtest/gtest.h>
#include <functional>

// WRITE A LAMBDA FUNCTION THAT DOUBLES THE INPUT NUMBER
const auto doubler = [](int x) { return x; };

// WRITE A LAMBDA FUNCTION THAT ADDS "AY" TO THE INPUT STRING
const auto ay_string = [](const std::string& input_string) { return input_string; };

// WRITE A LAMBDA FUNCTION THAT RETURNS THE NEGATIVE OF THE INPUT NUMBER
const auto negator = [](int x) { return x; };

// Test cases using Google Test (gtest)
TEST(LambdaFunctionTest, TestCase1) {
    // Define the inputs and expected output for a test case
    int input = 5;
    int expectedOutput = 5 * 2;

    // Call the function and check if the output matches the expected output
    int output = doubler(input);
    EXPECT_EQ(expectedOutput, output);
}

TEST(LambdaFunctionTest, TestCase2) {
    // Define the inputs and expected output for a test case
    std::string input = "Hello";
    std::string expectedOutput = "Helloay";

    // Call the function and check if the output matches the expected output
    std::string output = ay_string(input);
    EXPECT_EQ(expectedOutput, output);
}

TEST(LambdaFunctionTest, TestCase3) {
    // Define the inputs and expected output for a test case
    int input = 10;
    int expectedOutput = -10;

    // Call the function and check if the output matches the expected output
    int output = negator(input);
    EXPECT_EQ(expectedOutput, output);
}