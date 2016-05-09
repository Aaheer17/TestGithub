
package enemyshiptesting;

import java.util.Scanner;



public class EnemyShipTesting {

    
    public static void main(String[] args) {
        EnemyShip theEnemy=null;
        EnemyShipFactory shipFactory=new EnemyShipFactory();
        
        Scanner userInput=new Scanner(System.in);
        
        System.out.println("What type of ship? (U/R/B)");
        if(userInput.hasNextLine())
        {
            String TypeofShip=userInput.nextLine();
            theEnemy=shipFactory.makeEnemyShip(TypeofShip);
        }
        
        
        if(theEnemy!=null)
        
            doStuffEnemy(theEnemy);
        else
            System.out.println("Enter a U,R or B next time: ");
    }
    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.EnemyShipShoots();
    }
}

