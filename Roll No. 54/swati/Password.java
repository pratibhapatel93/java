import java.util.Scanner;
class Passwordver{

    public static void main(String[] args){

      
      Scanner sc= new Scanner(System.in); 
      boolean b=false;

      System.out.printf("Enter the Password:");
      String password=sc.next();

      if(password.length() <9){ //cheack char length
        b=false;
	System.out.printf("Password are at least 9 charater long"); //cheak the password length

      } //cheack each char acceptable
      for(int i=0; i<password.length(); i++){
	
	char c=password.charAt(i);

	if(('a'<= c&& c<='z') ||('A'<=c && c<='Z')||('0'<=c && c<='9')||('@'<=c && c<='%')){ //cheack the condition lowercase,uppercase/digit
	 b=true;
	}
	else{
	System.out.printf("only digit ,uppercase,lowercase,non-alphanumeric char accepted");
	b=false;
	}

      }
      //password is valid
    System.out.printf("password accepted and exits");

    }    
}


          
	   
	   


      
      
      


      
