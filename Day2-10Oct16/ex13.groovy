///allPrimesUpto1000

int maxNum = 1000
int checkNum = 2


while(checkNum <= maxNum){
	int i = 2
	while(i<= checkNum){
		if (checkNum == i){
			println checkNum + " is a prime number."
			break;
		} else if ((checkNum % i) == 0){
			break;
		} else{
			i++
		}
	}
	checkNum ++
}


