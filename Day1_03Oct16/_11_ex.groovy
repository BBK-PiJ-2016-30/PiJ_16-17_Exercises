//poker hands
//input: reads 5 cards from user. Reads the rank and suite of card
//each card must be valid before moving to the next one
//output: tell user the best hand she has

def cardRank = []
def validRank = [1,2,3,4,5,6,7,8,9,10,11,12,13]
def validSuite = ["S","H","D","C"]

String suiteHold = ""
String cardSuite = ""
int rankHold = 0
int count = 0
int checkNum = 0
int tripRank = 0

boolean flush = true

while (count < 5){

	print "Please enter the rank of your card [1,2,3,4,5,6,7,8,9,10,J,Q,K]: "
	str = System.console().readLine()
	if (str == "J"){
		rankHold = 11
	} else if(str == "Q"){
		rankHold = 12
	}else if(str == "K"){
		rankHold = 13
	}else{
		rankHold = Integer.parseInt(str)
	}
	print "Please enter the suit of your card [S]pades, [H]earts, [D]iamonds, [C]lubs: "
	suiteHold = System.console().readLine()
	//assert that both rank and suits are valid
	
	if(!validRank.contains(rankHold) | !validSuite.contains(suiteHold)){
		println "Please enter valid selection. Both rank and suite must be valid."
	}else{
		
	
		cardRank << rankHold
	
		if (count == 0){
			cardSuite = suiteHold
		}else if(cardSuite != suiteHold) {
			flush = false
		}	
		count ++
	}	
}

cardRank.sort()

def bestHand(handList, flush){

	boolean consec = true
    	boolean poker = false
    	boolean triple = false
    	boolean fullHouse = false
    	boolean pair = false
    	def tmpList = []
    	int count = 1

    	//check if consecutive
    	while(count < handList.size()){

            	if(handList[count] != (handList[count-1] +1)){
             	   consec = false
            	}
            	count ++
    	}

    	//check for straight flush
    	if (consec & flush){
		println "Your best hand is a STRAIGHT FLUSH!"
        	return
    	}

    	//check for poker
    	for(i in 0..1){
        	if(handList.count(handList[i])==4){
           	println "Your best hand is POKER!"
           	return
        	}
    	}

    	//check for full house
    	for(i in 0..2){
        	if(handList.count(handList[i])==3){
			triple = true
            		tmpList = handList
            		tmpList.removeAll(handList[i])
            
			if(tmpList.count(tmpList[0])==2){
                	println "Your best hand is a FULL HOUSE!"
                	return
            		}

        	}

    	}

    	//check for flush
    	if(flush){
       		println "Your best hand is a FLUSH!"
        	return
    	}

    	//check for straight
    	if(consec){
		println "Your best hand is a STRAIGHT!"
		return
   	}

    	//check for three of a kind
    	if(triple){
        	println "Your best hand is THREE OF A KIND!"
        	return
    	}
    
    	//check for two pair
    	for(i in 0..3){
        	if(handList.count(handList[i])==2){
            		pair = true
            		tmpList = handList
            		tmpList.removeAll(handList[i])
            		for(j in 0..1){
                		if(tmpList.count(tmpList[j])==2){
                    			println "Your best hand is TWO PAIR!"
                    			return
                		}
            		}
        	}

    	}

    	//check for pair
    	if(pair){
        	println "Your best hand is a PAIR!"
        	return
    	}

    	println "You have nothing :-("
    	return
}

bestHand(cardRank, flush)