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
public class SavingsAccount extends BankAccount {
    private double depositAmount;
    private double withdrawalAmount;
    private int passbookNo;
    SavingsAccount(int AN,String HN,String HT,String Bname,double b,double d,double w,int p)
    {   super(AN,HN,HT,Bname,b);
        depositAmount=d;
        withdrawalAmount=w;
        passbookNo=p;
    }
    public double getDepositAmount(){
        return depositAmount;
        
    }
    public double getWithdrawalAmount()
    {
        return withdrawalAmount;
    }
    public int getPassBookNumber(){
        return passbookNo;
    }
    public void DoDeposit(int amount)
    {
        double temp=getBalance()+amount;
        setBalance(temp);
    }
    public double DoWithdrawal(int amount)
    {
        if(amount>getBalance())
            return 0;
        else return (amount+(getBalance()*15)/100);
    }
    public double ChargeSavings(){
        if(getBalance()<500)
            return 100.0;
        else return 0.0;
    }
}
