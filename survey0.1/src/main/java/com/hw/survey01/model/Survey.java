package com.hw.survey01.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "survey")

public class Survey {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String zip;

    @Column(name = "telephone_number", nullable = false)
    private String telephoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(name = "date_of_survey", nullable = false)
    private Date dateOfSurvey;

    @Column(name = "liked_most", nullable = false)
    private String[] likedMost;

    @Column(name = "interested_in_university", nullable = false)
    private String interestedInUniversity;

    @Column(name = "recommend_likelihood", nullable = false)
    private String recommendLikelihood;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public String[] getLikedMost() {
        return likedMost;
    }

    public void setLikedMost(String[] likedMost) {
        this.likedMost = likedMost;
    }

    public String getInterestedInUniversity() {
        return interestedInUniversity;
    }

    public void setInterestedInUniversity(String interestedInUniversity) {
        this.interestedInUniversity = interestedInUniversity;
    }

    public String getRecommendLikelihood() {
        return recommendLikelihood;
    }

    public void setRecommendLikelihood(String recommendLikelihood) {
        this.recommendLikelihood = recommendLikelihood;
    }
}
