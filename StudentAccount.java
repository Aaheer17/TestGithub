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
public class StudentAccount extends Account{
    private String Institution;
    private String status;
    StudentAccount(int AN,String HN,String HT,String I,String S){
        super(AN,HN,HT);
        Institution=I;
        status=S;
    
    }
    public void setInstitution(String s)
    {
        Institution=s;
    }
    public void setStatus(String sts)
    {
        status=sts;
    }
    public String getInst()
    {
        return Institution;
    }
    public String getStatus()
    {
        return status;
    }
    
    
}
