//poker hands

def cardRank = []
def cardSuit = []
String tmp = ""
String tmp2 = ""
int count = 0


while (count < 5){

	print "Please enter the rank of your card [1,2,3,4,5,6,7,8,9, 10,J,Q,K]: "
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
	tmp2 = System.console().readLine()

	cardRank << tmp+tmp2
	
	count ++
}
print cardRank

