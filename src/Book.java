public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name();
    }

    private String name() {

        return this.name;
    }

    public int getAge() {
        return this.age();
    }

    private int age() {
         return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

