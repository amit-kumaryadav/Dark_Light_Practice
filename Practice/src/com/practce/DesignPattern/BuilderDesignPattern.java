package com.practce.DesignPattern;

//This is the creational design pattern and used for creating the complex object. Separate the complex object creation from main object.
public class BuilderDesignPattern {
    private String name;
    private String address;

    public BuilderDesignPattern name(String name) {
        this.name = name;
        return this;
    }

    public BuilderDesignPattern address(String address) {
        this.address = address;
        return this;
    }

    public BuilderDesignPattern build() {
        return this;
    }

    public String getDetails() {
        return this.name + "  " + this.address;
    }

    public static void main(String args[]) {
        BuilderDesignPattern builderDesignPattern = new BuilderDesignPattern().name("Amit").address("Uttar pradesh").build();
        System.out.println(builderDesignPattern.getDetails());
    }
}
