package com.oop;

import com.swcodingschool.array.Book;

/*
 * Reference Type 배열 사용
 */
public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("아리랑", "조정래");
	    library[2] = new Book("데미안", "헤르만헤세");     
	    library[3] = new Book("어떻게 살 것인가", "유시민");
		library[4] = new Book("토지", "박경리");
	
	    for(int i = 0; i <library.length; i++) {
	    library[i].showBookInfo();
	    }
	    //for(int i = 0; i <library.length; i++) {
	    	//System.out.println(library[i]);
		

   } // end of main
} // end of class
