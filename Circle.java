/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapehierarchy;

/**
 *
 * @author user
 */
public class Circle extends TwoDShape{
    Circle(double D1)
    {
        super(D1,0.0,0);
    }
    double Area(){
        return 3.1416*getDim1()*getDim1();
    }
}
