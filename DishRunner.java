class DishRunner{
	public static void main(String[] args){
		Dish ref1 = new Dish();
		
		String name1 = ref1.name;
		System.out.println(name1);
		String origin1 = ref1.origin;
		System.out.println(origin1);
		
		Dish ref2 = new Dish();
		
		String name2 = ref2.name;
		name2 = "Chole puri";
		System.out.println(name2);
		String origin2 = ref2.origin;
		origin2 = "UP";
		System.out.println(origin2);
		
		Dish ref3 = new Dish();
		
		String name3 = ref3.name;
		name3 = "Dosa";
		System.out.println(name3);
		String origin3 = ref3.origin;
		origin3 = "South India";
		System.out.println(origin3);
		
		
	}
}