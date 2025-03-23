# Football Project

## Overview

The Football Project is a Java-based application that simulates a football tournament. It includes features for managing teams, players, matches, and standings. The project uses various data structures such as linked lists, binary search trees (BST), hash tables, queues, and stacks to efficiently manage and process the data.

## Features

- **Team and Player Management**: Add, remove, and search for teams and players.
- **Match Simulation**: Simulate matches between teams with random scoring.
- **Tournament Management**: Handle group stages and knockout stages, including scheduling matches and calculating standings.
- **Data Structures**: Utilize linked lists, BSTs, hash tables, queues, and stacks for efficient data management.
- **Ranking and Statistics**: Display team rankings and top scorers.

## Project Structure

The project is organized into several classes, each responsible for different aspects of the tournament:

- **`Group`**: Manages a group of teams, schedules matches, and calculates standings.
- **`GroupStage`**: Manages the group stage of the tournament, including creating groups and scheduling matches.
- **`Hashtable`**: Implements a simple hash table to store and manage teams and players.
- **`League`**: Manages the league, including team and player ranking, adding teams and players, and displaying league standings.
- **`LinkedList`**: A linked list that stores players, allowing operations like adding, deleting, and selecting players.
- **`Match`**: Represents a football match between two teams, with the ability to calculate scores and update player statistics.
- **`Node`**: Represents a node in a data structure, such as a linked list or stack, containing references to a player, match, or teams.
- **`Player`**: Represents a football player, with attributes such as name, ID, position, and goals scored.
- **`PlayerBST`**: A binary search tree specifically for storing and managing players.
- **`Queue`**: A queue data structure for managing scheduled football matches.
- **`Stack`**: A stack data structure used for maintaining the history of football matches.
- **`Team`**: Represents a football team, including its players, team details, and the points and goal difference the team has accumulated.
- **`TeamBST`**: A binary search tree specifically for storing and managing teams.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA or any other Java IDE

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/OzgunKasapoglu/Football_Project.git
    ```
2. Open the project in your IDE.

### Running the Project

1. Navigate to the `src/Football_Project` directory.
2. Run the `Main` class to start the application.

### Usage

- **Adding Teams and Players**: Use the `Team` and `Player` classes to create and add teams and players to the tournament.
- **Simulating Matches**: Use the `Match` class to simulate matches between teams.
- **Managing Tournament**: Use the `GroupStage` and `League` classes to manage the group stages and overall league.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.

## Acknowledgements

- Thanks to all contributors and the open-source community for their support.

## Contact

For any questions or suggestions, please contact me at ozgun__2000@hotmail.com.
