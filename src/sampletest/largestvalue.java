package sampletest;

public class largestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr={24,34,56,98,2,59};
         int val =arr [0];
         for(int i=0;i<arr.length;i++){
        	 if(arr[i]>val){
        		 val=arr[i];
        	 }
         }
         System.out.println("largest value"+ val);
	}

}
