public class MarkReader{
	
	private int mDistinct = 0;
	private int mPasses = 0;
	private int mFails = 0;
	private int mInvalid = 0;
	
	public void userEntry(){
		String entry = "";
		int entryInt = 0;
		do{
			System.out.print("Please enter student marks from 0 - 100: ");
			
			entry = System.console().readLine();
			entryInt = Integer.parseInt(entry);
			
			if(entryInt >= 70 & entryInt <= 100){
				mDistinct ++;
			}else if(entryInt >= 50 & entryInt <= 69){
				mPasses ++;
			}else if(entryInt >= 0 & entryInt <= 49){
				mFails ++;
			}else if(entryInt != -1){
				mInvalid ++;
			}
		}while(entryInt != -1);
		
		System.out.println("Distinctions: " + mDistinct);
		System.out.println("Passes: " + mPasses);
		System.out.println("Fails: " + mFails);
		System.out.println("Invalid entries: " + mInvalid);
	}
	
	public static void main(String [] args){
		//construct MarkReader object
		MarkReader classMarks = new MarkReader();
		
		//call userEntry
		classMarks.userEntry();
	}
	


}