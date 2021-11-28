package departments;

//Hr Department is also a sub-class of class SuperDepartment
public class HrDepartment extends SuperDepartment{
	
	// Method 1 creation with return type String
	public String departmentName() {
		return "Welcome to HR Department";
		}
	// Method 2 creation with return type String
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
		}
	// Method 3 creation with return type String
	public String getWorkDeadline() {
		return "Complete by EOD";
		}
	// Method 4 creation with return type String
	public String doActivity() {
		return "team Lunch";
		}
}
