/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided;

/**
 *
 * @author QWERTY
 */
public class Demo {
    public static void main(String[] args) {
      A superclass = new A();
      BextendsA subclass = new BextendsA();
        
        superclass.x = 3;
        superclass.y = 4;
        
        System.out.println("Superclass: ");
        superclass.tampilXY();

       
        // member superclass dapat diakses dari subclassnya
        subclass.x = 1;
        subclass.y = 2;
        subclass.z = 5;
        
        System.out.println("Subclass: ");
        subclass.jumlahXYZ();

    }
}
