import java.util.*;
public class Company {

	public static void main(String[] args) {
Employee e1=new Employee("e001","userOne");
Employee e2=new Employee("e002","userTwo");
Employee e3=new Employee("e003","userThree");
Employee e4=new Employee("e004","userFour");
Employee e5=new Employee("e001","userOne");

Dept d1=new Dept("d001","dev");
Dept d2=new Dept("d002","mgt");

 HashMap<Employee, Dept> map=new HashMap<Employee, Dept>();
		map.put(e1, d1);
		map.put(e2, d1);
		map.put(e3, d2);
		map.put(e4, d2);
		map.put(e5, d2);
		map.put(e5, d2);
		map.put(e1, d1);
		
Set<Employee> key=map.keySet();
for (Employee employee : key) 
{
	System.out.println(employee.empId+"   "+employee.Ename+"   ");
}
Set <Map.Entry<Employee, Dept>> set=map.entrySet();
Iterator<Map.Entry<Employee, Dept>> itr=set.iterator();
while(itr.hasNext())
{
Map.Entry m=(Map.Entry)itr.next();
System.out.println(m.getKey()+" "+m.getValue());
}		
}	
}

/* .......... Department class...........*/
class Dept {
	public String deptId;
	public String deptName;
	public Dept(String deptId,String deptName) {
		this.deptId=deptId;
		this.deptName=deptName;
	}
	
}

/* Here Employee class made as key by overriding hashCode() and equals() method.*/

class Employee {
public String empId;
public String Ename;

public Employee(String empId,String Ename) {
	this.empId=empId;
	this.Ename=Ename;

}

@Override
public int hashCode() {
	return 123456;
}

@Override
public boolean equals(Object o) {
	if (o instanceof Employee) {
		Employee emp=(Employee)o;
		if (this.empId.equalsIgnoreCase(emp.empId)) {
			return true;
		} else {
			return false;
		}
	} else {
		return false;
	}
}
}
