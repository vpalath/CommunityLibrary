package com.library.book.domain;

public class BookAuthor {
	
/*	1.	BOOK_ISBN_NO            12 CHARS    // PRIMARY KEY
	2.	BOOK_AUTHOR_SL       SMALLINT  // PRIMARY KEY
	3.	AUTHOR_NAME             40 CHAR*/
	
	private String isbn_no;
	private int author_sno;
	private String author_name;
	
	
	public BookAuthor() {
	}


	public BookAuthor(String isbn_no, int author_sno, String author_name) {
		super();
		this.isbn_no = isbn_no;
		this.author_sno = author_sno;
		this.author_name = author_name;
	}


	public String getIsbn_no() {
		return isbn_no;
	}


	public void setIsbn_no(String isbn_no) {
		this.isbn_no = isbn_no;
	}


	public int getAuthor_sno() {
		return author_sno;
	}


	public void setAuthor_sno(int author_sno) {
		this.author_sno = author_sno;
	}


	public String getAuthor_name() {
		return author_name;
	}


	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	
	
	
	

}
