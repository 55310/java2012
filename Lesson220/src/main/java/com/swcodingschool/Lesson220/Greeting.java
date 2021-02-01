package com.swcodingschool.Lesson220;
/*
 * Step 2. Create Resource Representation Class
 * greeting에서는 id를 만든다
 */ 
public class Greeting {  
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	} // end of constructor

	public long getId() {
		return id;
	}						 							

	public String getContent() {
		return content;
	}
	
	/*
	 *  next : Step 3. create resource controller
	 *  GreetingController.java
	 */
	
} // end of class
