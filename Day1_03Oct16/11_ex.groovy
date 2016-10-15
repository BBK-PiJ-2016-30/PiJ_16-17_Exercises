//poker hands
//input: reads 5 cards from user. Reads the rank and suite of card
//each card must be valid before moving to the next one
//output: tell user the best hand she got

def cardRank = []
def cardSpa = []
def cardHea = []
def cardDia = []
def cardClu = []

String tmp = ""
String tmp2 = ""
int count = 0
int checkNum = 0
boolean sameSuite = false
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
	}
	checkNum = Integer.parseInt(str)
	if (checkNum >10){
		println("Please enter a valid rank.")
	}else{
		//cardRank << Integer.parseInt(str)
		print "Please enter the suit of your card [S]pades, [H]earts, [D]iamonds, [C]lubs: "
		tmp2 = System.console().readLine()
		if (tmp2 == "S"){
			cardSpa << checkNum

		
		}else if (tmp2 == "H"){
			cardHea << checkNum

		}else if (tmp2 == "D"){
			cardDia << checkNum

		
		}else{
			cardClu << checkNum

		}
		count ++	
	}
}

combinedCards = cardSpa + cardHea + cardDia + cardClu
combinedCards.sort()

//check if all cards are of the same suit
if (cardSpa.size() == 5 | cardHea.size() == 5 | cardDia.size() == 5 | cardClu.size() == 5){
	sameSuite = true
}

//check if card are consecutive

//if same suite and consecutive - straight flush
//else consecutive straight

//check for poker, combine lists and check for 4 of same rank

//now check for 3 of same rank and a pair

//if same suite flush

//check for 3 of same rank


//check for pairs if two then two pair, if 1 then 1 pair


//Nothing - return highest card/