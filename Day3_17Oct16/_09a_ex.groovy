//Counting letters
//input: reads text from user
//output: prints how many times letter in e is in the user entered txt

println("Program is not case sensitive.")
print("Please enter a word or sentence: ");
String str = System.console().readLine()

str = str.toLowerCase()

println("The letter e occurs " + str.count("e") + " times in the string you entered.");