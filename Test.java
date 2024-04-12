import java.util.*;
import java .util.Scanner;

	public class Test
	{
		Scanner scanner = new Scanner(System.in);
		
		public static void main(String args[]) 
		{
			Test c = new Test();
			
			System.out.println("Create a Set: 1");
			System.out.println("Modify the element: 2");
			System.out.println("Add other Set object into this Set: 3");
			System.out.println("create a copy of a Set and copy the array of elements into the Set : 4");
			System.out.println("The existance of an element in a Set and get it's index number : 5");
			System.out.println("Get an element by it's index number : 6");
			System.out.println("Remove an element from Set by it's index and name : 7");
			System.out.println("Remove a set of elements in a Set from index a to index b : 8");
			System.out.println("Get the size of a Set and check is it empty or not : 9");
			System.out.println("Convert a Set to array :10 ");
			System.out.println("Set of elements print in forward and reverse order : 11");
			System.out.println("Remove an element using Iterator remove method : 12");
			System.out.println("Remove an element using Set remove method :13");
			System.out.println("Iterate through Iterator object Set store Maps:14 ");
			System.out.println("Get the Map and modify the value for the given key simple program :15");
			System.out.println("Get the Map and delete the key and value :16");
			System.out.println("Get the Map and delete that map from Set through remove method of Iterator and Set : 17");
			System.out.println("Make the Set to store only String values: 18");
			System.out.println("Make the Set to store only Maps : 19");
			System.out.println("Empty the Set in simple program: 20");
			System.out.println("check the existance of Set of elements in the origial Set : 21");
			System.out.println("Inserting an element in the middle of a Set : 22");
			System.out.println("find all the indexes of an element in the Set in forward and reverse order : 23");
			System.out.println("create a new Set from set of elements in the original Set: 24");
			System.out.println("store duplicate and null values in the Set and get the hash code of a Set:25");
			System.out.println("");
			System.out.println("Select the number:");
			
			int swit = c.scanner.nextInt();
			
			 switch(swit){
			
					case 1:
					
						Create();
						break;
					case 2:
					
						ModifyElements();
						break;
					case 3:
					
						ObjectIntoSet();
						break;
					case 4:
					
						CopyiedSet();
						break;
					case 5:
					
						GetIndexNo();
						break;
					case 6:
					
						GetElementIndex();
						break;
					case 7:
					
						RemoveElemnetSet();
						break;
					case 8:
					
						IndexATOBremove();
						break;
					case 9:
					
						EmptyorNot();
						break;
					case 10:
					
						CovertToArray();
						break;
					case 11:
					
						ForwardandReverse();
						break;
					case 12:
					
						IteratorRemove();
						break;
					case 13:
					
						RemoveMethod();
						break;
					case 14:
					
						MapsIterator();
						break;
					case 15:
					
						MapModifyied();
						break;
					case 16:
					
						MapKeyDelete();
						break;
					case 17:
					
						MapDelete();
						break;
					case 18:
					
						SetStoreString();
						break;
					case 19:
						SetStoreMap();
						break;
					case 20:
					
						EmptySet();
						break;
					case 21:
					
						ExistanceElement();
						break;
					case 22:
					
					    InsertSet();
						break;
					case 23:
					
						IndexForwardandReverse();
						break;
					case 24:
					
						OrginalSet();
						break;
					case 25:
					
						SetHashCode();
						break;
						
						
						default:
					
						System.out.println("The particular number not valid");
			}
					
		}
		
// Create a Set

	public static void Create(){ 
		
		//creating set
				Set<String> mySet= new HashSet<>();
				
				mySet.add("peacock");
				mySet.add("dove");
				mySet.add("cow");
				mySet.add("dog");
				mySet.add("cow");
				
				System.out.println("Elements of the set : ");
				for(String element : mySet){
					System.out.println(element);
       }					
	}
//Add elements and modify the existing elements
		public static void ModifyElements(){
			Set<String> mySet= new HashSet<>();
				
				mySet.add("peacock");
				mySet.add("dove");
				mySet.add("cow");
				mySet.add("dog");
				
				System.out.println("Elements before modification: ");
				System.out.println(mySet);
				
				//remove
				mySet.remove("cow");
				mySet.add("modified cow");
				
				System.out.println("Elements after modifying : ");
				System.out.println(mySet);
				
		}
//Add other Set object into this Set
	
	public static void ObjectIntoSet(){
		Set<String> mySet = new HashSet<>();
			mySet.add("Tiger");
			mySet.add("Cat");
			mySet.add("Lion");
	
			
		Set<String>mySet1 = new HashSet<>();
		
			mySet1.add("Ice cream");
			mySet1.add("Biscuts");
			
			System.out.println("Elements of the first Set before modification:");
			System.out.println(mySet);
			
			mySet.addAll(mySet1);
			
			System.out.println("Elements of the first Set after adding the second Set: ");
			System.out.println(mySet);
	}

//create a copy of a Set and copy the array of elements into the Set
 
 public static void CopyiedSet(){
		Set<String> mySet = new HashSet<>();
			mySet.add("Laptop");
			mySet.add("Car");
			mySet.add("Lion");
			
			System.out.println("Orginal Set :"+mySet);
			Set <String> CopySet= new HashSet<>(mySet);
			System.out.println("CopySet: "+CopySet);
			
			String [] ArrayElements ={"Hevin","Anisten"};
			
			CopySet.addAll(Arrays.asList(ArrayElements));
			 System.out.println("Copied Set after adding array elements: "+CopySet);
		}
//check the existance of an element in a Set and get it's index number

     public static void GetIndexNo(){
    // Create a Set and a List to store elements
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        // Add elements to the Set and List
        set.add("vijay");
        set.add("Ajith");
        set.add("Maddy");
     // Add all elements from Set to List
        list.addAll(set); 

        // Element to search for
        String elementToFind = "Maddy";

        // Check if the element exists in the Set
        if (set.contains(elementToFind)) {
            // Get the index of the element in the List
            int index = list.indexOf(elementToFind);
            System.out.println("Element '" + elementToFind + "' exists in the Set at index: " + index);
        } else {
            System.out.println("Element '" + elementToFind + "' does not exist in the Set.");
        }
	} 

// get an element by it's index number
	public static void GetElementIndex(){
		Set<String> set = new HashSet<>();

			// create Set
			set.add("iphone");
			set.add("android");
			set.add("macbook");

			// get element in index number
			int indexToGet = 1; 
			int currentIndex = 0;
			for (String element : set) {
				if (currentIndex == indexToGet) {
					System.out.println("Element at index " + indexToGet + ": " + element);
					return;
				}
				currentIndex++;
			}

			System.out.println("Index is out of bounds");
	}
	
// remove an element from Set by it's index and name


	public static void RemoveElemnetSet(){
		// Create a Set
        Set<String> set = new HashSet<>();

        // Add elements to the Set
        set.add("hospital");
        set.add("church");
        set.add("School");

        // Print the Set before removal
        System.out.println("Set before removal: " + set);

        // Element to remove
        String elementToRemove = "hospital";

        // Remove the element from the Set
        boolean removed = set.remove(elementToRemove);

        if (removed) {
            System.out.println("Element '" + elementToRemove + "' removed successfully");
        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the Set");
        }

        // Print the Set after removal
        System.out.println("Set after removal: " + set);
    }
	
//remove a set of elements in a Set from index a to index b	
	public static void IndexATOBremove(){
	    // Create a Set
        Set<String> set = new HashSet<>();

        // Add elements to the Set
        set.add("dhoni");
        set.add("virat");
        set.add("bravo");
        set.add("koli");
        set.add("smith");

        // Print the Set before removal
        System.out.println("Set before removal: " + set);

        // Remove elements from index a to index b 
        int indexA = 1; 
        int indexB = 3; 
        removeElementsByRange(set, indexA, indexB);

        // Print the Set after removal
        System.out.println("Set after removal: " + set);
    }

    public static void removeElementsByRange(Set<String> set, int indexA, int indexB) {
        int currentIndex = 0;
        for (String element : new HashSet<>(set)) {
            if (currentIndex >= indexA && currentIndex <= indexB) {
                set.remove(element);
            }
            currentIndex++;
        }
	}
	
//get the size of a Set and check is it empty or not
	public static void EmptyorNot(){	
	   // Create a Set
        Set<String> set = new HashSet<>();

        // Add elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Get the size of the Set
        int size = set.size();

        // Check if the Set is empty
        boolean isEmpty = set.isEmpty();

        // Print the results
        System.out.println("Size of the Set: " + size);
        System.out.println("Is the Set empty?  : " + isEmpty);
    }
//convert a Set to array
	public static void CovertToArray(){	
		 Set<Integer> numberSet = new HashSet<>();
			numberSet.add(1);
			numberSet.add(2);
			numberSet.add(3);
			numberSet.add(4);
			numberSet.add(5);

			// Convert Set to Array
			Integer[] numberArray = numberSet.toArray(new Integer[numberSet.size()]);

			// Print the elements of the array
			System.out.println("Elements of the array:");
			for (Integer num : numberArray) {
				System.out.println(num);
     }
   }
  // iterate through Iterator object
// 1. print Set of elements in forward and reverse order
 
   public static void ForwardandReverse(){
    Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // Forward order iteration
        System.out.println("Forward order iteration:");
        Iterator<Integer> forwardIterator = set.iterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        // Reverse order iteration
        System.out.println("\nReverse order iteration:");
        List<Integer> tempList = new ArrayList<>(set);
        Collections.reverse(tempList);
        for (Integer element : tempList) {
            System.out.println(element);
        }
   }
// 2. remove an element using Iterator remove method
	public static void IteratorRemove(){	
		// Creating a List of elements
			List<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);

        // Creating an iterator for the list
        Iterator<Integer> iterator = list.iterator();

        // Iterating through the list and removing elements
        System.out.println("List before removal: " + list);
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 == 0) {
                iterator.remove(); 
            }
        }

        // Printing the list after removal
        System.out.println("List after removal: " + list);
    }
	
