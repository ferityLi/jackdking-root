package com.jta.model.test;

public class People {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.id
     *
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.name
     *
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.age
     *
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.sex
     *
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    private String sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.id
     *
     * @return the value of people.id
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.id
     *
     * @param id the value for people.id
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.name
     *
     * @return the value of people.name
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.name
     *
     * @param name the value for people.name
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.age
     *
     * @return the value of people.age
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.age
     *
     * @param age the value for people.age
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.sex
     *
     * @return the value of people.sex
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.sex
     *
     * @param sex the value for people.sex
     * @mbg.generated Fri Nov 09 16:15:27 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}