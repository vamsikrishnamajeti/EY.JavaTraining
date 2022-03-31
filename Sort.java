package com.HandsonExercise;
import java.util.*;
import java.util.Map.Entry;
public class Sort {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> m)
    {
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(m.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
	System.out.println("AFTER SORTING");
	HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
    for (Map.Entry<String, Integer> aa : list) {
        temp.put(aa.getKey(), aa.getValue());
    }
    return temp;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m=new HashMap<>();
		m.put("Vamsi",4);
		m.put("Raghava",3);
		m.put("Majeti",1);
		m.put("Krishna",5);
		m.put("Lakshmi",2);
		System.out.println("BEFORE SORTING");
		for(Entry<String, Integer> obj:m.entrySet()) {
			System.out.println(obj.getKey()+"---"+obj.getValue());
		}
	
        
        Map<String, Integer> hm1 = sortByValue(m);
        
        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println(  en.getKey() +
                          "---" + en.getValue());
        }
	}

}
