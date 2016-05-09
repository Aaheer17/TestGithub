/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemyshiptesting;

/**
 *
 * @author user
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;
    public String getName(){ return name;}
    public void setName(String newName){
        name=newName;
    }
    public double getDamage(){
        return amtDamage;
        
    }
    public void setDamage(double newDamage)
    {
        amtDamage=newDamage;
    }
    public void followHeroShip()
    {
        System.out.println(getName()+" is following the hero.");
    }
    public void displayEnemyShip()
    {
        System.out.println(getName()+" is on  the screen.");
        
        
    }
    public void EnemyShipShoots()
    {
        System.out.println(getName()+" attacks and does "+getDamage());
    }
    
}
