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
public class Sphere extends ThreeDShape{
    Sphere(double D1)
    {
        super(D1,0.0,0.0);
    }
    double Area(){
        return 4*3.1416*getDim1()*getDim1();
    }
    double Volume(){
        return (4/3)*3.1416*getDim1()*getDim1()*getDim1();
    }
    
}
