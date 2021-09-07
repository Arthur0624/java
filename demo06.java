package javaTest;

public class demo06 {
	public static void main(String[] args) {
		int arr[] = new int[20];
		int i;
		for(i=0;i<20;i++) {
			arr[i]=(int)(Math.random()*382)+77;
		}
		int temp,j;
		for(i=0;i<19;i++) {
			for(j=0;j<19-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int max,min,aver,sum=0;
		max=arr[19];
		min=arr[0];
		for(i=0;i<20;i++) {
			sum=sum+arr[i];
		}
		aver=sum/20;
		System.out.println(max+"\n"+min+"\n"+aver+"\n"+sum+"\n");
	}
}

