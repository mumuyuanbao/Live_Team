package com.live.liveteam.entity;

public class Address {
    private Integer id;

    private String name;

    private Integer pId;

    public Address(Integer id, String name, Integer pId) {
        this.id = id;
        this.name = name;
        this.pId = pId;
    }

    public Address() {
        super();
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
        this.name = name == null ? null : name.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}