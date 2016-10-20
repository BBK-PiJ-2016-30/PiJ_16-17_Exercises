//LineToColumn
//input: reads user input
//output: prints each word on a new line


print("Please enter a word or sentence: ");
str = System.console().readLine()

def strSplit = str.split(" ")

for(word in strSplit){
    println(word);
}