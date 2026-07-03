/*nama:rafli fairuz pramudya
/*nim:2501082012
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek23042026;

/**
 *
 * @author asus
 */
public class MainPoint {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point Rin = new Point(1, 2);
        System.out.println(Rin);
        
        Rin.setX(10);
        Rin.setY(3);
        System.out.println(Rin);
        System.out.println("X:"+Rin.getX());
        System.out.println("Y:"+Rin.getY());
        int[]xy=Rin.getXY();
        System.out.println("XY:("+xy[0]+","+xy[1]+")");
    }
    
}

