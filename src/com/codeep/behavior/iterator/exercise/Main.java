package com.codeep.behavior.iterator.exercise;

/**
 * @author codeep
 * @date 2023/7/3 15:02
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Java1"));
        bookShelf.appendBook(new Book("Java2"));
        bookShelf.appendBook(new Book("Java3"));
        bookShelf.appendBook(new Book("Java4"));
        bookShelf.appendBook(new Book("Java5"));
        bookShelf.appendBook(new Book("Java6"));

        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }

}
