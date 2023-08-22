package javaapplication1;

import javaclases.Circle;

public class CircleTest {

    
    public static void main(String[] args) {
        
        // Constructor por vacio
        Circle c = new Circle();
        
        //visualización de radio por defecto de 
        System.out.println("El radio por defecto del circulo es: "+c.getRadius());
        
        //visulización de áre del circulo
        String area;
        area = c.getArea();
        System.out.println("El área del circulo es: "+ area);
        
        //Constructor sobre cargado valor de radio = 6
        
        Circle c2 = new Circle(6);
        //visualización de radio modificado
        System.out.println("El radio modificado del circulo es: " + c2.getRadius());
        
        //visulización de áre del circulo
        String area2;
        area2 = c2.getArea();
        System.out.println("El área del circulo con radio modificado es: " + area2);
        
        
        
        
    }
    
    
}
