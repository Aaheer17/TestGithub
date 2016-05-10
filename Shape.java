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
public class Shape {
    private double dim1,dim2;
    Shape(double d1,double d2)
    {
        dim1=d1;
        dim2=d2;
    }
    double getDim1(){
        return dim1;
    }
    double getDim2(){
        return dim2;
    }
    
}
