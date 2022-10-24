public class Main {

    public static void main(String[] args) {
        System.out.println("Book 1");
        Author book = new Author(" Юмористические рассказы ", " Чехов Антон Павлович ", 2022);
        System.out.println("book.neme  " + book.getAuthor());
        System.out.println("author.neme  " + book.getName());
        System.out.println("book.releaseDate = " + book.getAge());
        book.setAge(2024);
        System.out.println("book.getAge() = " + book.getAge());
        System.out.println("=====================================");
        System.out.println("Book 2");
        Author book2 = new Author(" Ars grammatica ", " Алексей Михайлович Белов ", 2017);
        System.out.println("book.neme  " + book2.getAuthor());
        System.out.println("author.neme  " + book2.getName());
        System.out.println("book.releaseDate = " + book2.getAge());
        book2.setAge(2024);
        System.out.println("book.getAge() = " + book2.getAge());
            }
}