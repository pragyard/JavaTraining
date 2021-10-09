class Lighter{
	public static boolean on(){
		return true;
	}
	
	public static boolean off(){
		return false;
	}
	
	public static boolean light(int width){
		if(width>0){
			return true;
		}
		return false;
	}
}