class CopyRunner{
	public static void main(String[] args){
		System.out.println("Invoked main");
		
		Transformer transformer = new Transformer();
		Robot robot = new Robot();
		HardDisk hardDisk = new HardDisk();
		WaterTank waterTank = new WaterTank();
		Motor motor = new Motor();
		
		System.out.println("Exit main");
	}
}