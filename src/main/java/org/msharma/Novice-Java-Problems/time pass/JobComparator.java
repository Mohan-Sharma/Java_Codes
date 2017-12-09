import java.util.*;
class JobComparator implements Comparator
{
public int compare(Object o,Object p)
{
EmpforTree e1=(EmpforTree)o;
EmpforTree e2=(EmpforTree)p;
return e1.job.compareTo(e2.job);
}
}