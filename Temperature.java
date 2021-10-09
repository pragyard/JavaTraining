class Temperature{
	public static String getFeelings(int temp){
		if(temp>=50){
			return "Hot";
		}
		if(temp==40){
			return "Irritating";
		}
		if(temp>=20&&temp<=30){
			return "pleasant";
		}
		if(temp<=10){
			return "Cold";
		}
		if(temp<=5){
			return "Freezing";
		}
	return "No match";
	}
	
	public static void main(String[] args){
		int temperature = 50;
		
		String feeling = getFeelings(temperature);
		System.out.println(feeling);
	}
}