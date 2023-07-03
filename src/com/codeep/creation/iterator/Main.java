package com.codeep.creation.iterator;

/**
 * @author codeep
 * @date 2023/7/3 11:39
 * @description: 主函数，用于测试
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Redis 设计与实现"));
        bookShelf.appendBook(new Book("重构"));
        bookShelf.appendBook(new Book("代码整洁之道"));
        bookShelf.appendBook(new Book("深入理解 Java 虚拟机"));
        bookShelf.appendBook(new Book("Java 并发编程的艺术"));

       Iterator it = new BookShelfIterator(bookShelf);
       while(it.hasNext()){
           Book book = (Book)it.next();
           System.out.println(book.getName());
       }
    }

}
