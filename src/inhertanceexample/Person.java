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
public class Person {
    
    private String name;
    private String email;
    
    public Person() {
        setName("unknown");
        setEmail("unknown");
    }
    
    public Person(String name,String email){
        setName(name);
        setEmail(email);
    } 
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String addDetails() {
        return "name: " + getName() + " email: " + getEmail();
    }
}
