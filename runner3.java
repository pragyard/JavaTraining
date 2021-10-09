class runner3{
	public static void main(String[] args){
		
		String[] companies = {"Google", "CISCO", "Adobe", "Amazon", "facebook"};
		String[] computers = {"Asus", "macBook", "Lenovo", "hp", "Dell"};
		String[] mobiles = {"Moto", "Oneplus", "iphone", "Redmi", "Samsung"};
		String[] ipl = {"RCB", "CSK", "MI", "KKR", "RR"};

		String dreamCmp = random.printName("Pragya","Car","IBM");
		System.out.println(dreamCmp);
		random.companyName(companies);
		random.compBrands(computers);
		String firstMob = random.mobBrands(mobiles);
		System.out.println(firstMob);
		String lastTeam = random.iplTeams(ipl);
		System.out.println(lastTeam);
		
	}
}