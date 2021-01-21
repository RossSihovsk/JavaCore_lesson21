package Task1;

public class Person {
    @MyAnnotation("Для імені")
    String name;
    @MyAnnotation("Для прізвища")
    String surname;
    int age;
    @MyAnnotation("Для хоббі")
    String hobby;

    public Person(String name, String surname, int age, String hobby) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
