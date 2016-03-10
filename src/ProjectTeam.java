import java.util.ArrayList;

//add new class due to data clumps
public class ProjectTeam {
	
	private ArrayList<String> members;
	private String manager = null;
	
	public ProjectTeam() {
		members = new ArrayList<String>();
	}
	
	public void addMember(String member) {
		members.add(member);
	}

	public String removeMember(String member) {
		members.remove(member);
		return member;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public String getManager() {
		return manager;
	}
	
	 public ArrayList<String> getMembers() {
	 return members;
	 }

	
}
