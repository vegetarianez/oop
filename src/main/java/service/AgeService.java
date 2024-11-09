package service;

import exeption.InvalidAgeException;
import model.Human;

public class AgeService {
    public void setAge(int age, Human human) {
        try {
            if (age <= 0) {
                throw new InvalidAgeException("Возраст должен быть больше 0.");
            }

            System.out.println("Возраст изменен на " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            if (age < 0) {
                age = 0;
            }
        }
        human.setAge(age);
    }
}
