package departments;

//Tech Department is also a sub-class of class SuperDepartment
public class TechDepartment extends SuperDepartment{
	
	// Method 1 creation with return type String
	public String departmentName() {
		return "Welcome to Tech Department";
		}
	// Method 2 creation with return type String
	public String getTodaysWork() {
		return "Complete coding of Module 1";
		}
	// Method 3 creation with return type String
	public String getWorkDeadline() {
		return "Complete by EOD";
		}
	// Method 4 creation with return type String
	public String getTechStackInformation() {
		return "Core Java";
		}
}
