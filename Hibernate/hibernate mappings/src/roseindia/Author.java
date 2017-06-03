/**
 * 
 */
package roseindia;

import java.util.Set;


public class Author {
	
	private int id;
	private String authorName;
	private Set books;
	
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
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Set getBooks() {
		return books;
	}
	public void setBooks(Set books) {
		this.books = books;
	}

}
