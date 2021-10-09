class ToothbrushRunner{
	public static void main(String[] args){
		Toothbrush ref1 = new Toothbrush();
		
		String company1 = ref1.company;
		System.out.println(company1);
		int price1 = ref1.price;
		System.out.println(price1);
		char size1 = ref1.size;
		System.out.println(size1);
		
		Toothbrush ref2 = new Toothbrush();
		
		String company2 = ref2.company;
		company2 = "Pepsudent";
		System.out.println(company2);
		int price2 = ref2.price;
		price2 = 40;
		System.out.println(price2);
		char size2 = ref2.size;
		size2 = 'S';
		System.out.println(size2);
		
		Toothbrush ref3 = new Toothbrush();
		
		String company3 = ref3.company;
		company3 = "Ajay";
		System.out.println(company3);
		int price3 = ref3.price;
		price3 = 10;
		System.out.println(price3);
		char size3 = ref3.size;
		size3 = 'L';
		System.out.println(size3);
		
	}
}