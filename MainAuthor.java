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
public class MainAuthor {
    public static void main(String[] args) {
        Author Rin =  new Author("rafli fairuz pramudya","rafli@gmail.com",'m');
        System.out.println(Rin);

        Rin.setEmail("rafli@gmail.com");
        System.out.println(Rin);
        System.out.println("name is: " + Rin.getName());
        System.out.println("gender is: " + Rin.getGender());
        System.out.println("gmail is: " + Rin.getEmail());
    }
    
}
