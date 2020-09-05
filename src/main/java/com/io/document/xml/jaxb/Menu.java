package com.io.document.xml.jaxb;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement
public class Menu {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String id;
    @XmlElement
    private List<Menu> child;

    public Menu() {
    }

    public Menu(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Menu> getChild() {
        return child;
    }

    public void setChild(List<Menu> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
