package lab.model;

import lombok.Value;

import java.util.List;

@Value
public class UsualPerson implements Person {
    private int id;
    private String firstName;
    private String lastName;
    private Country country;
    private boolean programmer;
    private float height;
    private int age;
    private List<Contact> contacts;
}