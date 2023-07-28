# Unilearn Software Engineer Practice

![Coding Material](/uc_github_banner.png)

Welcome to the Coding Material repository! This repository contains coding exercises and examples in C++, Java, JavaScript, and Python to help you practice and improve your programming skills.

## Table of Contents
- [Introduction](#introduction)
- [Getting Started](#getting-started)
  - [Forking the Repository](#forking-the-repository)
  - [Setting up Remote Connection](#setting-up-remote-connection)
- [Languages](#languages)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This repository is designed to provide you with a collection of coding problems and examples in various programming languages. Each language folder contains exercises and projects organized by difficulty level, allowing you to progress at your own pace.

Feel free to explore, contribute, and use this material as a valuable resource to enhance your programming skills.

## Getting Started

To get started, you need to fork this repository and set up a remote connection to your own GitHub account. Follow the instructions below to begin:

### Forking the Repository

1. Click on the "Fork" button at the top right corner of this repository. This action will create a copy of this repository in your GitHub account.

2. Once the forking process is complete, you will be redirected to your own forked repository.

### Setting up Remote Connection

Now that you have your forked repository, follow these steps to set up a remote connection:

1. Open a terminal or command prompt on your local machine.

2. Clone your forked repository to your local machine using the following command and replace `your_username` with your actual GitHub username:

```
git clone https://github.com/your_username/coding-material.git
```
3. Navigate to the repository directory:
```
cd coding-material
```
4. Add a remote link to the original repository to keep your fork updated and replace `original_owner` with the username of the original repository:
```
git remote add upstream https://github.com/original_owner/coding-material.git
```
5. Verify the remote connection by running:
```
git remote -v
```
You should be able to see both `origin` (your fork) and `upstream` (original repository) listed.

Now you are all set up to work with the coding material! You can pull updates from the original repository to your forked version using:
```
git pull upstream main
```

Remember to create a new branch everytime you want to create a new feature! You can do this by running:
```
git checkout -b feature-name
```

## Languages
Currently, this repository includes coding examples and exercises in the following programming languages:
- Python
- JavaScript
- Java
- C++

Each language folder contains subdirectories for different topics and difficulty levels. Feel free to explore and choose the language you want to practice.

## Contributing
Contributions to this coding material repository are welcome! If you have any coding exercises, examples, or improvements, please feel free to create a pull request. Your contributions will help make this repository a valuable resource for all students.

## License
This repository is licensed under the MIT License.
