package net.hrkac.examples.jaxb.helloworld.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    public Student() {
        
    }

    public Student(String firstName, String lastName, int age, int id) {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    
    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
                .append(lastName).append(", age=").append(age).append("]");
        return builder.toString();
    }
    
}
