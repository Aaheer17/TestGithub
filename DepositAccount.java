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
public class DepositAccount extends BankAccount{
    private double depositAmount;
    private int countCheck;
    DepositAccount(int AN,String HN,String HT,String bName,double b,double DA,int CC)
    {   super(AN,HN,HT,bName,b);
        depositAmount=DA;
        countCheck=0;
    }
    public void DoDeposit()
    {   
        if(depositAmount>100000)
        {
            double temp=getBalance()+depositAmount;
            setBalance(temp);
        }
        else System.out.println("Not Applicable");
    }
    public double getAfterWithdraw(int amnt)
    {   
        countCheck++;
        if(countCheck>3)
            return -1;
        if(getBalance()<amnt)
        {   System.out.println("the account does not have this much money");
            return 0;
        }
        else if(getBalance()>amnt)
        {
            return getBalance()-amnt-(depositAmount*10)/100;
        }
        return 1;
        
    }
    public double getCharged(){
        if(getBalance()<1000)
            return 1000;
        else return 0;
    }
    
}
