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
public class Cube extends ThreeDShape{
    Cube(double D1)
    {
        super(D1,D1,D1);
    }
    double Area()
    {
        return 6*getDim1()*getDim2();
    }
    double Volume()
    {
        return getDim1()*getDim2()*getDim3();
        
    }
    
}
