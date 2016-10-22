//Counting letters
//input: reads text from user and letter from user
//output: prints how many times letteris in the user entered text

println("Program is not case sensitive.")
print("Please enter a word or sentence: ");
String str = System.console().readLine()
print("Please enter letter to search for: ");
String let = System.console().readLine()

str = str.toLowerCase()

println("The letter " + let + " occurs " + str.count(let) + " times in the string you entered.");