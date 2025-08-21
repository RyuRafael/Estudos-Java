package algoritos_1;

public class Sequencia_ij_3 {

	public static void main(String[] args) {
		int x = 7;
	      int y = 5;;
	      
	      
	       for(int i = 1; i <= 9; i += 2){
	           
	    	    
	           
	           for(int j = x; j >= y; j--) {
	        	   
	        	   System.out.printf("I=%d J=%d%n",i,j);
	        	           	   
	           }
	    		   
	        	   x += 2;
	       	       y += 2;
	       }	

	}

}
