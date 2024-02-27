import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + book.getTitle() +
                    "\", Author: \"" + book.getAuthor() +
                    "\", Year: " + book.getPublicationYear() +
                    ", Rating: " + book.getRating() +
                    ", Reviews: " + book.getReviews().size());
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }

        return totalRating / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewedBook = books.get(0);
        int maxReviews = mostReviewedBook.getReviews().size();

        for (Book book : books) {
            int currentReviews = book.getReviews().size();
            if (currentReviews > maxReviews) {
                mostReviewedBook = book;
                maxReviews = currentReviews;
            }
        }

        return mostReviewedBook;
    }

    public static void main(String[] args) {
        User user1 = new User("Reiska", 67);
        User user2 = new User("Renttu", 47);

        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();

        library.addUser(user1);
        library.addUser(user2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        user1.borrowBook(book1);
        user1.borrowBook(book2);


        user2.borrowBook(book3);

        library.displayBooks();

        System.out.println("Average Book Rating: " + library.getAverageBookRating());

        Book mostReviewedBook = library.getMostReviewedBook();
        System.out.println("Most Reviewed Book: " + mostReviewedBook.getTitle());

        for (User user : library.users) {
            System.out.println(user.getName() + "'s Borrowed Books:");
            for (Book borrowedBook : user.getBorrowedBooks()) {
                System.out.println("- " + borrowedBook.getTitle());
            }
        }
    }
}