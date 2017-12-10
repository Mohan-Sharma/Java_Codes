package org.msharma.noviceproblems.exception.Exercise;

import java.util.*;
class PolicyFinder
{
	public static void main(String arr[])
	{
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		ValueComparator bvc =  new ValueComparator(map1);
		TreeMap<String,Integer> policy1 = new TreeMap<String,Integer>(bvc);
		map1.put("2008",100);
		map1.put("2009",150);
		map1.put("2010",70);
		map1.put("2011",200);
		map1.put("2012",65);
		policy1.putAll(map1);
		/* System.out.println(map1);
System.out.println(policy1); 
*/
		HashMap<String,Integer> map2=new HashMap<String,Integer>();
		ValueComparator bvc1 =  new ValueComparator(map2);
		TreeMap<String,Integer> policy2 = new TreeMap<String,Integer>(bvc1);
		map2.put("2008",43);
		map2.put("2009",12);
		map2.put("2010",66);
		map2.put("2011",100);
		map2.put("2012",20);
		policy2.putAll(map2);
		/* System.out.println(map2);
System.out.println(policy2); */
		HashMap<String,Integer> map3=new HashMap<String,Integer>();
		ValueComparator bvc2 =  new ValueComparator(map3);
		TreeMap<String,Integer> policy3 = new TreeMap<String,Integer>(bvc2);
		map3.put("2008",55);
		map3.put("2009",21);
		map3.put("2010",100);
		map3.put("2011",89);
		map3.put("2012",121);
		policy3.putAll(map3);
		/* System.out.println(map3);
System.out.println(policy3); */
		HashMap<String,Integer> map4=new HashMap<String,Integer>();
		ValueComparator bvc3 =  new ValueComparator(map4);
		TreeMap<String,Integer> policy4 = new TreeMap<String,Integer>(bvc3);
		map4.put("2008",43);
		map4.put("2009",234);
		map4.put("2010",100);
		map4.put("2011",67);
		map4.put("2012",89);
		policy4.putAll(map4);
		/* System.out.println(map4);
System.out.println(policy4); */
		HashMap<String,Integer> map5=new HashMap<String,Integer>();
		ValueComparator bvc4 =  new ValueComparator(map5);
		TreeMap<String,Integer> policy5 = new TreeMap<String,Integer>(bvc4);
		map5.put("2008",122);
		map5.put("2009",45);
		map5.put("2010",197);
		map5.put("2011",34);
		map5.put("2012",12);
		policy5.putAll(map5);
		/* System.out.println(map5);
System.out.println(policy5); */
		System.out.println("Policy1 has highest sale in year :"+policy1.firstEntry());
		System.out.println("Policy2 has highest sale in year :"+policy2.firstEntry());
		System.out.println("Policy3 has highest sale in year :"+policy3.firstEntry());
		System.out.println("Policy4 has highest sale in year :"+policy4.firstEntry());
		System.out.println("Policy5 has highest sale in year :"+policy5.firstEntry());
		int s1=0;
		for(Integer i:policy1.values())
		{
			s1+=i;
		}
		int s2=0;
		for(Integer i:policy2.values())
		{
			s2+=i;
		}
		int s3=0;
		for(Integer i:policy3.values())
		{
			s3+=i;
		}
		int s4=0;
		for(Integer i:policy4.values())
		{
			s4+=i;
		}
		int s5=0;
		for(Integer i:policy5.values())
		{
			s5+=i;
		}
		System.out.println("Total number of policy1 sold : "+s1);
		System.out.println("Total number of policy2 sold : "+s2);
		System.out.println("Total number of policy3 sold : "+s3);
		System.out.println("Total number of policy4 sold : "+s4);
		System.out.println("Total number of policy5 sold : "+s5);
	}
}

class ValueComparator implements Comparator<String> {

	Map<String, Integer> base;
	public ValueComparator(Map<String, Integer> base) {
		this.base = base;
	}

	public int compare(String a, String b) {
		if (base.get(a) >= base.get(b)) {
			return -1;
		} else {
			return 1;
		}
	}
}