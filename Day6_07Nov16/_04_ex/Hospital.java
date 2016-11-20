class Hospital{

	public static void main(String [] args){
		
		HospitalManager newHosp = new HospitalManager();
		Patient newPat = null;
		
		//1
		for(int i=0; i<10; i++){
			String str = "";
			switch(i%3){
				case 0:
					str = "Broken Arm";
					break;
				case 1:
					str = "Broken Leg";
					break;
				case 2:
					str = "Broken Nose";
					break;
				default:
					System.out.println("This should never run");
					break;
			}
			newPat = new Patient(("Pat_"+i), (20+i), str);
			newHosp.addPatient(newPat);
		}
		
		//2
		newHosp.printPatientListForwards();
		newHosp.printPatientListbackwards();
		System.out.println("Patients in queue: " + newHosp.getQueue());
		
		//3 delete a few patients
		newHosp.deletePatient("Pat_5");
		newHosp.deletePatient("Pat_7");
		
		//4
		newHosp.printPatientListForwards();
		newHosp.printPatientListbackwards();
		System.out.println("Patients in queue: " + newHosp.getQueue());
		
		//5 delete patient not in list
		newHosp.deletePatient("Pat_11");
		
		//6
		newHosp.printPatientListForwards();
		newHosp.printPatientListbackwards();
		System.out.println("Patients in queue: " + newHosp.getQueue());

	}
}