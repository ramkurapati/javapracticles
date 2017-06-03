/**
 * 
 */
package roseindia;

/**
 * @author Administrator
 *
 */
public class Story {
	
	private int id;
	  private String info;
	  private Group group;

	  public Story(){
	  }

	  public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Story(String info) {
	    this.info = info;
	  }

	  public void setId(int i) {
	    id = i;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setInfo(String n) {
	    info = n;
	  }

	  public String getInfo() {
	    return info;
	  }

}
