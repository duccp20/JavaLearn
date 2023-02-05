package Session6.LearnOOP.BaiTap.QuanLyMuaBanSach;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class BookStore {
    private ArrayList<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void buyBook(Book book, int quantity) {
        boolean bookExists = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(book.getName())) {
                bookExists = true;
                books.get(i).setQuantity(books.get(i).getQuantity() + quantity);
                break;
            }
        }
        if (!bookExists) {
            books.add(book);
        }
    }

    public void sellBook(Book book, int quantity) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(book.getName())) {
                books.get(i).setQuantity(books.get(i).getQuantity() - quantity);
                break;
            }
        }
    }

    public double getRevenueByDay(int daySold) {
        double revenue = 0;
        Calendar cal = Calendar.getInstance();
        for (Book b : books) {
            Date date = b.getImportDate();
            cal.setTime(date);
            int day = cal.get(Calendar.DAY_OF_WEEK);
            if (day == daySold) {
                revenue += b.getPrice() * b.getQuantity();
            } else {
                System.out.println("Ngày này không bán được đơn sách nào cả!");
            }
        }
        return revenue;
    }

    public double getRevenueByMonth(int monthSold) {

        double revenue = 0;
        Calendar cal = Calendar.getInstance();
        for (Book b : books) {
            Date date = b.getImportDate();
            cal.setTime(date);
            int month = cal.get(Calendar.MONTH);
            if (month == monthSold) {
                revenue += b.getPrice() * b.getQuantity();
            } else  {
                System.out.println("Ngày này không bán được số sách nào cả");
            }
        }
        return revenue;
    }

    public int getInventoryCount() {
        int count = 0;
        for (Book b : books) {
            count += b.getQuantity();
        }
        return count;
    }

    public double getTotalImportValue() {
        double total = 0;
        for (Book b : books) {
            total += b.getPrice() * b.getQuantity();
        }
        return total;
    }
}
