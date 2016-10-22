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
println(shrtStr)
println(lngStr)

int lenShrtStr = shortStr.length()
int lenLngStr = lngStr.length()
String firstChar = shrtStr[0]
String lastChar = shrtStr[-1]
int count = 0


for(i = 0; i < lenLngStr; i = i + lenShrtStr){
	//check to see we haven't over indexed
	
	if((i+(lenShrtStr-1))>(lenLngStr-1)){
		break;
	}else{	
		println(lngStr[i..(i+(lenShrtStr-1))])
		if(firstChar == lngStr.charAt(i) &
			lastChar == lngStr.charAt(i+(lenShrtStr-1))){
			if(shrtStr==lngStr[i..(i+(lenShrtStr-1))]){
				count ++
			}
		}
	}	
}

print count