package entity;

import lombok.Data;

@Data
public class User {

    private String name;
    private Integer id;
    private Integer age;
    private String role;

    public User(){

    }

    public User(String name, Integer id, Integer age, String role) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.role = role;
    }
}
