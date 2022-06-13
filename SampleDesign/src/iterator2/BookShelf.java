package iterator2;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList books;
    private int last = 0;

    //public BookShelf(int initialsize) {
    //    this.books = new ArrayList(initialsize);
    //}

    public BookShelf() {
        this.books = new ArrayList();
    }
    public Book getBookAt(int index) {
        return (Book)books.get(index);
    }
    public void appendBook(Book book) {
        this.books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
	@Override
	public ReverseIterator reverseiterator() {
		return null;
	}
}