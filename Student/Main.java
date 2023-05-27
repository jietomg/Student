package org.future.code.homework.std;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Tom", new Address("Moscow", "Region"));
        Student student1 = new Student("Sam");
        printStudentInfo(student);
        printStudentInfo(student1);
    }

    public static void printStudentInfo(Student student) {
        System.out.println("---------- Student ----------");
        System.out.println("Name: " + student.getName());
        if (student.getAddress().isPresent()) {
            Address address = student.getAddress().get();
            System.out.println("City: " + address.getCity());
            System.out.println("Region: " + address.getRegion());
        }
        System.out.println("-----------------------------");
    }
}
