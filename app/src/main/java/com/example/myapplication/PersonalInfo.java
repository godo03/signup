package com.example.myapplication;

public class PersonalInfo {
    public PersonalInfo(String name, String city, String birthday, String age, String gender, String country, String contact,
                        String email, String ethnicity, String course) {
        this.name = name;
        this.city = city;
        this.birthday = birthday;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.contact = contact;
        this.email = email;
        this.ethnicity = ethnicity;
        this.course = course;
    }

    private String name;
    private String city;
    private String birthday;
    private String age;
    private String gender;
    private String country;
    private String contact;
    private String email;
    private String ethnicity;
    private String course;
    public PersonalInfo(){}

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
