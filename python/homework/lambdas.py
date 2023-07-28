import unittest

# WRITE A LAMBDA FUNCTION THAT DOUBLES THE INPUT NUMBER
doubler = lambda x : x # Fix the expression to the right of the ":"

# WRITE A LAMBDA FUNCTION THAT ADDS "AY" TO THE INPUT STRING
ay_string = lambda input_string : input_string # Fix the expression to the right of the ":"

# WRITE A LAMBDA FUNCTION THAT RETURNS THE NEGATIVE OF THE INPUT NUMER
negator = lambda x : 0 # # Fix the expression to the right of the ":"

# DO NOT EDIT THIS CODE
class TestStudentCode(unittest.TestCase):

    def test_case1(self):
        # Define the inputs and expected output for a test case
        input = 5
        expected_output = 5 * 2

        # Call the function or create an instance of the class
        output = doubler(input)

        # Use assert methods to check if the output matches the expected output
        self.assertEqual(output, expected_output)
    
    def test_case2(self):
        # Define the inputs and expected output for a test case
        input = "Hello"
        expected_output = "Helloay"

        # Call the function or create an instance of the class
        output = ay_string(input)

        # Use assert methods to check if the output matches the expected output
        self.assertEqual(output, expected_output)

    def test_case3(self):
        # Define the inputs and expected output for a test case
        input = 10
        expected_output = -10

        # Call the function or create an instance of the class
        output = negator(input)

        # Use assert methods to check if the output matches the expected output
        self.assertEqual(output, expected_output)

unittest.main()