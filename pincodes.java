class pincodes{
    public static String getCityCode(int no){
        if(no==560034){
            System.out.println("Koramangala");
        return "Koramangala";
        }
        if(no==560030){
            System.out.println("Adugodi");
            return "Adugodi";
        }
        if(no==560009){
            System.out.println("Ulsoor");
            return "Ulsoor";
        }
    return "No match";
        
    }
    
    public static String getCountryCode(int no){
        if(no==56){
            System.out.println("Pakistan");
            return "Pakistan";
        }
        if(no==30){
            System.out.println("Japan");
            return "Japan";
        }
        if(no==59){
            System.out.println("Sri Lanka");
            return "Sri Lanka";
        }
    return "No match";
        
    }
    
    public static void main(String args[]) {
      int cityCode = 560034;
      int countryCode = 56;
	  
	  String city = getCityCode(cityCode);
	  System.out.println(city);
	  
	  String country = getCountryCode(countryCode);
	  System.out.println(country);
	  
      //getCityCode(cityCode);
      //getCountryCode(countryCode);
    }
}