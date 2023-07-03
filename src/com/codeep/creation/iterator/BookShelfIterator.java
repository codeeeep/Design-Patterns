package com.codeep.creation.iterator;

/**
 * @author codeep
 * @date 2023/7/3 11:36
 * @description: Iterator 的具体实现
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
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
