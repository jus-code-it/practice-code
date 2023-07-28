import unittest

# Complete the my_for_loop_function below so that given a number, n, you repeat the phrase given that number of times.
# You should also increment the count variable so that we can properly check your code.

def my_while_loop_function(n):
    # DO NOT EDIT THIS CODE
    output = []

    # INITIALIZE A COUNTER VARIABLE HERE
    # WRITE WHILE LOOP AND CONDITION STATEMENT ON THIS LINE
        if _ == 0 or _ >= 4:
            phrase = "Hello for the {}th time".format(_)
        elif _ == 1:
            phrase = "Hello for the {}st time".format(_)
        elif _ == 2:
            phrase = "Hello for the {}nd time".format(_)
        elif _ == 3:
            phrase = "Hello for the {}rd time".format(_)
        
        output.append(phrase) # Appending phrase to list here
        # INCREMENT COUNTER VARIABLE HERE

    return output

# DO NOT EDIT THIS CODE
class TestStudentCode(unittest.TestCase):

    def test_case1(self):
        # Define the inputs and expected output for a test case
        input = 5
        expected_output = [
            "Hello for the 0th time",
            "Hello for the 1st time",
            "Hello for the 2nd time",
            "Hello for the 3rd time",
            "Hello for the 4th time"
        ]

        # Call the function or create an instance of the class
        output = my_while_loop_function(input)

        # Use assert methods to check if the output matches the expected output
        self.assertListEqual(output, expected_output)

unittest.main()

