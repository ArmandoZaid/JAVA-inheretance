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
public class Students extends Person {

    private String nrp;
    private double ipk;
    
    public Students() {
        super();
    }
    
    public Students(String name, String email, String nrp, double ipk) {
        super(name, email);
        setNrp(nrp);
        setIpk(ipk);
    }
    
    public String getNrp() {
        return nrp;
    }

    /**
     * @param nrp the nrp to set
     */
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    /**
     * @return the ipk
     */
    public double getIpk() {
        return ipk;
    }

    /**
     * @param ipk the ipk to set
     */
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    @Override
    public String addDetails() {
        return "student with name : " + getName() + " email : " + getEmail() + " NRP : " + getNrp() + " IPK : " + getIpk();
    }
}
