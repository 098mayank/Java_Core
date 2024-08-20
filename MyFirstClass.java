public class MyFirstClass {
	
	long factorial(double z) {
		long factorial = 1;
		for(int i = 1;i<=z;i++) {
			factorial = factorial*i;
		}
		 return factorial;
	}
	
	boolean  isStrong(double num) {
		
	        double originalNum = num;
	        double sum = 0;

	        while (num > 0) {
	            double digit = num % 10;  
	            sum = sum + factorial(digit); 
	            num /= 10; 
	        }
	        return sum == originalNum;
	    }
	public static void main(String[] args) {
				MyFirstClass s = new MyFirstClass();
				double num = s.factorial(7);
				System.out.println("Factorial  "+num);
				boolean strong = s.isStrong(165);
				if(strong == true) {
					System.out.println("It is strong number");
				}
					else {
						System.out.println("It is not strong number");
					}
				
				
				}
}









