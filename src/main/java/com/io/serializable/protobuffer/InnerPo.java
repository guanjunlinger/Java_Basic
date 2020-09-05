package com.io.serializable.protobuffer;

import java.io.Serializable;

class InnerPo implements Serializable {
    private Integer id;
    private String name;

    public InnerPo() {
    }

    public InnerPo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return id + "-" + name;
    }

}
