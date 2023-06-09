package dragons.book.utility;

import dragons.book.modal.Book;

public class ConsoleOutput {
	
	// Create a Static Method that takes String message and print it. 
	public  static void info(String message) {
		System.out.println("Info: " + message);
		
	}
	// Create a static method that take String message and print in error(in red)
	public static void error (String message) {
		System.out.println("Error: " + message);
	}
	// Create a static method that takes a book Object and print bood information.
	
	public static void bookInfo(Book book) {
		if (book != null) {
			info ("Book Title " + book.getTitle());
			info("Book Author " + book.getAuthor());
			info("Book Publisher " + book.getPublisher());
			info("Book Publish Year " + book.getPublishYear());
			info("Book Price $" + book.getPrice());
			info("Total Pages " + book.getPages());
			
		}else{
			error("Book can not be null");
			
		}
		
	}

}
