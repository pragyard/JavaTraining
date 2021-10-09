class Convert{
	public static void main(String[] args){
		String acres = "50.78";
		double wrappedAcres = Double.parseDouble(acres);
		System.out.println(wrappedAcres);
		
		String rupees = "540.90";
		double wrappedRupees = Double.parseDouble(rupees);
		System.out.println(wrappedRupees);
		
		int mangoPrice = 150;
		Integer wrappedMangoPrice = Integer.valueOf(mangoPrice);
		System.out.println(wrappedMangoPrice);
		
		String gender = "Male";
		char wrappedGender = gender.charAt(0);
		System.out.println(wrappedGender);
	}
}