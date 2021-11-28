package departments;

//Admin Department is a sub-class of class SuperDepartment
public class AdminDepartment extends SuperDepartment{
	
	// Method 1 creation with return type String
	public String departmentName() { 
		return "Welcome to Admin Department";
		}
	// Method 2 creation with return type String
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	// Method 3 creation with return type String
	public String getWorkDeadline() {
		return "Complete by EOD";
		}
}
