package com.truck.model;

import lombok.Data;
@Data
public class FoodTruck {
    private String applicant;
    private String facilitytype;
    private String address;
    private String fooditems;

    public String getApplicant() {
        return applicant;
    }

    public String getFacilitytype() {
        return facilitytype;
    }

    public String getAddress() {
        return address;
    }

    public String getFooditems() {
        return fooditems;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public void setFacilitytype(String facilitytype) {
        this.facilitytype = facilitytype;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFooditems(String fooditems) {
        this.fooditems = fooditems;
    }
}

