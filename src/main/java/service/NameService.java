package service;

import exeption.InvalidAgeException;
import exeption.NullNameException;
import model.Human;

import java.util.Objects;

public class NameService {
    public void setName(String name, Human human) {
        if (Objects.equals(name, "") || name == null) {
            throw new NullNameException("Имя не может быть пустым");
        }
        human.setName(name);
        System.out.println("Имя изменено на " + name);
    }
}
