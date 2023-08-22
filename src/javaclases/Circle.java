/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclases;

/**
 *
 * @author alumno
 */
public class Circle {
    private double radius = 5.0;
    private String color = "azul";

    public Circle() {}
    
    public Circle(double radio){
        this.radius = radio;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public String getRadius() {
        return Double.toString(radius);
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public String getArea(){
        
        double area;
        
        area = (this.radius*this.radius)*Math.PI;
        
        return Double.toString(area);
    
    }
    
    
}
