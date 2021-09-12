package javaTest;
import java.util.Scanner;
public class java01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0;
        int year = sc.nextInt();
        for(int i=year;i<=year+100;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                j++;
            }
        }
        System.out.println("这个人能过"+j+"个闰年");
    }
}

