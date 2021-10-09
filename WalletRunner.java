class WalletRunner{
	public static void main(String[] args){
		Wallet wallet = new Wallet();
		
		float priceOfWallet = wallet.price;
		System.out.println(priceOfWallet);
		
		String colorOfWallet = wallet.color;
		System.out.println(colorOfWallet);
		
		String countryMadeOfWallet = wallet.countryMade;
		System.out.println(countryMadeOfWallet);
	}
}