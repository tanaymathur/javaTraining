package domain;

import java.util.Date;

public class Employee {
//	private int employee_id;
	private String name;
	private int kinId;
	private String email;
	private int phoneNumber;
	private Date dob, dateOfJoining;
	private String address;
	private int deptId;
	private int projectId;
	private int roleId;

	public Employee(String name, int kin_id, String email, int phoneNumber, Date dob,
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public Date getDob() {
		return dob;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
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