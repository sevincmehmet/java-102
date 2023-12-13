package sarmalama;

public class Book {
    public String name;
    private int pageNumber;

    public Book(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = Math.max(pageNumber, 0); // sayfa sayısı sıfırdan  küçükse sıfıra eşitle
    }

    public int showPageNumber() {
        return pageNumber;
    }
    public void changePageNumber(int newPageNumber) {
        this.pageNumber = Math.max(newPageNumber, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
