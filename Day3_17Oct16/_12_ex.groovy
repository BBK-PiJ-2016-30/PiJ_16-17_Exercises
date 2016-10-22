//Your change, please
//input: reads total cost of purchase and the amount paid to buy it
//output: output the correct amount of change in notes (50,20,10,5) and coins (2,1,0.5,0.2,0.1,0.05,0.02,0.01)

def charList = [];
double itemCost = 0.0;
double paid = 0.0;
def notes = [50.0,20.0,10.0,5.0]
def coins = [2.0,1.0,0.50,0.20,0.10,0.05,0.02,0.01]

print("What is the cost of the product? ");
String str = System.console().readLine();
itemCost = Double.parseDouble(str);

print("How much money are you paying? ");
str = System.console().readLine();
paid = Double.parseDouble(str);

double change = paid - itemCost

println("\nYour change is " + String.format("%.2f",change) + "\n");

int count = 0

for(note in notes){
	count = (int) Math.floor(change/note)
	if(count >0){
		change = change - (note*count)
		println(String.format("%.0f",note) + " notes needed = " + count)
	}
}

if(change>0){
	for(coin in coins){
		count = (int) Math.floor(change/coin)
		if(count >0){
			change = change - (coin*count)
			change = change.round(2)
			println(String.format("%.2f",coin) + " coins needed = " + count)
		}
	}
}
