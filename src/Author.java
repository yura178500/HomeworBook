public class Author {
    public String getAuthor;
    private String name;
    private String author;
    private int age;

    public Author(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;

    }
        public String getName() {
        return this.name();
    }

    private String name() {

        return this.name;
    }

    public String getAuthor() {
        return this.author();
    }

    private String author() {
        return author;
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
