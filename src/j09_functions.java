
public class j09_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Start of code");
		
		myAdd();
		myAdd();
		myAdd();
		myMultiple(15,23);
		myMultiple(15,22);
		
		int a= myDivision(100,5);
		System.out.println("Value of s is "+a);
		
		int b= myDivision(100,15);
		System.out.println("Value of s is "+b);
    
		System.out.println("End of code");
	}
       public static void myAdd() {
	   int x=5,y=6;
	   int z=x+y;
	   System.out.println("myAdd of 5 and 6 is"+z);
}
       
       public static void myMultiple(int x, int y) {
    	   //int x=5,y=6;
    	   int z=x*y;
    	   System.out.println("Product of"+ x +"and" + y +" is" +z);
}
       
       public static int myDivision(int x, int y) {
    	   //int x=5,y=6;
    	   int z=x/y;
    	   System.out.println("Division of"+ x +"and" + y +" is" +z);
           return z;
     
       }
     

	} 

  
