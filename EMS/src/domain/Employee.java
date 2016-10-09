package domain;

import java.util.Date;

public class Employee {
//	private int employee_id;
	private String name;
	private int kinId;
	private String email;
	private long phoneNumber;
	private Date dob, dateOfJoining;
	private String address;
	private int deptId;
	private int projectId;
	private int roleId;

	public Employee(String name, int kin_id, String email, long phoneNumber, Date dob,
			Date dateOfJoining, String address, int deptId, int projectId, int roleId) {
//		this.Employee_id = employee_id;
		this.name = name;
		this.kinId = kin_id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
		this.deptId = deptId;
		this.projectId = projectId;
		this.roleId = roleId;
	}

	public int getKinId() {
		return kinId;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getDob() {
		return null;
	}

	public String getDateOfJoining() {
		return null;
	}

	public String getAddress() {
		return address;
	}

	public int getDeptId() {
		return deptId;
	}

	public int getProjectId() {
		return projectId;
	}

	public int getRoleId() {
		return roleId;
	}
	

}
