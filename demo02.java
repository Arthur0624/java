package javaTest;

public class java02 {
	    public static void main(String[] args){
	        int F1=1;
	        int F2=1;
	        int i=0;
	        while(i<10){
	            System.out.println(F2);
	            System.out.println(F1);
	            F2=F1+F2;
	            F1=F2+F1;
	            i++;
	        }
	    }
	}
