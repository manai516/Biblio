import java.util.Scanner;

public class Biblio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите название книги:");
            String title = scanner.nextLine();

            System.out.println("Год выпуска:");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Автор:");
            String author = scanner.nextLine();

            System.out.println("Количество страниц:");
            int pages = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, year, author, pages);

            book.printInfo();

            System.out.println("Введите слово для поиска в названии или авторе:");
            String word = scanner.nextLine();

            if (book.matches(word)) {
                System.out.println("Слово \"" + word + "\" найдено!");
            } else {
                System.out.println("Слово \"" + word + "\" не найдено.");
            }

            scanner.close();
        }
    }