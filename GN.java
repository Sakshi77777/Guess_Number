import java.util.*;
import java.util.Random;
class GN{
	public static void main(String args[]){

		 Scanner s = new Scanner (System.in);
	   	 int lower,upper;
	   	 System.out.println("Enter Lower Bound:");
	   	 lower =s.nextInt();
	   	 System.out.println("Enter Upper Bound:");
	   	 upper =s.nextInt();

		System.out.println("Random value of type int between "+lower+" to "+upper+ ":");
		int num = (int)(Math.random()*(upper-lower+1)+lower);
		 int x =(int)(Math.log(upper-lower+1)/Math.log(2));
		 System.out.println("You have Only "+x+" chances to guess the integer!");
		 int count=0;
		 while(count< x){
			 count +=1;

		 	 System.out.println("Enter the Number To Guess:");
		 	 int guess =s.nextInt();
		 	 if (num==guess){
				 System.out.println("Congratulations you did it in "+count +" try");
				 break;
		 }

		 else if(num>guess){
			 System.out.println("You Guessed Small Number");
		}
		 else if(num<guess){
			 System.out.println("You Guessed Large Number");
		}
	}
if (count>=x){
	 System.out.println("Number is "+num);
	 System.out.println("Better Luck Next time");
        }
	}
}