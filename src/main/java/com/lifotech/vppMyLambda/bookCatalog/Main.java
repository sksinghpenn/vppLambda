package com.lifotech.vppMyLambda.bookCatalog;

import java.util.List;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		//List<Book> foundBooks = bc.findBooks(someLambdaExpression);

		Predicate<Book> predicate = (book -> {
			return book.getTitle().contains("men");
		});

		List<Book> foundBooks = bc.findBooks(predicate);
	
		for (Book nextBook : foundBooks) {
			System.out.println (nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
	}
}
