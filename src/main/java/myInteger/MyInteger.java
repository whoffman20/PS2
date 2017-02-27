package myInteger;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven(){
		if (iValue%2==0)
			return true;
		else
			return false;
	}
	public boolean isOdd(){
		if (iValue%2==0)
			return false;
		else
			return true;
	}
	public boolean isPrime(){
		for (int y = 2; y<iValue; y=y+1){
			if (iValue%y==0)
				return false;
			else
				continue;
		}
		return true;
		} 
	
	public static boolean isEven(int n){
		if (n%2==0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int n){
		if (n%2==0)
			return false;
		else
			return true;
	}
	public static boolean isPrime(int n){
		for (int y = 2; y<n; y=y+1){
			if (n%y==0)
				return false;
			else
				continue;
		}
		return true;
		}
	
	
	public static boolean isEven(MyInteger n){
		return MyInteger.isEven(n);
	}
	public static boolean isOdd(MyInteger n){
		return MyInteger.isOdd(n);
	}
	public static boolean isPrime(MyInteger n){
		return MyInteger.isPrime(n);
	}
	
	
	public boolean equals(int n){
		if (n==getiValue())
			return true;
		else
			return false;
	}
	public boolean equals(MyInteger n){
		if (n.getiValue()==getiValue())
			return true;
		else
			return false;
	}
	}
