class PersonName{
	public static void main(String[] args){
		int date = 1;
		int month = 7;
		int year = 1999;
		
		String person = getPersonName(date, month, year);
		System.out.println(person);
	}
	
	public static String getPersonName(int date, int month, int year){
		if(date == 1 && month == 7 && year == 1999){
			return "Pragya RD";
		}
		if(date == 18 && month == 1 && year == 1996){
			return "Priyanka RD";
		}
		if(date == 16 && month == 7 && year == 1999){
			return "Maanusha";
		}
	return "No match";
	}
}