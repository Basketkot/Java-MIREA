package ru.mirea.task2;

class Book {
    String name;
    String author;
    int pagesCount;

    Book(String xName, String xAuthor, int xPagesCount) {
        name = xName;
        author = xAuthor;
        pagesCount = xPagesCount;
    }

    public String toString() {
        return "Book: name=" + name + ", author=" + author + ", pages=" + pagesCount;
    }
}