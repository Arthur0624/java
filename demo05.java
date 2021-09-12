package javaTest;

import java.util.Scanner;
public class exercise_five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[] = new int[m];
        int i,n=0;
        for (i=0; i<m;i++){
            a[i] = sc.nextInt();
            n=n+a[i];
        }
        float b;
        b=n/m;
        for(i=0;i<m;i++){
        if (a[i] > b)
            System.out.println(a[i]);
        }
        }
    }
