# Fixture Generator

This program generates fixtures for a league with provided team names.

## Features

- Supports even and odd numbers of teams.
- Implements a double round-robin algorithm for fair fixture generation.

## How to Use

1. Run the `Main` class.
2. Enter the number of teams in the league.
3. Provide the names of the teams.
4. The program will generate and display the fixtures.

## Example (5 Teams)

For 5 teams:

```bash 
Round 1
Team 1 vs Team 5
Team 2 vs Team 4
Team 3 (Bye)

Round 2
Team 5 vs Team 3
Team 4 vs Team 1
Team 2 (Bye)

Round 3
Team 1 vs Team 2
Team 3 vs Team 4
Team 5 (Bye) 
```