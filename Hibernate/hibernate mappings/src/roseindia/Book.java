/**
 * 
 */
package roseindia;

import java.util.Set;


public class Book {
	
	private int id;
	private String bookName;
	private Set authors;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	/**
	 * @return the books
	 */

	public Set getAuthors() {
		return authors;
	}
	public void setAuthors(Set authors) {
		this.authors = authors;
	}
	

}
