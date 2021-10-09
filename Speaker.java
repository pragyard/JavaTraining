class Speaker{
	public static String volume(int level){
		if(level<=0){
			return "On it first!";
		}
		if(level<=3){
			return "Okay";
		}
		if(level>3){
			return "Loud";
		}
		if(level>5){
			return "Too Loud";
		}
		if(level>9){
			return "Call the Police";
		}
	return "No match";	
	}
	
	public static boolean turnOn(){
		return true;
	}
	
	public static boolean turnOff(){
		return false;
	}
}