/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertanceexample;

/**
 *
 * @author Armando Diaz
 */
public class InhertanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Person p = new Person();
//        System.out.println("Name : " + p.getName());
//        System.out.println("Email : " + p.getEmail());
//        
//        Lecturer l = new Lecturer("Armando", "armandodiazer@gmail.com", 160419114, 17000000);
//        System.out.println("Name : " + l.getName());
//        System.out.println("Email : " + l.getEmail());
//        System.out.println("NPK : " + l.getNpk());
//        System.out.println("Salary : " + l.getSalary());

          Person s = new Students("Armando", "armandodiazer@gmail.com", "160419114", 3.3);
          
          System.out.println(s.addDetails());
    }
    
}
