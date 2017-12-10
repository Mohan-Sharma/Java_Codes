import java.util.*;
class SalaryComparator implements Comparator
{
public int compare(Object o,Object p)
{
EmpforTree e1=(EmpforTree)o;
EmpforTree e2=(EmpforTree)p;
return e1.salary-e2.salary;
}
}