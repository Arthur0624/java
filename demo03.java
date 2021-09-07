package javaTest;

import java.util.Scanner;
public class demo03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int m,n;
        if(i>j){
            m=i;
            n=j;
        }
        else{
            m=j;
            n=i;
        }int r=m%n;
        while(r!=0){
            m=n;
            n=r;
            r=m%n;
        }
        System.out.println(n);
    }
}

