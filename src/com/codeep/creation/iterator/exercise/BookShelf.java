package com.codeep.creation.iterator.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author codeep
 * @date 2023/7/3 15:01
 * @description:
 */
public class BookShelf implements Aggregate{

    private List books;

    /**
     * ArrayList 默认的长度是 10，故我要给定初始化容量，不然还得写 11 本书
     * private static final int DEFAULT_CAPACITY = 10;
     * @param initialSize
     */
    public BookShelf(int initialSize){
        this.books = new ArrayList(initialSize);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public Book getBookAt(int index){
        return (Book)books.get(index);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }

}
