//Palindrome
//input: reads text
//output: output is its a strict pallindrome (same forwards as backwards)

println("Palindrome Checker");
print("Please enter a word or phrase to check: ");
String initial = System.console().readLine();

String reversed = ""

for(i = 1; i < (initial.length()+1); i ++){
	reversed = reversed + initial[(i*-1)]
}

if(reversed == initial){
	println("This is a STRICT palindrome");
}else{
	println("This is NOT a palindrome");
}