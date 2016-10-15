//poker hands
//input: reads 5 cards from user. Reads the rank and suite of card
//each card must be valid before moving to the next one
//output: tell user the best hand she got

def cardRank = []

String tmp = ""
String tmp2 = ""
String cardSuite = ""
int count = 0
int checkNum = 0
boolean sameSuite = true
boolean consecutive = false


while (count < 5){

	print "Please enter the rank of your card [1,2,3,4,5,6,7,8,9,10,J,Q,K]: "
	str = System.console().readLine()
	if (str == "J"){
		cardRank << 11
	} else if(str == "Q"){
		cardRank << 12
	}else if(str == "K"){
		cardRank << 13
	}else{
		cardRank << Integer.parseInt(str)
	}
	print "Please enter the suit of your card [S]pades, [H]earts, [D]iamonds, [C]lubs: "
	tmp = System.console().readLine()
	if (count == 0){
		cardSuite = tmp
	}else if(cardSuite != tmp) {
		sameSuite = false
	}	
	count ++	
}

print sameSuite



cardRank.sort()
print cardRank

//check if consecutive

//check for 4
//take fisrt element in the list check for 4 if not try second

//check for 3 take first element in the list chcek for 3
//if not take seocd do the same
//if not take third do the same
//if find 3, then triple =true, remove 3 of the same check 2 for pair

//then you only get here if there is no 4 or 3

//now checking for pairs
//count of first item if not 2 pop item and count of 2 etc

