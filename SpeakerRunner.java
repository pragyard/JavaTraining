class SpeakerRunner{
	public static void main(String[] args){
		int speakerLevel = 15;
		String vol = Speaker.volume(speakerLevel);
		System.out.println(vol);
		
		//boolean speakerTurnOn = true;
		boolean valOn = Speaker.turnOn();
		System.out.println(valOn);
		
		//boolean speakerTurnOff = false;
		boolean valOff = Speaker.turnOff();
		System.out.println(valOff);
	}
}