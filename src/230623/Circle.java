/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labor 1
 */
public class Circle extends Shape {
    private float r;
    private float phi = 3.14f;

    public Circle() {
    }

    public Circle(float r) {
        this.r = r;
    }
    
    
    @Override
    public String getName(){
        return "Lingkaran";
    }
    @Override
    public double getArea(){
        return phi * r * r;
    }
    
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println("Luas Lingkaran  "+c.getArea());
    }
}
