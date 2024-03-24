import scala.io.StdIn

// Define a case class to represent player statistics
case class PlayerStats(year: Int, playerName: String, country: String, matches: Int, runs: Int, wickets: Int)

object PlayerAnalysis {
  def main(args: Array[String]): Unit = {
    // Prompt the user to enter player statistics
    println("Enter player statistics (Year, PlayerName, Country, Matches, Runs, Wickets) separated by commas. Enter 'done' to finish.")

    // Initialize an empty mutable array to store player statistics
    val playerStats = scala.collection.mutable.ArrayBuffer.empty[PlayerStats]

    // Read input from the user until 'done' is entered
    var input = StdIn.readLine()
    while (input != "done") {
      // Split the input by commas and trim whitespace
      val playerInfo = input.split(",").map(_.trim)
      if (playerInfo.length == 6) { // Check if all fields are provided
        try {
          // Parse input and create a PlayerStats instance
          val stats = PlayerStats(playerInfo(0).toInt, playerInfo(1), playerInfo(2), playerInfo(3).toInt, playerInfo(4).toInt, playerInfo(5).toInt)
          playerStats += stats // Add the PlayerStats instance to the array
        } catch {
          case _: NumberFormatException => println("Invalid input format. Please enter valid numbers.")
        }
      } else {
        println("Invalid input format. Please enter all fields.")
      }
      input = StdIn.readLine() // Read next input
    }

    // Find player with the highest run scored
    val playerWithHighestRun = playerStats.maxBy(_.runs)
    println(s"Player with the highest run scored: ${playerWithHighestRun.playerName}")

    // Top 5 players by run scored
    val top5ByRuns = playerStats.sortBy(-_.runs).take(5)
    println("Top 5 players by run scored:")
    top5ByRuns.foreach(player => println(s"${player.playerName}: ${player.runs} runs"))

    // Top 5 players by wickets taken
    val top5ByWickets = playerStats.sortBy(-_.wickets).take(5)
    println("Top 5 players by wickets taken:")
    top5ByWickets.foreach(player => println(s"${player.playerName}: ${player.wickets} wickets"))

    // Rank players with overall performance
    val rankedPlayers = playerStats.map { player =>
      val overallPerformance = (5 * player.wickets) + (player.runs * 0.05) // Define overall performance metric
      (player.playerName, overallPerformance)
    }.sortBy(-_._2) // Sort players by overall performance in descending order

    println("Players ranked by overall performance:")
    rankedPlayers.zipWithIndex.foreach { case ((playerName, performance), index) =>
      println(s"Rank ${index + 1}: $playerName - Overall Performance: $performance")
    }
  }
}


