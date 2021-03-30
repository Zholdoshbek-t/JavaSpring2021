public class Book implements Comparable{
    private Long ID;
    private String book_name;

    public Book(Long ID, String book_name) {
        this.ID = ID;
        this.book_name = book_name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", book_name='" + book_name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return this.book_name.compareTo(((Book) o).getBook_name());
    }
}
