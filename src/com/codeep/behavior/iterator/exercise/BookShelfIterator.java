package com.codeep.behavior.iterator.exercise;

/**
 * @author codeep
 * @date 2023/7/3 15:02
 * @description:
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
