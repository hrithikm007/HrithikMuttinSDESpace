package com.confluent.kafkaCode.model;

public class Tutorial {
    String name;
    String publisher;
    String location;
    String type;

    @Override
    public String toString() {
        return "Tutorial{" +
                "name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", nameId='" + nameId + '\'' +
                '}';
    }

    String nameId;

    public Tutorial(String name, String publisher, String location, String type, String nameId) {
        this.name = name;
        this.publisher = publisher;
        this.location = location;
        this.type = type;
        this.nameId = nameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }
}