// 3.remove an element using Set remove method 	
	public static void RemoveMethod(){
	 Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // Removing an element using the remove method
        System.out.println("Set before removal: " + set);
        set.remove(3); // Removing element 3
        System.out.println("Set after removal: " + set);
    }
	
// Store Set of Maps in the Set
 // 1.iterate through Iterator object
 
 public static void MapsIterator() {
        // Creating Maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C", 3);
        map2.put("D", 4);
        
        // Creating a Set of Maps
        Set<Map<String, Integer>> setOfMaps = new HashSet<>();
        setOfMaps.add(map1);
        setOfMaps.add(map2);

        // Iterating through the Set of Maps
        Iterator<Map<String, Integer>> iterator = setOfMaps.iterator();
        while (iterator.hasNext()) {
            Map<String, Integer> map = iterator.next();
            System.out.println("Map:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
        }
	}
// get the Map and modify the value for the given key simple program

	public static void MapModifyied(){
	  // Creating a Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
		
		System.out.println("Orginal map is :");
		System.out.println(map);
        
        // Creating a Set of Maps
        Set<Map<String, Integer>> setOfMaps = new HashSet<>();
        setOfMaps.add(map);

        // Key to modify and new value
        String keyToModify = "B";
        int newValue = 10;

        // Modifying value for the given key in the map
        for (Map<String, Integer> m : setOfMaps) {
            if (m.containsKey(keyToModify)) {
                m.put(keyToModify, newValue);
                break; // Break the loop after modifying the value
            }
        }

        // Printing the updated map
        for (Map<String, Integer> m : setOfMaps) {
            System.out.println("Updated Map:");
            for (Map.Entry<String, Integer> entry : m.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
	
// 3.get the Map and delete the key and value 
	public static void MapKeyDelete(){
		Map<String, Integer> map1 = new HashMap<>();
			map1.put("A", 1);
			map1.put("B", 2);
			
			Map<String, Integer> map2 = new HashMap<>();
			map2.put("C", 3);
			map2.put("D", 4);
			
			// Creating a Set of Maps
			Set<Map<String, Integer>> setOfMaps = new HashSet<>();
			setOfMaps.add(map1);
			setOfMaps.add(map2);

			// Key to delete
			String keyToDelete = "B";

			// Deleting the key and its corresponding value from a map in the set
			for (Map<String, Integer> map : setOfMaps) {
				if (map.containsKey(keyToDelete)) {
					map.remove(keyToDelete);
				}
			}

			// Printing the set of maps after deletion
			for (Map<String, Integer> map : setOfMaps) {
				System.out.println("Updated Map:");
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
			}
    }
	
// 4.get the Map and delete that map from Set through remove method of Iterator and Set
	public static void MapDelete(){
		 // Creating Maps
			Map<String, Integer> map1 = new HashMap<>();
			map1.put("A", 1);
			map1.put("B", 2);
			
			Map<String, Integer> map2 = new HashMap<>();
			map2.put("C", 3);
			map2.put("D", 4);
			
			// Creating a Set of Maps
			Set<Map<String, Integer>> setOfMaps = new HashSet<>();
			setOfMaps.add(map1);
			setOfMaps.add(map2);

			// Getting the first map from the set
			Iterator<Map<String, Integer>> iterator = setOfMaps.iterator();
			Map<String, Integer> mapToDelete = iterator.next();

			// Deleting the map from the set
			iterator.remove();

			// Printing the set of maps after deletion
			for (Map<String, Integer> map : setOfMaps) {
				System.out.println("Remaining Map:");
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
			}
      }
	  
// Make the Set to store only String values
	public static void SetStoreString(){
		Set<String> stringSet = new HashSet<>();
        
        // Adding strings to the set
        stringSet.add("Hi Hello");
        stringSet.add("How Are You ?");
        stringSet.add("What Are You Doing ?");
        
        // Printing the set of strings
        System.out.println("Set of strings:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }

//Make the Set to store only Maps 
public static void SetStoreMap(){

 // Create a Set to store Maps
        Set<Map<String, Integer>> mapSet = new HashSet<>();

        // Create some sample maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("x", 10);
        map2.put("y", 20);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("foo", 100);
        map3.put("bar", 200);

        // Add maps to the set
        mapSet.add(map1);
        mapSet.add(map2);
        mapSet.add(map3);

        // Display the contents of the set
        System.out.println("Maps in the Set:");
        for (Map<String, Integer> map : mapSet) {
            System.out.println(map);
        }
    }	
	
// Empty the Set in simple program

public static void EmptySet(){


   // Create a Set to store Maps
        Set<Map<String, Integer>> mapSet = new HashSet<>();

        // Create some sample maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("x", 10);
        map2.put("y", 20);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("foo", 100);
        map3.put("bar", 200);

        // Add maps to the set
        mapSet.add(map1);
        mapSet.add(map2);
        mapSet.add(map3);

        // Display the contents of the set
        System.out.println("Maps in the Set:");
        for (Map<String, Integer> map : mapSet) {
            System.out.println(map);
        }

        // Empty the set
        mapSet.clear();

        // Confirm that the set is empty
        System.out.println("Set is now empty: " + mapSet);
    }	
	
//check the existance of Set of elements in the origial Set	
	public static void ExistanceElement(){
	// Create a Set to store Maps
        Set<Map<String, Integer>> mapSet = new HashSet<>();

       
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("x", 10);
        map2.put("y", 20);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("foo", 100);
        map3.put("bar", 200);

       // Add maps to the set
        mapSet.add(map1);
        mapSet.add(map2);
        mapSet.add(map3);

        // Create a set of elements to check
        Set<Map<String, Integer>> setToCheck = new HashSet<>();
        setToCheck.add(map1);
        setToCheck.add(map2);

        // Check if the original set contains all elements of setToCheck
        boolean containsAll = mapSet.containsAll(setToCheck);

        // Display the result
        if (containsAll) {
            System.out.println("The original set contains all elements of setToCheck.");
        } else {
            System.out.println("The original set does not contain all elements of setToCheck.");
        }
    }
//inserting an element in the middle of a Set
	public static void InsertSet(){
        Set<String> set = new HashSet<>();
        
        // Add some elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Convert set to list
        List<String> list = new ArrayList<>(set);

        // Inserting a new element at the middle
        int middleIndex = list.size() / 2;
        list.add(middleIndex, "grape");

        // Convert list back to set
        set = new HashSet<>(list);

        // Print the modified set
        System.out.println("Modified Set:");
        for (String element : set) {
            System.out.println(element);
        }
    }
	
// find all the indexes of an element in the Set in forward and reverse order

public static void IndexForwardandReverse(){
	 List<String> list = new ArrayList<>();
        
        // Add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("banana"); // Duplicate element 

        // Find indexes of an element in forward order
        String elementToFind = "banana";
        List<Integer> forwardIndexes = findIndexes(list, elementToFind);

        // Find indexes of an element in reverse order
        List<Integer> reverseIndexes = new ArrayList<>(forwardIndexes);
        Collections.reverse(reverseIndexes);

        // Print the indexes
        System.out.println("Indexes of '" + elementToFind + "' in forward order: " + forwardIndexes);
        System.out.println("Indexes of '" + elementToFind + "' in reverse order: " + reverseIndexes);
    }

    // Method to find indexes of an element in a list
    private static List<Integer> findIndexes(List<String> list, String elementToFind) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(elementToFind)) {
                indexes.add(i);
            }
        }
        return indexes;
    }
	
	// create a new Set from set of elements in the original Set
	public static void OrginalSet(){
        Set<Integer> originalSet = new HashSet<>();
        originalSet.add(1);
        originalSet.add(2);
        originalSet.add(3);
        originalSet.add(4);
        originalSet.add(5);

        // Create a new Set from the elements in the original Set
        Set<Integer> newSet = new HashSet<>(originalSet);

        // Print the elements of the new Set
        System.out.println("Elements in the new Set:");
        for (int element : newSet) {
            System.out.println(element);
        }
    }
	
	
	// store duplicate and null values in the Set and get the hash code of a Set
	
	public static void SetHashCode(){
	
	Set<Integer>mySet=new HashSet<>();
	
	mySet.add(12);
	mySet.add(13);
	mySet.add(14);
	mySet.add(14);//duplicate element
	mySet.add(null);
	
	System.out.println( "my set value is :"+mySet);
	int mySet1 =mySet.hashCode();
	System.out.println("hashcode of the set : "+mySet1);
	
   }
}