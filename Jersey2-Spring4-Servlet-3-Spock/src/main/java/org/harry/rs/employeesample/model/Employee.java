package org.harry.rs.employeesample.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by harry on 7/31/14.
 */
@XmlRootElement
public class Employee {
    private String name;
    private String age;
    private Address mailingAddress;

    private Long Id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", mailingAddress=" + mailingAddress +
                ", Id=" + Id +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}
