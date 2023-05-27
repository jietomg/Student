package org.future.code.homework.std;

import java.util.Optional;

public class Student {
    private String name;
    private Optional<Address> address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = Optional.of(address);
    }

    public Student(String name) {
        this.name = name;
        this.address = Optional.empty();
    }

    public String getName() {
        return name;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
