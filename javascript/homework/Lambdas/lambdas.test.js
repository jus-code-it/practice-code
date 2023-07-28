const {doubler, ay_string, negator}= require("./lambdas");

// Test cases using Jest
test('Test Case 1', () => {
  // Define the inputs and expected output for a test case
  const input = 5;
  const expectedOutput = 5 * 2;

  // Call the function and check if the output matches the expected output
  const output = doubler(input);
  expect(output).toEqual(expectedOutput);
});

test('Test Case 2', () => {
  // Define the inputs and expected output for a test case
  const input = 'Hello';
  const expectedOutput = 'Helloay';

  // Call the function and check if the output matches the expected output
  const output = ay_string(input);
  expect(output).toEqual(expectedOutput);
});

test('Test Case 3', () => {
  // Define the inputs and expected output for a test case
  const input = 10;
  const expectedOutput = -10;

  // Call the function and check if the output matches the expected output
  const output = negator(input);
  expect(output).toEqual(expectedOutput);
});