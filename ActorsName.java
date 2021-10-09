class ActorsName{
	public static void main(String[] args){
		String movie = "ZNMD";
		String[] actors = getActors(movie);
		for(int i=0;i<actors.length;i++){
			System.out.println(actors[i]);
		}
	}
	
	public static String[] getActors(String movie){
		if(movie=="Dhoom2"){
			String[] actorsName = {"Abhishek Bacchan", "Aishwarya Rai", "Hritik Roshan"};
			return actorsName;
		}
		
		if(movie=="ZNMD"){
			String[] actorsName = {"Farhan Akhtar", "Abhay Deol", "Hritik Roshan", "Katrina Kaif"};
			return actorsName;
		}
		
		if(movie=="YJHD"){
			String[] actorsName = {"Ranbir Kapoor", "Deepika Padukone"};
			return actorsName;
		}
		
		String[] noMatch = {"No Match"};
		return noMatch;
	}
}