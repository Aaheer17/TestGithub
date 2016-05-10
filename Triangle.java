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
public class Triangle extends TwoDShape{
    Triangle(double D1,double D2){
        super(D1,D2,0);
    }
    double Area(){
        return .5*getDim1()*getDim2();
    }
    
}
