public class Book {
    private String title;
    private int releaseYear;
    private String author;
    private int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.toLowerCase().contains(word) || author.toLowerCase().contains(word);
    }

    public int estimatePrice() {
        int price = pages * 3;
        return price < 250 ? 250 : price;
    }

    public void printInfo() {
        System.out.printf("Книга: \"%s\" (%d г.)\n", title, releaseYear);
        System.out.printf("Автор: %s, страниц: %d\n", author, pages);
        System.out.println("Большая книга: " + (isBig() ? "да" : "нет"));
        System.out.println("Оценочная стоимость: " + estimatePrice() + " руб.\n");
    }
}