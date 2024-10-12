public abstract class Human implements Interface{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void say(){
        System.out.println("Меня зовут " + name + " мне " + age);
    }
}
