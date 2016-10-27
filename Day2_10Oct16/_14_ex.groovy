///allPrimesUpto1000

int numPrimes = 0
int checkNum = 2


while(numPrimes <= 1000){
	int i = 2
	while(i<= checkNum){
		if (checkNum == i){
			println checkNum + " is a prime number."
			numPrimes ++
			break;
		} else if ((checkNum % i) == 0){
			break;
		} else{
			i++
		}
	}
	checkNum ++
}


