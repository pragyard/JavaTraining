class ShoeRunner{
	public static void main(String[] args){
		Shoe ref1 = new Shoe();
		
		String brand1 = ref1.brand;
		System.out.println(brand1);
		int price1 = ref1.price;
		System.out.println(price1);
		
		Shoe ref2 = new Shoe();
		
		String brand2 = ref2.brand;
		brand2 = "Paragon";
		System.out.println(brand2);
		int price2 = ref2.price;
		price2 = 500;
		System.out.println(price2);
		
		Shoe ref3 = new Shoe();
		
		String brand3 = ref3.brand;
		brand3 = "Lulu";
		System.out.println(brand3);
		int price3 = ref3.price;
		price3 = 600;
		System.out.println(price3);
	}
}