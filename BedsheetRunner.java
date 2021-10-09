class BedsheetRunner{
	public static void main(String[] args){
		Bedsheet ref1 = new Bedsheet();
		
		String colour1 = ref1.colour;
		System.out.println(colour1);
		String material1 = ref1.material;
		System.out.println(material1);
		float length1 = ref1.length;
		System.out.println(length1);
		
		Bedsheet ref2 = new Bedsheet();
		
		String colour2 = ref2.colour;
		colour2 = "Pink";
		System.out.println(colour2);
		String material2 = ref2.material;
		material2 = "Synthetic";
		System.out.println(material2);
		float length2 = ref2.length;
		length2 = 4.5f;
		System.out.println(length2);
		
		Bedsheet ref3 = new Bedsheet();
		
		String colour3 = ref3.colour;
		colour3 = "Orange";
		System.out.println(colour3);
		String material3 = ref3.material;
		material3 = "Semi Cotton";
		System.out.println(material3);
		float length3 = ref3.length;
		length3 = 5.5f;
		System.out.println(length3);
	}
}