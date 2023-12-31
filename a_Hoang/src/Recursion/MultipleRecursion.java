package Recursion;

public class MultipleRecursion {
	    public static int multipleRecursion(int n) {
	        if (n <= 0) {
	            return 1;
	        } else {
	            // Gọi lại chính nó và nhiều phương thức khác
	            return multipleRecursion(n - 1) +
	                   multipleRecursion(n - 2) +
	                   anotherRecursiveMethod(n - 3);
	        }
	    }

	    public static int anotherRecursiveMethod(int n) {
	        if (n <= 0) {
	            return 0;
	        } else {
	            // Phương thức đệ quy khác
	            return anotherRecursiveMethod(n - 1);
	        }
	    }

	    public static int mystery(int a, int b) {
	    	if(b == 1) {
	    		return a;
	    	}else {
	    		return a + mystery(a, b - 1);
	    	}
	    }
	    public static int recur(int n) {
	    	if(n <= 10) {
	    		return n *2;
	    	}else {
	    		return recur(n/3);
	    	}
	    }
	    
	    public static void main(String[] args) {
	        int result = multipleRecursion(12);
	        System.out.println("Result: " + result);
	        
	        System.out.println(mystery(2, 3));
	        
	        System.out.println(recur(27));
	    }

}
