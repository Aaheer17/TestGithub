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
public class BankAccount extends Account {
    private String bankName;
    private double balance;
    BankAccount(int AN,String HN,String HT,String Bname,double b){
        super(AN,HN,HT);
        bankName=Bname;
        balance=b;
        
    }
    public void setbankName(String n)
    {
        bankName=n;
    }
    public void setBalance(double b)
    {
        balance =b;
    }
    public String getbankName()
    {
        return bankName;
    }
    public double getBalance()
    {
        return balance;
    }
}
