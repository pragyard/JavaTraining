class Conversion{
	public static void main(String[] args){
		
		boolean one = Boolean.parseBoolean("false");
		System.out.println(one);
		
		byte a = Byte.parseByte("-20");
		System.out.println(a);
		
		short b = Short.parseShort("-2000");
		System.out.println(b);
		
		long c = Long.parseLong("100000");
		System.out.println(c);
		
		double d = Double.parseDouble("13.01");
		System.out.println(d); 
		
		float e = Float.parseFloat("1.07");
		System.out.println(e);
		
		int f = Integer.parseInt("30");
		System.out.println(f);
		
		String s="hello";    
		for(int i=0; i<s.length();i++){  
        char g = s.charAt(i);  
        System.out.println(g);  
		} 
	}
}