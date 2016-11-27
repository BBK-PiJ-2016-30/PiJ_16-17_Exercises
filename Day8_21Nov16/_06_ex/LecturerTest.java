public class LecturerTest{
	public static void main(String [] args){
		LecturerTest LectTest = new LecturerTest();
		
		LectTest.launch();
	}
	
	public void launch(){
		Lecturer newLect = new Lecturer("Hanns");
		
		System.out.println("The lecturers name is " + newLect.getName());
		newLect.doResearch("Computer Science");
		newLect.teach("Java");
		
	}

}