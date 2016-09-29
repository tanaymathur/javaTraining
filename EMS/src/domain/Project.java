package domain;

public class Project {
	private int projectId;
	private String name;
	private String desc;
	private int deptId;

	public Project(int projectId, String name, String desc, int deptId) {
		this.projectId = projectId;
		this.name = name;
		this.desc = desc;
		this.deptId = deptId;
	}

}
