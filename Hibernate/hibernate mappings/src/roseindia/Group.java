/**
 * 
 */
package roseindia;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class Group {
	
	  private int id;
	  private String name;
	  private List stories;

	  public Group(){
	  }

	  public Group(String name) {
	    this.name = name;
	  }

	  public void setId(int i) {
	    id = i;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setName(String n) {
	    name = n;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setStories(List sl) {
	    stories = sl;
	  }

	  public List getStories() {
	    return stories;
	  }

}
