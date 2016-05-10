/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountsystem;

/**
 *
 * @author user
 */
public class BasicAccount extends BankAccount {
   private double checkAmount;
   private int countChecks;
   private int  checkbookNo;
   BasicAccount(int AN,String HN,String HT,String Bname,double b,double CA,int CC,int CBN)
   {    super(AN,HN,HT,Bname,b);
       checkAmount=CA;
       countChecks=CC;
       checkbookNo=CBN;
   }
   public double getCheckAmount(){
       return checkAmount;
   }
   public int getCountChecks(){
       return countChecks;
   }
   public int getCheckbookNo(){
       return checkbookNo;
   }
   public void DoCheck(double amnt)
   {    
       checkAmount=amnt;
       countChecks++;
       double temp=getBalance()-checkAmount;
       setBalance(temp);
       if(countChecks>5)
           setBalance(temp-100);
       
       
   }
   
}
