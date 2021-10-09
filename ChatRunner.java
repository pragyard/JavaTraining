class ChatRunner{
	public static void main(String[] args){
		Chat ref1 = new Chat();
		
		String name1 = ref1.name;
		System.out.println(name1);
		int price1 = ref1.price;
		System.out.println(price1);
		
		Chat ref2 = new Chat();
		
		String name2 = ref2.name;
		name2 = "Shev Puri";
		System.out.println(name2);
		int price2 = ref2.price;
		price2 = 45;
		System.out.println(price2);
		
		Chat ref3 = new Chat();
		
		String name3 = ref3.name;
		name3 = "Dahi Puri";
		System.out.println(name3);
		int price3 = ref3.price;
		price3 = 40;
		System.out.println(price3);
	}
}