import java.util.*;
	
	class Test1{
		
		Scanner scanner = new Scanner(System.in);
		
		public static void main(String args[]){
		
			Test1 c = new Test1();
			System.out.println("Map Creation : 1");
			System.out.println("Add the key, value pairs and modify the existing values of keys:2");
			System.out.println("Add other Map object into this Map:3");
			System.out.println("Create a copy map:4");
			System.out.println("check the existance of a key and a value:5");
			System.out.println("Get the keys in the map:6");
			System.out.println("print Key and values of a Map:7");
			System.out.println("Modify the value of key :8");
			System.out.println("Remove on element  : 9");
			System.out.println("Get the first and last map only :10");
			System.out.println("Create a sub map from the keys of the original Map:11");
			System.out.println("Empty the map :12");
			System.out.println("Sorted the key :13");
			System.out.println("Reverse the map :14");
			System.out.println("store duplicate and null values in the Map and get the hash code of a Map :15");
			System.out.println("get the map content as comma separated string value : 16");
			System.out.println(":");
			System.out.println("SELECT THE NUMBER : ");
			
			int swit = c.scanner.nextInt();
	
		switch(swit){
			case 1:
				
				MapCreat();
				break;
			case 2 :
				MapModify();
				break;
			case 3:
				AddMap();
				break;
			case 4:
				CopyMap();
				break;
			case 5:
				ExistanceCheck();
				break;
			case 6:
				KeySets();
				break;
			case 7:
				KeyValue();
				break;
			case 8:
				ValueOfKey();
				break;
			case 9:
				RemoveKey();
				break;
			case 10:
				FirstLastElement();
				break;
			case 11:
				SubMap();
				break;
			case 12:
				EmptyMap();
				break;
			case 13:
				SortKeys();
				break;
			case 14:
				ReverseMap();
				break;
			case 15:
				DuplicateNull();
				break;
			case 16:
				Print_Comma();
				break;
			default:

				System.out.println("Enter the correct number");
		
		
		}
	}
	
	
// Create a Map
	public static void MapCreat(){
	
		Map<String,Integer>myMap=new HashMap<>();
		
			myMap.put("mark",22);
			myMap.put("age",23);
			myMap.put("num",24);
			myMap.put("id",25);
			
			System.out.println(myMap);
	}
	
// add the key, value pairs and modify the existing values of keys

	public static void MapModify(){
		//map creation 
		Map<String,Integer>myMap = new HashMap<>();
		
			myMap.put("ambulance",100);
			myMap.put("police",101);
			myMap.put("products",105);
			
			System.out.println(" map before modification : "+myMap);
			
			myMap.put("police",111);
			myMap.put("products",222);
			
			System.out.println("map after modification : "+myMap);
		
	}
	
//  Add other Map object into this Map
	
	public static void AddMap(){
	  //map creation 
		Map<String,Integer> myMap = new HashMap<>();
		
			myMap.put("soap",0);
			myMap.put("shambo",1);
			myMap.put("paste",2);
			
			//create another map
			
		Map<String,Integer> myMap1 = new HashMap<>();
		
			myMap1.put("android",5);
			myMap1.put("iphone",7);
			
			myMap.putAll(myMap1);
			System.out.println("Merging in one Map to other map "+myMap);
	}
	
//	create a copy map

	public static void CopyMap(){
		
		Map<String, Integer> originalMap = new HashMap<>();
			originalMap.put("ram", 5);
			originalMap.put("hevin", 10);
			originalMap.put("cyril", 8);

        // Create a copy of the original map
        Map<String, Integer> copyMap = new HashMap<>();
			copyMap.putAll(originalMap);

        // Print the contents of the copy map
        System.out.println("Contents of the copy map:");
        System.out.println(copyMap);
	}
	
// check the existance of a key and a value
	
	public static void ExistanceCheck(){
		Map<String,Integer>myMap = new HashMap<>();
		 myMap.put("red",10);
		 myMap.put("green",30);
		 myMap.put("blue",20);
		System.out.println("original map is :"+myMap);
		
		String KeyToCheck = "blue";
		if (myMap.containsKey(KeyToCheck)){
			System.out.println("Key '" + KeyToCheck + "' exists in the map.");
		}
		else{
				System.out.println("key'" + KeyToCheck + "'does not exists in the map.");
			}
		int ValueToCheck = 30;
		if(myMap.containsValue(ValueToCheck)){
			System.out.println("value '"+ ValueToCheck+"' exists in the map ");
		}
		else{
			System.out.println("value'"+ ValueToCheck+"'does not exists in the map");
		
		}
	}
//Get all the keys	
 public static void KeySets(){
	 
	 Map<String,Integer> myMap = new HashMap<>();
	  myMap.put("watermelon",1);
	  myMap.put("Cactus pear",2);
	  myMap.put("miracle fruit",3);
	  
	  System.out.println("oringinal map :");
	  System.out.println(myMap);
	  
	  Set<String> keys = myMap.keySet();
	  System.out.println("All keys in the map:");
	  for(String key : keys){
		  System.out.println(key);
	  }
    }
	
// iterate those keys and do the following
    // 1.print Key and values of a Map	
	
	public static void KeyValue(){
			Map<String,Integer> myMap = new HashMap<>();
			myMap.put("watermelon",1);
			myMap.put("Cactus pear",2);
			myMap.put("miracle fruit",3);
		  
		  System.out.println("oringinal map :");
		  System.out.println(myMap);
		  
		  for(String key : myMap.keySet()){
			  int value = myMap.get(key);
			  System.out.println("key : "+key+ " => " +"value:"+value);
		  }
	}
	
// 2.modify the value of the key	

	public static void ValueOfKey(){
		
	Map<String,Integer>myMap=new HashMap<>();
		myMap.put("cock",10);
		myMap.put("cuckoo",20);
		myMap.put("pigeon",30);
		myMap.put("bee",10);
		System.out.println("original map is :");
		System.out.println(myMap);
		
		System.out.println("After modifying key value :");
		
		myMap.put("cuckoo",myMap.get("cuckoo")+20);
		System.out.println(myMap);
	}
//Remove on element using key 

	public static void RemoveKey(){
		Map<String,Integer>myMap=new HashMap<>();
		myMap.put("Ostrich",10);
		myMap.put("durkey",20);
		myMap.put("rooster",30);
	  System.out.println("original map is :");
	  System.out.println(myMap);
	  
	  System.out.println( "After removing element :");
	  myMap.remove("durkey");
	  System.out.println(myMap);
	}
//Get the first and last map only 

	public static void FirstLastElement(){
        Map<String, Integer> map = new HashMap<>();
        map.put("hevin", 5);
        map.put("renish", 10);
        map.put("jp", 8);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<String, Integer> firstEntry = iterator.next();
        Map.Entry<String, Integer> lastEntry = null;
        while (iterator.hasNext()) {
            lastEntry = iterator.next();
        }

        System.out.println("First entry: " + firstEntry.getKey() + " => " + firstEntry.getValue());
        System.out.println("Last entry: " + lastEntry.getKey() + " => " + lastEntry.getValue());
	}
// Create a sub map from the keys of the original Map

	public static void SubMap(){
	  Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Five", 5);
        originalMap.put("Ten", 10);
        originalMap.put("Eight", 8);
        originalMap.put("Twelve", 12);

        Set<String> keys = new HashSet<>();
        keys.add("Twelve");
        keys.add("Ten");

        Map<String, Integer> subMap = new HashMap<>();
        for (String key : keys) {
            if (originalMap.containsKey(key)) {
                subMap.put(key, originalMap.get(key));
            }
        }

        System.out.println("Submap:");
        System.out.println(subMap);
    }
//Empty the map
	public static void EmptyMap(){
		Map<String,Integer> myMap = new HashMap<>();
		  myMap.put("watermelon",1);
		  myMap.put("Cactus pear",2);
		  myMap.put("miracle fruit",3);
		  
		  System.out.println("oringinal map :");
		  System.out.println(myMap);
		  
		  System.out.println("After empty map :");
		  myMap.clear();
		  System.out.println(myMap);
	}
// sorted the keys
	public static void SortKeys(){
		Map<String, Integer> map = new HashMap<>();
			map.put("apple", 5);
			map.put("banana", 10);
			map.put("orange", 8);
			
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);

        System.out.println("Sorted map:");	
		System.out.println(sortedMap);
	}
