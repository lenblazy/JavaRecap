package org.example.enums;

public enum Animal {
    CAT("Yow"), DOG("dow"), MOUSE("mow");

    private String name;

    public String getName() {
        return name;
    }

    Animal(String name) {
        this.name = name;
    }
}
