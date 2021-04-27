/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineManagement;
/**
 *
 * @author Sravya Sree Ogirala
 */
public class Address {
    
    String addressLine1;
    String addressLine2;
    String city;
    int zipCode;
    String state;
    String country;

    /*
    Constructor for Address object
     * @param addressLine1 First line of the address
     * @param addressLine2 Second line of the address
     * @param city City of vaccine center
     * @param zipCode Zip Code associated with the address
     * @param state Represents the State.
     * @param country Represents the country
    */
    public Address(String addressLine1) { 
   
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }
    
    /*
    Override the toString method to get a meaningful response upon
    printing the string.
    */
    @Override
    public String toString(){
        return  "\n" + addressLine1 + "\n"
                + addressLine2 + "\n"
                + city + "\n"
                + zipCode + "\n"
                + state + "\n"
                + country + "\n";
    }
    
}

    

