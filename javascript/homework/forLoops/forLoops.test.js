const myForLoopFunction = require("./forLoops");

// Test cases using Jest
test('Test Case 1', () => {
// Define the inputs and expected output for a test case
const input = 5;
const expectedOutput = [
    'Hello for the 0th time',
    'Hello for the 1st time',
    'Hello for the 2nd time',
    'Hello for the 3rd time',
    'Hello for the 4th time',
];

// Call the function and check if the output matches the expected output
const output = myForLoopFunction(input);
expect(output).toEqual(expectedOutput);
});