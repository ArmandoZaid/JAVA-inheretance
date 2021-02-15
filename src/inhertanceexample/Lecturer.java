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
public class Lecturer extends Person {
    
    private int npk;
    private float salary;
    
    public Lecturer() {
        super();
    }
    
    public Lecturer(String name, String email, int npk, float salary) {
        super(name, email);
        setNpk(npk);
        setSalary(salary);
    }
    /**
     * @return the npk
     */
    public int getNpk() {
        return npk;
    }

    /**
     * @param npk the npk to set
     */
    public void setNpk(int npk) {
        this.npk = npk;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public String addDetails() {
        return "Lecturer with name: " + getName() + " email : " + getEmail() + " NPK : " + getNpk() + " Salary : " + getSalary();
    }
}
