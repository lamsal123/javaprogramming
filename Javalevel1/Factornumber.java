package Javalevel1;

public class Factornumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number = 60;
      System.out.println("Factors of "+ number );
      
      for(int i= 1; i<=number;i++) {
    	  
    	  if(number% i ==0) {
    		  System.out.println(i);
    	  }
      }
    	  
     
	}

}
