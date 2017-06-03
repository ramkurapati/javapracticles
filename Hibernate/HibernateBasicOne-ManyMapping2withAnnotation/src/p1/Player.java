package p1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Player
{
	@Id
    @GeneratedValue
    @Column(name="p_id")
	 private int pid;
	@Column(name="player_fname")
	 private String pfname;
	@Column(name="player_lname")
	 private String plname;
	@Column(name="player_jersyno")
	 private int jersyno;
	

	 public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
	public String getPfname() {
		return pfname;
	}
	public void setPfname(String pfname) {
		this.pfname = pfname;
	}
	public String getPlname() {
		return plname;
	}
	public void setPlname(String plname) {
		this.plname = plname;
	}
	public int getJersyno() {
		return jersyno;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	
	
	
	 
}
