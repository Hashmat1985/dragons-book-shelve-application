package dragons.book.modal;

public class Book {
	
	// this class will hold information about one book
	//will use encapsulation concepts
	//it should have NoArgConstructor and AllArgsConstructor
	
	 
	private String  title;
	private String  author;
	private int     pages;
	 private String publisher;
	private double  price;
	private int  publishYear;
	
	public Book() {}
	
	public Book(String title, String author, int pages, String publisher, double price, int publishYear) {
		
	 this.title = title;
	this.author = author;
	this.pages = pages;
	this.publisher = publisher;
	this.price = price;
	this.publishYear = publishYear;
    
}

	public String getTitle() {
		return title;
	}

	  //lowercamelCase naming convention
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
}