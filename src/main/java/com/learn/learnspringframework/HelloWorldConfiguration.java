package com.learn.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

class Person {
    String name;
    int age;

    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

class Address {
    String firstLine;
    String city;

    public Address(String firstLine, String city) {
        this.firstLine = firstLine;
        this.city = city;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Kavya";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    @Primary
    public Person person() {
        Person person = new Person("Latha", 53, new Address("1 street", "chennai"));
        return person;
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        Address address = new Address("3rd cross street", "VNR");
        return address;
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        Address address = new Address("5th main street", "Chennai");
        return address;
    }

    @Bean
    public Person person3Parameters(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }
}
