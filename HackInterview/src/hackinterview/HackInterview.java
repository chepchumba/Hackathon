/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackinterview;

import java.util.Scanner;

/**
 *
 * @author FJPETER
 */
public class HackInterview {

  
         public static void main(String[] args) {
            Scanner enterhere =new Scanner(System.in);
            boolean found=false;
            int x = 0;
            
            //create accounts
            System.out.print("Number of accounts you want to create? : ");
            int n=enterhere.nextInt();
            Hack  C[]=new Hack[n];
            
            for(int i=0;i<C.length;i++)
                {   
                    C[i]=new Hack();
                    C[i].createAccount();
                }
                String confirm="n";
                 
        do{
       
                System.out.println("Menu Option\n "
                           + "1.Balance All\n "
                           + "2.Deposit\n"
                           + "3.Withdrawal\n"
                           + "4.Quit\n");
                
                System.out.println("Option? :");
                x=enterhere.nextInt();
        
        switch(x){
            case 1:
                    for(int i=0;i<C.length;i++)
			{
			C[i].balance();
			}
			break;
                
                 case 2:
			System.out.print("Enter Account No : ");
			x=enterhere.nextInt();
			found=false;
			for(int i=0;i<C.length;i++)
				{  
				found=C[i].search(x);
				if(found)
                                    {
                                        C[i].deposit();
					break;
                                    }
				}
				if(!found)
					{
				System.out.println("Search Failed..Account Not Exist..");
					}
					break;
                      case 3:
			System.out.print("Enter Account No : ");
			x=enterhere.nextInt();
			found=false;
			for(int i=0;i<C.length;i++)
                            {  
				found=C[i].search(x);
				if(found)
                                    {
					C[i].withdrawal();
					break;
                                    }
					}
				if(!found)
					{
				System.out.println("Search Failed..Account Not Exist..");
					}
					break;
                          
                          case 4:                           
                              System.out.println("Do you want to Quit? y/n)");                           
                              confirm = enterhere.next();
                              
                              if(confirm.equals("y")){
                                      System.out.println("bye");
                                      break;
                              }
                              
                           }                         
        }
       
        while(x!=5 && "n".equals(confirm));
    }
    }
    


 class Hack {
    
     private long balance = 0;
    private int accno;
    private String name;
    
    Scanner enter =new Scanner(System.in);
    
  
    
     void createAccount(){
         System.out.print("Enter Account No: ");
            accno=enter.nextInt();
	System.out.print("Enter Name: ");
            name=enter.next();
	System.out.print("Enter Balance: ");
            balance=enter.nextLong();
     }
     
      void deposit()
    {
        long amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = enter.nextLong();
        balance = balance+amount;
        System.out.println("Deposited Successfull!");
        System.out.println( "Account Balance is "+balance);
        
        if(amount >= 40000){
            System.out.println("Maximum deposit amount is 40000");
        }
    }
      
      void balance(){
          System.out.println(accno+","+name+","+balance);         
      }
      
       //method to search an account number
	boolean search(int acn)
	{ 
		if(accno == acn )
		{ 
			balance();
			return(true);
		}
		return(false);
	}
        
        //method to withdraw money
	void withdrawal()
	{
            long amount;
            System.out.println("Enter Amount to be Withdrawn:");
            amount = enter.nextLong();
            
           
        if(amount<balance)
        {
            balance = balance-amount;
            System.out.println("Amount Withdrawn successful!");
            System.out.println("Available Balance: "+balance);
        }
        else if(amount>=20000){
            System.out.println("Amount should be 20000 per transaction");
        }
        else
        {
            System.out.println("Error: Insufficient funds!!");
        }
	}
    
}
