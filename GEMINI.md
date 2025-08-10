# GEMINI.md
This file provides guidance to GEMINI when working with code in this repository.

## Commonly Used Commands

### Build
```sh
mvn -B verify
```
This command compiles the source code, runs tests, and packages the application into a WAR file.

### Run Tests
```sh
mvn -B verify
```
This command executes all the tests in the project.

### Run a Single Test
To run a single test class, use the `-Dtest` parameter:
```sh
mvn -B test -Dtest=jp.gr.java_conf.yuta_yoshinaga.reversi.test.ReversiTest
```
To run a single test method, use:
```sh
mvn -B test -Dtest=jp.gr.java_conf.yuta_yoshinaga.reversi.test.ReversiTest#testMethodName
```

## Code Architecture

This project is a Java-based backend for a Reversi game. It follows a Model-View-Controller (MVC) architecture.

*   **Controller (`jp.gr.java_conf.yuta_yoshinaga.reversi.controller`):**
    *   `FrontController.java`: A servlet that handles all incoming HTTP requests from the frontend. It acts as the single entry point for all actions.

*   **Model (`jp.gr.java_conf.yuta_yoshinaga.reversi.model`):**
    *   This package contains the core logic of the Reversi game.
    *   `Reversi.java`: The main class that encapsulates the game's state and rules.
    *   `ReversiPlay.java`: Handles the gameplay mechanics, such as making a move and updating the board.
    *   `ReversiAnz.java`: Analyzes the game board to determine valid moves and game status.
    *   The other classes in this package represent data structures (e.g., `ReversiPoint`, `ReversiHistory`) and handle JSON serialization/deserialization for communication with the frontend (e.g., `CallbacksJson`, `FuncsJson`, `ResJson`).

*   **Test (`jp.gr.java_conf.yuta_yoshinaga.reversi.test`):**
    *   This package contains JUnit tests for the classes in the `model` package.

The application is designed to be stateless from the server's perspective, with the game state being passed back and forth between the client and server using JSON. The server uses the session to store the game state.
