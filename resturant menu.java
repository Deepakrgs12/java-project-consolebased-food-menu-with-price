package resturant;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		System.out.println("enter the number");
		// TODO Auto-generated method stub
	
				System.out.println("      LOGIN YOURSELF");
			Scanner in = new Scanner(System.in);
				System.out.println(" Enter the Username :-");
				String name=in.next();
				System.out.println("Enter the Password :-");
				String Pass=in.next();
				
				
				if(name.equals("psit") && Pass.equals("it")) {
					System.out.println("WELCOME TO ADMIN LOGIN");
					System.out.println("YOU HAVE SUCCESFULLY LOGIN.............!");
					System.out.println("Enter the group of people or people on which you are coming");
					int no=in.nextInt();
					
					
					if(no==1) {
					
					System.out.println("OUR ITEMS ARE(SINGLE PERSON):- ");
					
					String s="Apple Juice    (100Rs)";
					System.out.println("1."+s);
					String s1="Lemon Tea   (70Rs)";
					System.out.println("2."+s1);
					String s2="Coke   (80Rs)";
					System.out.println("3."+s2);
					String s3="COFFE    (100Rs)";
				System.out.println("4."+s3);
				String s4="TEA      (50Rs)";
					System.out.println("5."+s4);
					String s5="ICECREAM      (150Rs)";
					System.out.println("6."+s5);

					System.out.println("Please enter the no of item you want to select ");
				
					  int day =in.nextInt();
					  
					
					  
					  
				        String dayType;
				        String dayString;
				       
			        int sum=0;
				        for( int i=1;i<=day;i++)
				        	
				        {  System.out.println("Please enter the item number ");
				        	int item=in.nextInt();
				        
					     
				        switch (item)
				        {
				            case 1:  dayString = "Apple Juice";
				             System.out.println(dayString);
				          //  System.out.println("enter the quantity(number) of pizza");
				         //  int  day5 =in.nextInt();
				          int    k1=1*100;
				            System.out.println("cost is:"+k1);
				            sum=sum+k1;
				       
				            break;
				    
				            case 2:  dayString = "LEMON TEA";
				            System.out.println(dayString);
				          //  System.out.println("enter the quantity(number) of burger");
				         //   int day4 =in.nextInt();
				           int  k4=(1*70);
				            System.out.println("cost is:"+k4);
				            sum=sum+k4;
				         
				                     break;
				            case 3:  dayString = "Coke";
				            System.out.println(dayString);
				          //  System.out.println("enter the quantity(number) of snacks");
				         //   int day3 =in.nextInt();
				           int  k3=(1*80);
				            System.out.println("cost is:"+(k3));
				            sum=sum+k3;
				       
				                     break;
				            case 4:  dayString = "COFFE";
				            System.out.println(dayString);
				         //   System.out.println("enter the quantity(number) of coffe");
				         //   int day2 =in.nextInt();
				         int    k2=1*100;
				            System.out.println("cost is:"+(k2));
				            sum=sum+k2;
				     
				                     break;
				            case 5:  dayString = "TEA";
				            System.out.println(dayString);
				        //    System.out.println("enter the quantity(number) of tea");
				        //    int day1 =in.nextInt();
				          int   k11=1*50;
				            System.out.println("cost is:"+(k11));
				            sum=sum+k11;
				                     break;
				            case 6:
				            	 dayString = "ICE CREAM";
						            System.out.println(dayString);
						        //    System.out.println("enter the quantity(number) of tea");
						          //  int day1 =in.nextInt();
						          int   k21=1*150;
						            System.out.println("cost is:"+(k21));
						            sum=sum+k21;
				          break;
				            default: dayString = "Invalid NO....! Please enter the correct one";
				            System.out.println(dayString);
				            
				        }  
				 
				        
				      
				}
				        System.out.println("TOTAL BILL OF YOUR ITEM CHOOSE:-");
				      
				        System.out.println((sum));
					}
					else {
						System.out.println("OUR ITEMS ARE:- ");
						
						String s="PIZZA    (250Rs)";
						System.out.println("1."+s);
						String s1="BURGER   (200Rs)";
						System.out.println("2."+s1);
						String s2="SNACKS   (120Rs)";
						System.out.println("3."+s2);
						String s3="COFFE    (100Rs)";
						System.out.println("4."+s3);
						String s4="TEA      (50Rs)";
						System.out.println("5."+s4);
						String s5="CHINEESE  (150Rs)";
						System.out.println("6."+s5);

						System.out.println("Please enter the no of item you want to select ");
					
						  int day =in.nextInt();
						  
						
						  
						  
					        String dayType;
					        String dayString;
					       
				        int sum=0;
					        for( int i=1;i<=day;i++)
					        	
					        {  System.out.println("Please enter the item number ");
					        	int item=in.nextInt();
					        
						     
					        switch (item)
					        {
					            case 1:  dayString = "PIZZA";
					             System.out.println(dayString);
					            System.out.println("enter the quantity(number) of pizza");
					           int  day5 =in.nextInt();
					          int    k1=(day5*250);
					            System.out.println("cost is:"+k1);
					            sum=sum+k1;
					       
					            break;
					    
					            case 2:  dayString = "BURGER";
					            System.out.println(dayString);
					            System.out.println("enter the quantity(number) of burger");
					            int day4 =in.nextInt();
					           int  k4=(day4*200);
					            System.out.println("cost is:"+k4);
					            sum=sum+k4;
					         
					                     break;
					            case 3:  dayString = "SNACKS";
					            System.out.println(dayString);
					            System.out.println("enter the quantity(number) of snacks");
					            int day3 =in.nextInt();
					           int  k3=(day3*120);
					            System.out.println("cost is:"+(k3));
					            sum=sum+k3;
					       
					                     break;
					            case 4:  dayString = "COFFE";
					            System.out.println(dayString);
					            System.out.println("enter the quantity(number) of coffe");
					            int day2 =in.nextInt();
					         int    k2=day2*100;
					            System.out.println("cost is:"+(k2));
					            sum=sum+k2;
					     
					                     break;
					            case 5:  dayString = "TEA";
					            System.out.println(dayString);
					            System.out.println("enter the quantity(number) of tea");
					            int day1 =in.nextInt();
					          int   k11=day1*50;
					            System.out.println("cost is:"+(k11));
					            sum=sum+k11;
					                     break;
					            case 6:
					            	 dayString = "CHINEESE";
							            System.out.println(dayString);
							            System.out.println("enter the quantity(number of plate) of tea");
							            int day21 =in.nextInt();
							          int   k21=day21*150;
							            System.out.println("cost is:"+(k21));
							            sum=sum+k21;
							                     break;
					         
					          
					            default: dayString = "Invalid NO....! Please enter the correct one";
					            System.out.println(dayString);
					            
					        }  
					 
					        
					      
					}
					        System.out.println("TOTAL BILL OF YOUR ITEM CHOOSE:-");
					      
					        System.out.println((sum));}
					System.out.println("thank you for visting");
					}
				       
				else {
					System.out.println("PLEASE ENTER THE CORRECT DETAILS......!");
				}
			
			}

	
		}

	
