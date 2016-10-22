//Counting pairs of letters
//input: reads short string from user and then some longer text
//output: prints how many times short string appears in text

println("Program is not case sensitive.")
print("Please enter a short string: ");
String shortStr = System.console().readLine()
print("Please enter some longer text: ");
String longStr = System.console().readLine()

shrtStr = shortStr.toLowerCase()
lngStr = longStr.toLowerCase()

int lenShrtStr = shortStr.length()
int lenLngStr = lngStr.length()
String firstChar = shrtStr[0]
int count = 0


for(i =0; i<lenLngStr; i++){
	if(lngStr[i] == firstChar){
		//check to see we haven't over indexed
		if((lenLngStr)>(i+(lenShrtStr-1))){
			if(shrtStr==lngStr[i..(i+(lenShrtStr-1))]){
				count ++
			}
		}
	}
}


println("Short string occurs " + count + " times in longer txt.");