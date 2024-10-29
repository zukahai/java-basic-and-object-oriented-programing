package LyThuyet;

public class Main {
	
	public static void soSanh(int a, int b) {
		if (a > b) {
            System.out.println( a + " > " + b );
        }
		if (a < b) {
            System.out.println( a + " < " + b );
        }
		if (a == b) {
          System.out.println( a + " = " + b );
        }
	}
	
	public static int tong2So(int a, int b) {
		return a + b;
	}
	
	public static int tong(int n) {
		int t = 0;
		for (int i = 1; i <= n; i++) {
			t += i;
		}
		return t;
	}
	
	public static int tongAB (int a, int b){
	    int t = 0;
	    for (int i = a; i <= b; i++) {
	    	t += i;
	    }
	    return t;
	}
	
	public static void test1(){
        System.out.print("HelloWorld");
    }
	
	public static void helloWorld(int n){
        for (int i = 1; i <= n; i++){
          System.out.println("Hello World");
        }
	}
	
	public static int soLonHon(int a, int b) {
        if (a > b) {
        	return a;
        } else {
        	return b;
        }
    }
	
	public static int lastDigit(int n) {
	    return n % 10;
	}
	
	public static int test(int a, int b, int c) {
	    return a + 2 * b + 3 * c;
	}
	
	public static void test2(int n, String s) {
	    for (int i = 1; i <= n; i++) {
	    	System.out.println(s);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2(4, "O");
	}
}
