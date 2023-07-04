package com.codeep.behavior.iterator;

/**
 * @author codeep
 * @date 2023/7/3 11:26
 * @description: 书架，书的集合，传入书的本数
 */
public class BookShelf implements Aggregate{

    private Book[] books;
    private int last;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
