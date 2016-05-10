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
public class Account {
    private int accountNumber;
    private String holderName;
    private String holderType;
    Account()
    {
        
    }
    public void setName(String name){
        holderName=name;
    }
    public void setNum(int num){
        accountNumber=num;
    }
    public void setType(String type){
        holderType=type;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getHolderName()
    {
        return holderName;
    }
    public String getHolderType()
    {
        return holderType;
    }
    
    
}
