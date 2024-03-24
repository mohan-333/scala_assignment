import scala.io.StdIn

object Bucketizer {

  // Function to bucketize data by range
  def bucketByRange(data: Array[Double], bucketSize: Double): List[String] = {
    // Map each value in the data array to its corresponding bucket range
    data.map(value => {
      // Calculate the lower bound of the bucket
      val lowerBound = math.floor((BigDecimal(value) / BigDecimal(bucketSize)).toDouble) * bucketSize
      // Calculate the upper bound of the bucket, adjusting for potential floating-point precision issues
      val upperBound = lowerBound + bucketSize - 0.001
      // Format the range as a string and return
      f"$lowerBound%2.3f-$upperBound%2.3f"
    }).toList
  }

  def main(args: Array[String]): Unit = {
    // Prompt the user to enter values to be bucketized
    println("Enter values to bucketize separated by commas:")
    // Read the input values from the user and split them by commas, then convert them to an array of Doubles
    val data = StdIn.readLine().split(",").map(_.trim.toDouble)

    // Prompt the user to enter the bucket size
    println("Enter the bucket size:")
    // Read the input bucket size from the user and convert it to a Double
    val bucketSize = StdIn.readLine().toDouble

    // Call the bucketByRange function to bucketize the data using the specified bucket size
    val buckets = bucketByRange(data, bucketSize)

    // Print the bucketized values
    println("Bucketized values:")
    println(buckets)
  }
}


