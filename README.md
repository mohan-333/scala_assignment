# Bucketizer

The Bucketizer program allows users to bucketize a list of numerical values into ranges based on a specified bucket size.

## Usage

To use the Bucketizer program, follow these steps:

1. Clone or download the repository to your local machine.
2. Navigate to the directory containing the Bucketizer.scala file.
3. Compile the program using Scala compiler:

    ```bash
    scalac Bucketizer.scala
    ```

4. Run the compiled program:

    ```bash
    scala Bucketizer
    ```

5. Follow the on-screen instructions:

    - Enter the values to be bucketized, separated by commas.
    - Enter the desired bucket size.

6. The program will then bucketize the input values into ranges and display the bucketized values.

## Functionality

The Bucketizer program contains the following functionalities:

- `bucketByRange`: Function to bucketize data by range. It takes an array of numerical values and a bucket size as input and returns a list of strings representing the bucketized ranges.

- `main`: Main function to prompt the user for input values and bucket size, and display the bucketized values.

## Example

Suppose you have the following values to bucketize: 
[12.05, 12.03, 10.33, 11.45, 13.50].

`If you choose a bucket size of 0.05,
the bucketized values will look like this`:

`Enter values to bucketize separated by commas`:

  - 12.05, 12.03, 10.33, 11.45, 13.50

`Enter the bucket size`:
- 0.05

`Bucketized values`:

[10.000-10.049, 11.400-11.449, 12.000-12.049, 12.000-12.049, 13.500-13.549]


# PlayerAnalysis

The PlayerAnalysis program allows users to input player statistics, analyze the data, and display various insights such as the player with the highest run scored, top 5 players by run scored, top 5 players by wickets taken, and ranking of players by overall performance.

## Usage

To use the PlayerAnalysis program, follow these steps:

1. Clone or download the repository to your local machine.
2. Navigate to the directory containing the PlayerAnalysis.scala file.
3. Compile the program using Scala compiler:

    ```bash
    scalac PlayerAnalysis.scala
    ```

4. Run the compiled program:

    ```bash
    scala PlayerAnalysis
    ```

5. Follow the on-screen instructions:

   - Enter player statistics in the format: Year, PlayerName, Country, Matches, Runs, Wickets. Separate each field with commas.
   - Enter 'done' when you have finished entering player statistics.

6. The program will then analyze the input data and display various insights such as the player with the highest run scored, top 5 players by run scored, top 5 players by wickets taken, and ranking of players by overall performance.

## Functionality

The PlayerAnalysis program contains the following functionalities:

- `main`: Main function to prompt the user for input player statistics, analyze the data, and display insights such as the player with the highest run scored, top 5 players by run scored, top 5 players by wickets taken, and ranking of players by overall performance.

## Example

Suppose you have the following player statistics:

- 2021, Sam, India, 23, 2300, 3
- 2021, Ram, India, 23, 300, 30
- 2021, Mano, India, 23, 300, 13

If you input these statistics into the program, you would get the following output:

`Player with the highest run scored`: Sam

`Top 5 players by run scored`:
- Sam: 2300 runs
- Ram: 300 runs
- Mano: 300 runs

`Top 5 players by wickets taken`:
- Ram: 30 wickets
- Mano: 13 wickets
- Sam: 3 wickets

`Players ranked by overall performance`:
- Rank 1: Ram - Overall Performance: 150.0
- Rank 2: Mano - Overall Performance: 76.5
- Rank 3: Sam - Overall Performance: 11.5

## Dependencies

The Bucketizer and PlayerAnalysis programs have no external dependencies and requires only the Scala standard library.

## Author

`Thota Mohan Reddy`
