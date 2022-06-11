
class Heart {
	int beat;
	int size;
	public Heart(int beat, int size) {
		super();
		this.beat = beat;
		this.size = size;
	}
	public int getBeat() {
		return beat;
	}
	public int getSize() {
		return size;
	}
	
}
class Book {
	String name ;
	String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}
// main object 
class Student {
	// heart is a composite object we must create instance inside the main object
	Heart h = new Heart(80,230);
	// since book is is a aggregate object we must created a method 
	void hasaBook(Book b){
	System.out.println(b.getAuthor());
	System.out.println(b.getName());
		
	}
}


public class Hasa {
public static void main(String[] args) {
	Student s = new Student ();
	Book b = new Book("maths","murali");
	System.out.println(s.h.getBeat());
	System.out.println(s.h.getSize());
	s.hasaBook(b);
	
	
	
	
	
}
}
