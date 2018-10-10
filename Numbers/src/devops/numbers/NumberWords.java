package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
	
		String result = String.valueOf( number )  ;
		int length = result.length();
	    if (number < 0) { 
	        System.out.println( "Negative number\n"); 
	        return "";
	    } 
	    else if(number == 0){
	    	System.out.println( "Stopping the app\n"); 
	    	return "0";
	    }
	    else if (length > 3) { 
	       System.out.println( "not more than thousand\n"); 
	        return ""; 
	    } 
		result = converToWords(number);
		return result.trim() ;
	}

	private String converToWords(int number){
		final String twoDigits[] = {"", " one", " two", " three", " four",  " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"}; 
		final String tensMultiple[] = {"","", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"}; 
		
		String inWord;

	    if (number % 100 < 20){
	    	inWord = twoDigits[number % 100];
	      number /= 100;
	    }
	    else {
	    	inWord = twoDigits[number % 10];
	      number /= 10;

	      inWord = tensMultiple[number % 10] + inWord;
	      number /= 10;
	    }
	    if (number == 0) return inWord;
	    return twoDigits[number] + " hundred" + inWord;
		
	}
}
