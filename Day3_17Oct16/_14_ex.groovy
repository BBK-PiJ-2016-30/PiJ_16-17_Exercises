//Palindrome creator
//input: reads text
//output: writes text to screen in reverse order

//demo'd during class 17Oct16

print "PLease type in some text: "
String str = System.console().readLine()


print str;

int length = str.length() //14

for(int i = 0; i < length; i++){
	print str.charAt(length -i -1);
}
println ""

print str;
for (int i = length -1; i >=0; i--){
	print str.charAt(i);
}

println ""