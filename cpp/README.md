# C++ Test Execution using Bazel and Google Test

This guide will walk you through running C++ unit tests using Bazel build system and Google Test (gtest) framework.

## Introduction

Welcome to the C++ Test Execution guide! This repository contains coding examples and exercises to help you practice and improve your C++ programming skills.

- The `homework` folder contains coding exercises and assignments for your practice. Feel free to work on them and test your solutions using the methods described in this guide.

- The `templates` folder contains code templates and examples to serve as a reference for different C++ concepts. You can use these templates as a starting point for your own projects and experiments.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

1. Bazel: [Installation Guide](https://docs.bazel.build/versions/main/install.html)
2. Google Test (gtest): [Installation Guide](https://github.com/google/googletest)

## Getting Started

Follow the steps below to execute your C++ tests using Bazel and gtest:

1. Clone the Repository

```
git clone https://github.com/your_username/your_cplusplus_project.git
cd your_cplusplus_project
```

2. Build the project
Use Bazel to build your C++ project, including the unit tests:
```
bazel build //...
```
This command will compile all the C++ code in your project, including the tests.

You must be within your code's working folder to run this.

3. Run the tests
After building the project, execute the tests using the following Bazel command:
```
bazel test //path/to/tests:target_name
```
Replace `path/to/tests` with the directory path where your test files are located and `target_name` with the name of the test target in your BUILD file.

4. View test results
Bazel will run the tests and display the results on the console. You will see a summary of test pass/fail status for each test case.

If you have some errors or see that tests are failing, that indicates that you need to update the code to be correct.