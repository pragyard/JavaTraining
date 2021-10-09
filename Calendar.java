class Calendar{
	public static int getBirthMonth(String personName){
		if(personName=="Mahatma Gandhi"){
			return 10;
		}
		if(personName=="B.R.Ambedkar"){
			return 4;
		}
		if(personName=="Jawarlal Nehru"){
			return 9;
		}
		if(personName=="Pragya RD"){
			return 7;
		}
	return 0;
	}
	
	public static String getBirthDay(String personName){
		if(personName=="Mahatma Gandhi"){
			return "Saturday";
		}
		if(personName=="B.R.Ambedkar"){
			return "Tuesday";
		}
		if(personName=="Jawarlal Nehru"){
			return "Tuesday";
		}
		if(personName=="Pragya RD"){
			return "Thursday";
		}
	return "No Match";
	}
	
	public static boolean isEligibleToVote(int age, String personName){
		if(age>=18){
			return true;
		}
		else 
			return false;
	}
}