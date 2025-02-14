package sample;

import java.util.Objects;

public class Notes {
    private  int bookNo;
    private String name;
    private String pages;

    public Notes() {
    }

    public Notes(int bookNo, String name, String pages) {
        this.bookNo = bookNo;
        this.name = name;
        this.pages = pages;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notes notes = (Notes) o;
        return bookNo == notes.bookNo && Objects.equals(name, notes.name) && Objects.equals(pages, notes.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookNo, name, pages);
    }
}
