package dragons.book.app;

import dragons.book.data.BooksData;
import dragons.book.modal.Book;
import dragons.book.utility.ConsoleInput;
import dragons.book.utility.ConsoleOutput;

public class BookShelveApplication {
	
	private static final String welcomeMessage = "Welcome to Book Shelve Application";
	
	public static void main(String[] args) {
		ConsoleOutput.info(welcomeMessage);
		//Create a Object of BooksData class.
		BooksData booksData = new BooksData();
		ConsoleInput input = new ConsoleInput();
{
		//Ask User How manny page you can read per day?
			int pagePerDay = input.getIntInput("How many page you can read per day?");
			
			//pick a random Book?
               Book book = booksData.getRandomBook();
			
			//print Book Information?
			
			ConsoleOutput.bookInfo(book);
			
			//how many days will take to read this book.
			double approxDaysToFinish = book.getPages() / pagePerDay;
			ConsoleOutput.info("Day to Finish this Book " + approxDaysToFinish);
			
		}
	}
}
		
			
		
	


