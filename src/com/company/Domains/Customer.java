package com.company.Domains;

import javax.persistence.*;

/**
 * Customer class, contains mostly contact information.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String surname;

    private String postcode;
    private String address;
    private String city;
    private String country;

    @Column(nullable = false)
    private String email;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    /**
     * DO NOT USE!
     */
    public Customer() {}   // Blank constructor to ensure JPA compatibility.

    /**
     * Create a new customer with only essential information.
     * @param firstname
     * @param surname
     * @param email
     */
    public Customer(String firstname, String surname, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
    }

    /**
     * Create a new customer with all possible information.
     * @param firstname
     * @param surname
     * @param postcode
     * @param address
     * @param city
     * @param country
     * @param email
     */
    public Customer(String firstname, String surname, String postcode, String address, String city, String country, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.postcode = postcode;
        this.address = address;
        this.city = city;
        this.country = country;
        this.email = email;
    }
}
