import java.util.Objects;

public abstract class Human implements Interface{
    int age;
    String name;

    public Human(int age, String name) {

        this.age = age;
        this.name = name;
    }
    public void setAge(int age) {
        try {
            if (age <= 0) {
                throw new InvalidAgeException("Возраст должен быть больше 0.");
            }
            this.age = age;
            System.out.println("Возраст изменен на " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public void setName(String name) throws NullNameException {
        if (Objects.equals(name, "") || name == null) {
            throw new NullNameException("Имя не может быть пустым");
        }
        this.name = name;
        System.out.println("Имя изменено на " + name);
    }

    public void say(){
        System.out.println("Меня зовут " + name + " мне " + age);
    }
}
