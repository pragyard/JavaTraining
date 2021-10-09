class PowerBankRunner{
	public static void main(String[] args){
		PowerBank powerBank = new PowerBank();
		
		float capacityOfPB = powerBank.capacity;
		System.out.println(capacityOfPB);
		
		String companyOfPB = powerBank.company;
		System.out.println(companyOfPB);
		
		float priceOfPB = powerBank.price;
		System.out.println(priceOfPB);
	}
}