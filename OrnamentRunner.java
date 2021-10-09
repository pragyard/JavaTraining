class OrnamentRunner{
	public static void main(String[] args){
		String[] ornaments = {"Ring", "Pendant", "Earring", "Bracelet", "Anklet"};
		String lastElement = Ornament.ornamentList(ornaments);
		System.out.println(lastElement);
	}
}