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
public class AccountSystem {

    
    public static void main(String[] args) {
        String str1="X";
        String Type="permanent";
        String Bname="Sonali Bank";
        SavingsAccount SA=new SavingsAccount(1002,str1,Type,Bname,50000,10000,3000,234);
        BasicAccount BA=new BasicAccount(1002,str1,Type,Bname,50000,10000,3000,234);
        DepositAccount DA=new DepositAccount(1002,str1,Type,Bname,50000,10000,3000);
        
    }
    
}
