package collectionframewrk;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(int args) {
		System.out.println("Int args method");
		}
	static public void main(String args[]) {
		Map<String, String> hash_map=new HashMap<>();
		//insert record----put
		hash_map.put("1","Monday");
		hash_map.put("2","Tuesday");
		hash_map.put("3","Wedday");
		hash_map.put("4","Thurday");
		hash_map.put("5","Friday");
		hash_map.put("6","Saturday");
		hash_map.put("7","Sunday");
		hash_map.put("8","Sunday");
		//hash_table.remove("6");
		//System.out.println("After del 6 :"+hash_table);
		hash_map.putIfAbsent("9","Day");
		hash_map.putIfAbsent("6","Friday");
		//hash_table.put("10",null);
		System.out.println(hash_map);
		
		Map<Integer, String> hash_map1=new HashMap<>();
		hash_map1.put(41,"Adlin");
		hash_map1.put(12,"Gracy");
		hash_map1.put(3,"Daisy");
		hash_map1.put(3,"Cardii");
		hash_map1.put(7,null);
		System.out.println("HashMap:"+hash_map1);
		
		Map<Integer, String> hash_map2=new HashMap<>();
		hash_map2.put(41,"Adlin");
		hash_map2.put(12,"Gracy");
		hash_map2.put(3,"Daisy");
		hash_map2.put(3,"Cardii");
		hash_map2.put(7,null);
		System.out.println("Tree map:"+hash_map2);
		System.out.println("Enhance for loop in map");
		Set<Entry<Integer,String>> entrySet=hash_map2.entrySet();
		for(Entry<Integer,String> entry : entrySet)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		HashMap<String, String> hash_table;
		Map<String,String> hclone=(Map<String,String>)((HashMap<String,String>)hash_map).clone();
	    System.out.println("*****"+hclone);
		
		
	}

}
