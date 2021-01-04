package com.swcodingschool.array;
/*
 * Reference type의 배열 이해
 */
public class Book {
	private String bookName; // 책 제목
	private String author;   // 저자
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}

}
