package net.hrkac.jaxb.dozer.domain;


public class Person {
    
    private Address mailingAddress;
    private Address residentialAddress;
    private String firstName;
    private String lastName;
    
    public Address getMailingAddress() {
        return mailingAddress;
    }
    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
    public Address getResidentialAddress() {
        return residentialAddress;
    }
    public void setResidentialAddress(Address residentialAddress) {
        this.residentialAddress = residentialAddress;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
