package dragons.book.data;

import dragons.book.modal.Book;

public class BooksData {
	
	Book[] books;
	
	public BooksData(){
	   this.books = new Book[5];
	   //Add booksDataGenerator method here in constructor;
	   booksDataGenerator();
	}
	
	
	 // Create a private void method call booksDataGenerator
	// Create 5 book to this array. 
	private void booksDataGenerator() {
		Book book1 = new Book("Harry Poter 1" ,"J.K Rooling" , 345, "ABS Publisher" ,65.2,1990);
		books[0] = book1;
		Book book2 = new Book("Harry Poter 2" ,"J.K Rooling" , 453, "ABS Publisher" ,75.2,1991);
		books[1] = book2;
		Book book3 = new Book("Harry Poter 3" ,"J.K Rooling" , 231, "ABS Publisher" ,85.2,1992);
		books[2] = book3;
		Book book4 = new Book("Harry Poter 4" ,"J.K Rooling" , 321, "ABS Publisher" ,95.2,1993);
		books[3] = book4;
		Book book5 = new Book("Harry Poter 5" ,"J.K Rooling" , 451, "ABS Publisher" ,89.2,1994);
		books[4] = book5;
		
		
		
	}
		// Create a private method that return a random int between 0 and the length of the array.
	     private int randomInt() {
	    	 int random =(int)(Math.random() * books.length);
	    	 return random;
	    	 
	     }
	     //Create a public method that return Book object
	     //which will pickup a random book from the array. 
		         public Book getRandomBook() {
			int index = randomInt();
			return books[index];
		}
	}


