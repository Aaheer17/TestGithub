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
public class ThreeDShape extends Shape{
    private double dim3;
    ThreeDShape(double D1,double D2,double D3)
    {
        super(D1,D2);
        dim3=D3;
    }
    double getDim3()
    {
        return dim3;
    }
    
}
