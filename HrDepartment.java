package src;
import src.SuperDepartment;
public class HrDepartment extends SuperDepartment{
	String departmentName(){
		return " Hr Department ";
	}
	String getTodaysWork(){
		return "Fill today’s timesheet and mark your attendance";
	}
	String getWorkDeadline(){
		return "Complete by EOD ";
	}
	String doActivity(){
		return "team Lunch";
	}
}
