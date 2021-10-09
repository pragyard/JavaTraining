class Bottle{
	public static void storing(float price, String color, float height, String quality, String[] brands){
		System.out.println(price);
		System.out.println(color);
		System.out.println(height);
		System.out.println(quality);
		
		for(int brandIndex=0; brandIndex<brands.length; brandIndex++){
			String brand = brands[brandIndex];
			System.out.println(brand);
		}
	}
}