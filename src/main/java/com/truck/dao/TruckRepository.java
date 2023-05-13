package com.truck.dao;
import com.truck.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TruckRepository  {
    @Autowired
    private JdbcTemplate jdbctemplate;
    private String query="select applicant,facilitytype,address,fooditems " +
            "from truck.mobile_food_facility_permit " +
            "where zipcodes=? " +
            "and status='APPROVED' " +
            "and MATCH(applicant,facilitytype,address,fooditems) against (?) ";
    public List<FoodTruck> findTrucks(String zip,String keywords){
        return jdbctemplate.query(query,new Object[]{zip,keywords},new BeanPropertyRowMapper(FoodTruck.class));
    }

}
