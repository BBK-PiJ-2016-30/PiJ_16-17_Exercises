///allPrimesUpto1000

def checkIfPrime(primeCheck){
	int i = 2
	while(i<= primeCheck){
			if (primeCheck == i){
				return(true)
			} else if ((primeCheck % i) == 0){
				return(false)
			} else{
			i++
			}
		}
}

int primeCheck = 0
int count = 0

print "Please enter a number: "
String str = System.console().readLine()
primeCheck = Integer.parseInt(str)
int lowNum = primeCheck
int highNum = primCheck
boolean low = true

if(checkIfPrime(primeCheck)){
	print "Number is Prime."
}else{
	while(low){
		lowNum --
		if(checkIfPrime(lowNum)){
			//do something if low num is prime
			check = false
		}
		print "Not Prime"}


