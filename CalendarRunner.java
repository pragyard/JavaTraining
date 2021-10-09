class CalendarRunner{
	public static void main(String[] args){
		String name1 = "Pragya RD";
		int month = Calendar.getBirthMonth(name1);
		System.out.println(month);
		
		String name2 = "Pragya RD";
		String day = Calendar.getBirthDay(name2);
		System.out.println(day);
		
		int age = 22;
		String name3 = "Pragya RD";
		boolean canVote = Calendar.isEligibleToVote(age, name3);
		System.out.println(canVote);
		
	}
}