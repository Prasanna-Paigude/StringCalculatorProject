package calculator;

public class StringCalculator {
	private final String delimiter = ",|\n";
    public int add(String input) {
    	String[] numbers = input.split(delimiter);
    	
    	if(isEmpty(input)) {
        	return 0;
    	}
    	if(input.length() == 1) {
        	return stringToInt(input);
        }
        else {
        	return getSum(numbers);
        }
    }
    	
    	private int getSum(String [] numbers) {
    		int sum = 0;
    		for(int current=0; current<numbers.length; current++) {
    			sum +=Integer.parseInt(numbers[current]);
    		}
        	return sum;
        }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }
}