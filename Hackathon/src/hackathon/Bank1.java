/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.util.Scanner;

/**
 *
 * @author FJPETER
 */
public class Bank1 {
    
    int acno;
    float bal=0;
    Scanner get = new Scanner(System.in);
    Bank1()      
        {
        System.out.println("Enter Account Number:");
        acno = get.nextInt();
        System.out.println("Enter Initial Balance:");
        bal = get.nextFloat();        
        }
        
       void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();
        bal = bal+amount;
        System.out.println("Deposited! Account Balance is "+bal);
    }
    void withdraw()
    {
        float amount;
        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();
        if(amount<bal)
        {
            bal = bal-amount;
            System.out.println("Amount Withdrawn!! Available Balance: "+bal);
        }
        else
        {
            System.out.println("Insufficient funds!!");
        }
    }
    }

     class Test {
    public static void main(String[] args)
    {
        Bank1 myObj = new Bank1();
        myObj.deposit();
        myObj.withdraw();       
    }
}

