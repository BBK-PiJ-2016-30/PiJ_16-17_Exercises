public class MobilePhone extends OldPhone{
	
	String [] lastCalled = new String[10];
	int count = 0;

	/**
	*adds class ring alarm
	*/
	public void ringAlarm(String alarm){
		System.out.println("Ringer alarm " + alarm + "...");
	}
	
	/**
	*adds class to play game
	*/
	public void playGame(String game){
		System.out.println("Playing game " + game + "...");
	}
	
	/**
	*list of last called numbers
	*/
	public void addCalledNum(String number){
		//add number to list
		if(count < 10){
			lastCalled[count] = number;
			count ++;
			return;
		}
		lastCalled[0] = number;
		count = 1;
		return;
	}
	
	public void printLastNumbers(){
		//prints last called number list
		System.out.println("Last called numbers...");
		for(int i = 0; i < lastCalled.length; i++){
				System.out.println(lastCalled[i]);
		}
	}
}