//reverse the map contents
	public static void ReverseMap(){
		
		Map<String,Integer> myMap = new HashMap<>();
		
		myMap.put("Hevin",1);
		myMap.put("Anisten",2);
		myMap.put("J",3);
		
		System.out.println("Orginal map :");
		System.out.println(myMap);
		
	Map<Integer,String> Reversemap = new HashMap<>();
	
	for (String key : myMap.keySet()){
			Integer value= myMap.get(key);
			Reversemap.put(value,key);
		}
			System.out.println("Reversed map:");
    for (Integer key : Reversemap.keySet()) {
			System.out.println(key + " => " + Reversemap.get(key));
  }
}
  
  // store duplicate and null values in the Map and get the hash code of a Map 
  
  public static void DuplicateNull(){
	  
	  Map<String,Integer> myMap = new  HashMap<>();
	  
		myMap.put("Rolex",24);
		myMap.put("FastTrack",33);
		myMap.put("patek philippe",null);
		myMap.put("Titan",55);
		
		System.out.println("original map is :");
		
		Integer hashCode = myMap.hashCode();
		
		System.out.println("hashCode of the map "+hashCode);
  }
  
// get the map content as comma separated string value

public static void Print_Comma(){
	Map<String,Integer> myMap = new HashMap<>();
	 myMap.put("Sunil",20);
	 myMap.put("Renil",30);
	 myMap.put("Mappi",40);
	 
	 System.out.println("Orginal map : "+myMap);
	 
	 int length = myMap.size();
	 
	 System.out.println("map length is : "+length);
	 
	 StringBuilder sb = new StringBuilder();
	 for (Map.Entry<String,Integer> entry : myMap.entrySet()){
		 
		sb.append(entry.getKey());
		sb.append("=");
		sb.append(entry.getValue());
		sb.append(",");
	 }
		
	 if(sb.length() > 0){
		 sb.setLength(sb.length()-2);
	 }
	 
	 System.out.println("map content as comma separated String : ");
	 System.out.println(sb.toString());
		 
    }	
}