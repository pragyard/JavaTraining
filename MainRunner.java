class MainRunner{
	public static void main(String[] args){
		System.out.println("========== FISH DETAILS ==========");
		
		Fish fish = new Fish();
		
		String fishName = fish.name;
		fishName = "Pomfret";
		System.out.println(fishName);
		
		String fishOrigin = fish.origin;
		fishOrigin = "South Asia";
		System.out.println(fishOrigin);
		
		String fishColor = fish.color;
		System.out.println(fishColor);
		
		float fishWeight = fish.weight;
		System.out.println(fishWeight);
		
		float fishLength = fish.length;
		fishLength = 3.2f;
		System.out.println(fishLength);
		
		System.out.println("========== TRAIN DETAILS ==========");
		
		Train train = new Train();
		
		String trainType = train.type;
		System.out.println(trainType);
		
		float trainSpeed = train.speed;
		System.out.println(trainSpeed);
		
		int totalTrainCoach = train.totCoach;
		totalTrainCoach = 21;
		System.out.println(totalTrainCoach);
		
		String trainStartPoint = train.startPoint;
		trainStartPoint = "Delhi";
		System.out.println(trainStartPoint);
		
		String trainStopPoint = train.stopPoint;
		trainStopPoint = "Bangalore";
		System.out.println(trainStopPoint);
		
		System.out.println("========== CHARGER DETAILS ==========");
		
		Charger charger = new Charger();
		
		String chargerBrand = charger.brand;
		System.out.println(chargerBrand);
		
		String chargerType = charger.type;
		System.out.println(chargerType);
		
		float chargerCurrent = charger.current;
		chargerCurrent = 2.4f;
		System.out.println(chargerCurrent);
		
		String chargerColor = charger.color;
		chargerColor = "Black";
		System.out.println(chargerColor);
		
		float chargerPrice = charger.price;
		chargerPrice = 349.00f;
		System.out.println(chargerPrice);
	}
}