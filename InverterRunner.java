class InverterRunner{
	public static void main(String[] args){
		Inverter inverter = new Inverter();
		
		String inverterMake = inverter.make;
		inverterMake = "LG";
		System.out.println(inverterMake);
		
		float inverterPrice = inverter.price;
		inverterPrice = 15999;
		System.out.println(inverterPrice);
		
		String inverterColor = inverter.color;
		System.out.println(inverterColor);
		
		float inverterWeight = inverter.weight;
		System.out.println(inverterWeight);
		
		float inverterCapacity = inverter.capacity;
		System.out.println(inverterCapacity);
		
	}
}