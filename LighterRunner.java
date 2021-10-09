class LighterRunner{
	public static void main(String[] args){
		
		boolean valOn = Lighter.on();
		System.out.println(valOn);
		
		boolean valOff = Lighter.off();
		System.out.println(valOff);
		
		int lighterWidth = 10;
		boolean val = Lighter.light(lighterWidth);
		System.out.println(val);
		
	}
}