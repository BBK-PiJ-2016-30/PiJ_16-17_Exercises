//Exercise 2.6.1

//Write a small program that asks for the names and IDs of all employees in a small company, and
//store them in an array of integers and an array of Strings. The company has 10 employees.
//Use a loop to go through both arrays and print the names and IDs of those employees whose
//ID is less than 1000. Use another loop to print the names and IDs of those employees whose name
//starts with j or S.

//input: ids and names of all employees
//stores them in an array of integers and an array of strings
//output1: print names and ids of those employees whose ID is less than 1000
//output2: print names and ids of those employees whose name starts with "J" or "S"

public class _00_Notes_ex {
	public static void main(String[] args){
		//intialise array for ids
		int [] idArr;
		idArr = new int[10];

		//intialise array for names
		String [] nameArr;
		nameArr = new String[10];

		//test
		//int [] idArr = {500,200,301,503,1001,2003,4003,5005,101, 201};
		//String [] nameArr = {"John","Alex","Sarah","Bill","Jim","James","Simon","Alfred","Jenny", "Dane"};

		//loop to take input from user
		for(int i=0;i<10;i++){
			System.out.print("Please enter employee ID " + (i+1) + ":");
			idArr[i] = Integer.parseInt(System.console().readLine());
			System.out.print("Please enter employee Name " + (i+1) + ":");
			nameArr[i] = System.console().readLine();	
		}

		
		//loop to print names and ids of emploees whose is is less than 1000
		System.out.println("");
		System.out.println("These employees have ID's less than 1000.");
		for(int i=0;i<10;i++){
			if(idArr[i] < 1000){
				System.out.println(idArr[i] + ":" + nameArr[i]);
			}	
		}

		//loop to print names and ids of emploees whose name starts with J or S
		System.out.println("");
		System.out.println("These employees names start with 'J' or 'S'.");
		for(int i=0;i<10;i++){
			char chk1 = nameArr[i].charAt(0);
			if(chk1 == 'J' | chk1 == 'S'){
				System.out.println(idArr[i] + ":" + nameArr[i]);
			}	
		}
	}
}