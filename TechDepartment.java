package src;
import src.SuperDepartment;
public class TechDepartment  extends SuperDepartment{
	String departmentName(){
		return " Tech Department ";
	}
	String getTodaysWork(){
		return " Complete coding of module 1";
	}
	String getWorkDeadline(){
		return "Complete by EOD ";
	}
	String getTechStackInformation(){
		return "Core Java";
	}
}
