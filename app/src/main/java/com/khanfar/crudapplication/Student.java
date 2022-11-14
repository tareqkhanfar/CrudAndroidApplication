package com.khanfar.crudapplication;

public class Student {
    private String name;
    private int id;
    private int age ;
    private boolean superMan;
    private String city;
    private String loveMe ;

    public Student(String name, int id, int age ,boolean superMan, String city, String loveMe ) {
        this.name = name;
        this.id = id;
        this.superMan = superMan;
        this.city = city;
        this.loveMe = loveMe;
        this.age = age ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSuperMan() {
        return superMan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getSuperMan() {
        return superMan;
    }

    public void setSuperMan(boolean superMan) {
        this.superMan = superMan;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLoveMe() {
        return loveMe;
    }

    public void setLoveMe(String loveMe) {
        this.loveMe = loveMe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", superMan=" + superMan +
                ", city='" + city + '\'' +
                ", loveMe='" + loveMe + '\'' +
                '}';
    }
}
