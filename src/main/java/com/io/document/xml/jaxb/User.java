package com.io.document.xml.jaxb;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Date;
import java.util.List;


@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"userName", "age", "role", "date", "menu"})
@XmlRootElement(name = "user")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class User {
    @XmlElement
    private String userName;
    @XmlAttribute
    private int age;
    @XmlElement
    private String role;

    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement
    private Date date;
    @XmlElementWrapper(name = "menus")
    @XmlElement
    private List<Menu> menu;

    public User() {
    }

    public User(String userName, int age, String role, Date date) {
        this.userName = userName;
        this.role = role;
        this.age = age;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", date='" + date + '\'' +
                ", menu=" + menu +
                '}';
    }

}
