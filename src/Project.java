import java.util.ArrayList;

public class Project {
	// private String name = null;
	// private Duration duration = null;
	// private double rate = 0.0;
	// private int effortRequired = 0;;
	private ProjectInfo projectInfo;
	private ProjectTeam projectTeam;

	public Project() {
		// super(); //
		projectInfo = new ProjectInfo();
		projectTeam = new ProjectTeam();
	}

	public ProjectInfo getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public void setProjectTeam(ProjectTeam projectTeam) {
		this.projectTeam = projectTeam;
	}

	public ProjectTeam getProjectTeam() {
		return projectTeam;
	}

	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public Duration getDuration() {
	// return duration;
	// }
	//
	// public void setDuration(Duration duration) {
	// this.duration = duration;
	// }
	//
	// public double getRate() {
	// return rate;
	// }
	//
	// public void setRate(double rate) {
	// this.rate = rate;
	// }
	//
	// public int getEffortRequired() {
	// return effortRequired;
	// }
	//
	// public void setEffortRequired(int effortRequired) {
	// this.effortRequired = effortRequired;
	// }

	// public ArrayList<String> getMembers() {
	// return members;
	// }
	//
	// public String getManager() {
	// return manager;
	// }


	public String removeMember(String member) {
		projectTeam.removeMember(member);
		return member;
	}

	
	public void addMember(String member) {
		projectTeam.addMember(member);
	}

	public ArrayList<String> getMembers() {
		return projectTeam.getMembers();
	}

	public String getManager() {
		return projectTeam.getManager();
	}

}
