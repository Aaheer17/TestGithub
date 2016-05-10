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
public class ShapeHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle C=new Circle(12);
        Rectangle R=new Rectangle(10,20);
        Triangle T=new Triangle(12,35);
        Sphere S=new Sphere(5);
        Cube cu=new Cube(10);
        System.out.println("area of circle: "+C.Area());
        System.out.println("area of rectangle: "+R.Area());
        System.out.println("area of Triangle : "+T.Area());
        System.out.println("area of Sphere: "+S.Area());
        System.out.println("area of cube: "+cu.Area());
        System.out.println("volume of Sphere: "+S.Volume());
        System.out.println("volume of cube: "+cu.Volume());
    }
    
}
