/**
 * 
 */
package roseindia;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author 
 * 
 *
 */
public class ManyToManyRelation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessFact = null;
		Session session = null;
		try {
			sessFact=new Configuration().configure().buildSessionFactory();
			session=sessFact.openSession();
			
			Transaction tr = session.beginTransaction();
		
			
			//One author and may books
			Author author = new Author();	
			author.setAuthorName("ram");
			
			Author author2 = new Author();	
			author2.setAuthorName("Deepak");
			
			
			Set bookSet = new HashSet();
			//Solaris
			Book bookSolaris = new Book();
			bookSolaris.setBookName("Solaris in a week");
			bookSet.add(bookSolaris);
			
			//Linux
			Book bookLinux = new Book();
			bookLinux.setBookName("Linux in a week");
			bookSet.add(bookLinux);			
			
			//Oracle
			Book bookOracle = new Book();
			bookOracle.setBookName("Oracle in a week");
			bookSet.add(bookOracle);	
			
			//Add book set to the author object
			author.setBooks(bookSet);
			author2.setBooks(bookSet);
			
			session.save(author);
			session.save(author2);
			
			
	
			/*
			Book book = new Book();

			book.setBookName("Phoenix");
			
			Author author = new Author();
			Author author1 = new Author();
			Author author2 = new Author();
			Author author3 = new Author();
			author.setAuthorName("Clifford Geertz");
			author1.setAuthorName("JP Morgenthal");
			author2.setAuthorName("Yaswant Kanitkar");
			author3.setAuthorName("Phola Pandit");
			
			Set authorSet = new HashSet();
			authorSet.add(author);
			authorSet.add(author1);
			authorSet.add(author2);
			authorSet.add(author2);
			book.setAuthors(authorSet);
			
			session.save(book);
	*/
			
			
	
			
			/*
			//One author and may books
			Author author = new Author();	
			author.setAuthorName("John");
			
			Author author2 = new Author();	
			author2.setAuthorName("Deepak");
			
			
			Set bookSet = new HashSet();
			//Solaris
			Book bookSolaris = new Book();
			bookSolaris.setBookName("Solaris in a week");
			bookSet.add(bookSolaris);
			
			//Linux
			Book bookLinux = new Book();
			bookLinux.setBookName("Linux in a week");
			bookSet.add(bookLinux);			
			
			//Oracle
			Book bookOracle = new Book();
			bookOracle.setBookName("Oracle in a week");
			bookSet.add(bookOracle);	
			
			//Add book set to the author object
			author.setBooks(bookSet);
			
			
			author2.setBooks(bookSet);
			
			
			session.save(author);
			session.save(author2);
			
			
		    Set authors = new HashSet();
		    authors.add(author);
		    authors.add(author2);
		    
			
			//One Book and may authors
			
			//Create Book
			Book javaBook = new Book();
			javaBook.setBookName("Java in a week");
			
			javaBook.setAuthors(authors);
			
			//Save
			session.save(javaBook);
			*/
			
			//Create author set
			//Set authors = new HashSet();
			
			/*
			Author JohnAuth = new Author();
			JohnAuth.setAuthorName("John");
			authors.add(JohnAuth);

			Author deepakAuth = new Author();
			deepakAuth.setAuthorName("Deepak");
			authors.add(deepakAuth);

			Author manojAuth = new Author();
			manojAuth.setAuthorName("Manoj");
			authors.add(manojAuth);
			//Create and add authors
			
			//Add author set to book
			javaBook.setAuthors(authors);
			
			//Save
			session.save(javaBook);
			 */
			
			
			/*
			//Displaying all the books for the Author 2
			Author a = (Author)session.load(Author.class, 2);
			Set book = a.getBooks();
			System.out.println(a.getAuthorName());
			
			System.out.println("total=" + book.size());		
		    Iterator iter = book.iterator();
		    while (iter.hasNext()) {
		    
		      Book b = (Book)(iter.next());
		      System.out.println(b.getBookName());
		    }		

			*/
			tr.commit();
			System.out.println("Done");
		}
		catch(HibernateException He){
			System.out.println(He.getMessage());
		}
		finally{
			session.close();
		}

	}

}



/*	

Book book = new Book();

book.setBookName("Phoenix");

Author author = new Author();
Author author1 = new Author();
Author author2 = new Author();
Author author3 = new Author();
author.setAuthorName("Clifford Geertz");
author1.setAuthorName("JP Morgenthal");
author2.setAuthorName("Yaswant Kanitkar");
author3.setAuthorName("Phola Pandit");

Set bookSet = new HashSet();
bookSet.add(book);
//bookSet.add(book1);
author.setBooks(bookSet);

//A book is written by many authors  
Set authorSet = new HashSet();
authorSet.add(author);
authorSet.add(author1);
book.setAuthors(authorSet);


Book book1 = new Book();
book1.setBookName("Enterprise Applications Integration with XML and Java");


Set authorSet1 = new HashSet();
authorSet1.add(author2);
authorSet1.add(author3);
book1.setAuthors(authorSet1);


sess.save(book);
//sess.save(book1);

sess.save(author);
*/

