public class Calculator {
	int num2 = 1000;
	public int Sum(int a,int b){
		return  a+num2;
	}
	
	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		int sumData =obj1.Sum(23,234);
		System.out.println("The sum of the two number is "+ sumData);
	}
}


//access modifiers in the java
// dp3
// default
// public
//private
// protected
