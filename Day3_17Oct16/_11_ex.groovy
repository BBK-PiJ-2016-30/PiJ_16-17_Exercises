//Counting letter redux
//input: reads text from user
//then enters loop of requesting letters and counting them
//output: prints how many times short string appears in text
//stops if user enters same chracter more than once

def charList = [];
String userText;
String let;

print("Please write a text: ");
userText = System.console().readLine();

while(true){

	print("Which letter would you like to count now? ");
	let = System.console().readLine();
	charList << let;
	if(charList.count(let) > 1){
		println("Repeated character. Exiting the program...");
		println("Thank you for your cooperation. Good bye!");
		break;
	}
	println("There are " + userText.count(let) + " in your text.");
}
