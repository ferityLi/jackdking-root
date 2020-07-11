package com.jta.mapper.test;


import java.util.List;

import com.jta.model.test.People;
	
 
public interface PeopleMapper {
    /**
     * Find all list.
     *
     * @return the list
     */
    List<People> findAll();

    /**
     * Delete by primary key boolean.
     *
     * @param id the id
     * @return the boolean
     */
    Boolean deleteByPrimaryKey(Integer id);

    /**
     * Insert boolean.
     *
     * @param record the record
     * @return the boolean
     */
    Boolean insert(People record);

    /**
     * Insert selective boolean.
     *
     * @param record the record
     * @return the boolean
     */
    Boolean insertSelective(People record);

    /**
     * Select by primary key people.
     *
     * @param id the id
     * @return the people
     */
    People selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective boolean.
     *
     * @param record the record
     * @return the boolean
     */
    Boolean updateByPrimaryKeySelective(People record);

    /**
     * Update by primary key boolean.
     *
     * @param record the record
     * @return the boolean
     */
    Boolean updateByPrimaryKey(People record);
}