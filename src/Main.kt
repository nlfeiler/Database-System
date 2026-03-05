import java.io.File

/*
    This will be a database engine program. Why did I decide to write this? I don't know. Just seemed like a fun idea
    My overly ambitious plan is to have this support full (or most) of the SQL language and maybe some other query languages?
    This is to be written in Java and Kotlin because I don't know Kotlin at all but I want to learn it since it's like Java++.
    Anyways, here's my breakdown of the first part few steps of what I need to get done
        - First, load a CSV file into the program from input or whatever
        - Be able to parse this CSV file and store it in memory as it needs to be stored
        -
 */

//create an instance of the utility class that has been created
private val utility: Utility = Utility()

fun main(commandLineArguments: Array<String>) {
    //for now, we will just read command line args and then take input files into the memory
    System.out.printf("Reading file %s into memory...\n", commandLineArguments[0])

    //create a file input stream
    val csvFile = File(commandLineArguments[0])
    csvFile.inputStream().bufferedReader().use { reader ->
        val firstLineSplitIntoColumns: Array<String?> = reader.readLine().split(",").toTypedArray()

        reader.forEachLine { line ->
            val splitLine: Array<String> = line.split(",").toTypedArray()

        }
    }
}