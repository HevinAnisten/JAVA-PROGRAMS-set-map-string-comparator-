import java.util.*;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;


class SampleTest{
	
//Check the given date is after or before of the current date
 public  void Give_Current(){
	
		LocalDate currentdate = LocalDate.now();
		
		LocalDate givendate = LocalDate.of(2022,02,15);
		
		if(givendate.isBefore(currentdate)){
			System.out.println(" Givendate "+givendate+" is before the currentdate "+currentdate);
			}
		else if(givendate.isAfter(currentdate)){
			System.out.println("givendate"+givendate+"is after the currentdate"+currentdate);
		    } 
		else{
			System.out.println("givendate"+givendate+"as the same currentdate"+currentdate);
		    }
   }
   
//Compare 2 dates
 public  void DateComparision(){
	  
	  LocalDate date1 = LocalDate.of(2012,12,12);
	  LocalDate date2 = LocalDate.of(2012,11,11);
	  
	  int result =date1.compareTo(date2);
	  
		if(result<0){
		  System.out.println("date1 is before the date2 ");
		}
		else if(result>0){
		System.out.println("date1 is after the date2");
		}
		else {
		System.out.println("date1 is equal to date2 ");
	  }
	}
	
//Check 2 dates are equal or not	
 public  void DatesOfEqual(){
	 
	 LocalDate date1 = LocalDate.of(2020,11,30);
	 LocalDate date2 = LocalDate.of(2020,11,30);
	 
	 boolean result = date1.equals(date2);
	 
	 if(result){
		 System.out.println("The two dates are equal");
	 }
	 else{
		 System.out.println("The two dates are not equal");
	 }
  }
  
// Get the Maximum and Minimum of the Calendar field
 public  void Max_Min_Calendar(){
	
	Calendar calendar = Calendar.getInstance();
	
	int Maximumyear = calendar.getActualMaximum(Calendar.YEAR);
	System.out.println("Maximumyear : "+Maximumyear);
	
	int MinimumYear = calendar.getActualMinimum(Calendar.YEAR);
	System.out.println("Minimum year : "+MinimumYear);
	
	int MaximumMonth = calendar.getActualMaximum(Calendar.MONTH)+1;
	System.out.println("Maximum Month : "+MaximumMonth);
	
	int MinimumMonth = calendar.getActualMinimum(Calendar.MONTH)+1;
	System.out.println("Minimum month :"+MinimumMonth);
	
	int MaximumDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println("Maximum day of month: "+MaximumDayOfMonth);
	
	int MinimumDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
	System.out.println("Maximum day of month: "+MinimumDayOfMonth);
	
 }	 
 
 //Get the First day of the week
 
 public  void FirstDayOfWeek(){
	  
	  LocalDate today = LocalDate.now();
	  
	  LocalDate firstDayOfWeek = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY));
	  
	    System.out.println("today's date   :"+today);
		
		System.out.println("First day of week : "+firstDayOfWeek);
		
    }
	
//Get the Date object for the current day
 
 public  void Current_Day(){
	 
	 Date CurrentDate = new Date();
	 
	 System.out.println("CurrentDate :"+CurrentDate);
 }
 
//Get the current time in milliseconds

 public  void Current_MilliSeconds(){

	long CurrentTimeMillis1 = System.currentTimeMillis();
	System.out.println("Current Time in Milliseconds (Using System.CurrentTimillis ()) : "+CurrentTimeMillis1);
	
	Date currentdate = new Date();
	long CurrentTimeMillis2 = currentdate.getTime();
	System.out.println("Current time in milliseconds (Using java.util.date) :"+CurrentTimeMillis2);
 }	 
 
 //Roll the calendar field
 
 public void Roll_Calendar(){
	 
	 Calendar calendar = Calendar.getInstance();
	 
	 System.out.println("Current date : " + calendar.getTime());
	 
	 calendar.add(Calendar.MONTH,1);
	 System.out.println(" calendar after rolling month by one :"+calendar.getTime());
 }
 
 //Get the Date object from different String format of date
 
  public void String_Date(){
	  String DateString = "2020-08-10";
	  
	  LocalDate date = LocalDate.parse(DateString);
	  
	  System.out.println(" Date Object : "+date);
  }
  
 //Get the different String format of Date object
 
 public static void DifferentDateFormat(){
	 
	 Date date = new Date();
	 
	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	 
     String formattedDate = dateFormat.format(date);
	
	 SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/yyyy/dd");
	 String formattedDate1 = dateFormat1.format(date);
	 
	 
	 SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
	 String formattedDate2 = dateFormat2.format(date);
	 
	 System.out.println("DateFormat:"+formattedDate);
	 System.out.println("DateFormat:"+formattedDate1);
	 System.out.println("DateFormat:"+formattedDate2);
  }

       //Tasks using Arrays with Comparator

// Covert String Array to List
 
 public static void StringArrayTOList(){
	 
	 String[] array ={"Boxing","Shooting","Wrestling","Athletics","Archery"};
	 
	 List<String> list = Arrays.asList(array);
	 
	 System.out.println(" List of olympic games :"+list);
 }
 
 //Search for a string in a string array
 
 public static void FoundString(){
 
	String[] array = {"kabaddi","vollyball","cricket","basketball","koo-koo"};
	
	String target = "kabaddi";
	
	boolean found =false;
	
	for (String str : array){
		if(str.equals(target)){
			found = true;
			break;
		}
	}
	if(found){
		System.out.println("String '" + target +"" + "'found in the array");
	}
	else{
		System.out.println("String'" + target + "'not found in the array"); 
	}
 }
 
 //Copy of a string array to the new one
 
 public static void CopyStringArray(){
	 
	 String[] array = {"Hi","Hello","Fine","Welcome"};
	 
	 System.out.println( "Array :"+Arrays.toString(array));
	 
	 String[] newArray = Arrays.copyOf(array,array.length);
	 
	 System.out.println("Copy of New Array : "+Arrays.toString(newArray));
 }
 
//Create a sub array for the original string array
 public static void subArray(){
	String[] array = {"AC","WaterBottle","Laptop","Bag","Airbuds","Pen","MobilePhone"};
	System.out.println("Array : "+Arrays.toString(array));
	int startIndex = 1;
	int endIndex = 4;
	 
	String [] SubArray =Arrays.copyOfRange(array,startIndex,endIndex);
	System.out.println("");
	System.out.println("Sub Array : "+ Arrays.toString(SubArray));
	
 }
 //Compare 2 arrays with equals and deepEquals methods 
 public static void CheckEquals_deepEquals(){
	  int [] array1 = {1,2};
	  int [] array2 = {1,2};
	  
	  boolean check = Arrays.equals(array1,array2);
	  System.out.println("Equals : "+check);
	  
	  int [][] array3 = {{1,3},{3,4}};
	  int [][] array4 = {{1,2},{3,4}};
	  
	  System.out.println("");
	  boolean check1 = Arrays.deepEquals(array3,array4);
	  System.out.println("deepEquals :" +check1);
 }
 
 //Sorting a string array
 public static void SortArray(){
	 String [] array = {"Hi","Hello","Hevin","Heavan"};
	 
	 Arrays.sort(array);
	 
	 System.out.println("Sorted Arrays: "+Arrays.toString(array));
 }
 
 //Sorting a string array in ascending and descending order using Comparator
 
 public static void Ascending_Descending(){

        String[] array1 = {"Waycool", "Chargebee", "Rocketlane", "Freshworks", "Amazon", "Paypal", "Walmart"};
     
	     Arrays.sort(array1, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Ascending order:");
        for (String str : array1) {
            System.out.println(str);
        }
		
		 Arrays.sort(array1, (s1, s2) -> s2.compareTo(s1));
        System.out.println("\nDescending order:");
        for (String str : array1) {
            System.out.println(str);
        }
     }
	 
//Convert an array of elements as string
public static void ConvertString(){
	
	String [] arr = {"bat","ball","stemp","ground"};
	
	System.out.println(arr);
	
	System.out.println("");
	
	String arrayString = Arrays.toString(arr);
	System.out.println("Converts arrays an String :"+arrayString);
	
  }

//Search a string in a list using comparator and comparable classes

public static void Comparator_Comparable(){
	
   List<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
		
		System.out.println("original list : "+numbers);
		
		System.out.println("");

        // Search integer using Comparable
        Integer searchIntegerComparable = 200;
        Integer indexComparable = Collections.binarySearch(numbers, searchIntegerComparable);
        if (indexComparable >= 0) {
            System.out.println("Using Comparable - Found '200' at index: " + indexComparable);
        } else {
            System.out.println("Using Comparable - '200' not found");
        }

        // Search integer using Comparator
        Integer searchIntegerComparator = 200;
        Comparator<Integer> comparator = (str1, str2) -> str1.compareTo(str2);
        int indexComparator = Collections.binarySearch(numbers, searchIntegerComparator, comparator);
        if (indexComparator >= 0) {
            System.out.println("Using Comparator - Found '200' at index: " + indexComparator);
        } else {
            System.out.println("Using Comparator - '200' not found");
        }
     }
	 
//Copy the list to another one 

public static void CopiedList(){

		List<String> value = new ArrayList<>();
		
		value.add("bollywood");
		value.add("hollywood");
		value.add("kollywood");
		System.out.println("Orginal List :");
		System.out.println(value);
        System.out.println("");
   //CopiedList1 
   
		List<String> CopiedList1 = new ArrayList<>();
		CopiedList1.addAll(value);
		
		List<String> CopiedList2 = new ArrayList<>(value);
		
		System.out.println("Copied List 1:");
        System.out.println(CopiedList1);
        System.out.println("");
        System.out.println("Copied List 2:");
        System.out.println(CopiedList2);
	} 
	
//Compare 2 lists and confirm no elements in common

public static void CommonElements_List(){
	
	List<String> list1 = new ArrayList<>();
		
		list1.add("bollywood");
		list1.add("hollywood");
		list1.add("kollywood");
	
	List<String> list2 = new ArrayList<>();
		
		list2.add("mobile");
		list2.add("laptop");
		list2.add("notepad");
		
		Set<String> set1 = new HashSet<>(list1);
		Set<String> set2 = new HashSet<>(list2);
		
		boolean ListCommon = !set1.retainAll(set2);
		
		if(ListCommon){
			 System.out.println("The lists have common elements.");
        } else {
            System.out.println("The lists have no common elements.");
        }
     }
	 
//Fill the list with default value

public static void DefaultValue(){
	
	String Default = "default";
	
	List<String> filedList = Collections.nCopies(4,Default);
	
		System.out.println("Filed List : ");
        System.out.println(filedList);
  }

 //Get the number of occurrence of a string in a list

public static void Occurancence_string(){
		List<String> myList = Arrays.asList("hevin","mango","hevin","tomato","hevin","rex");
		
		String target = "hevin";
		int occurrences =Collections.frequency(myList,target);
		System.out.println("The string '" + target + "' occurs " + occurrences + " times in the list.");
	}
//  Find the first and last indexes of a sub list in a original list

public static void SubList_Indexes(){
	
	List<Integer> myList = List.of(1,2,3,4,5,6,9,78,10);
	
	List<Integer> subList =List.of(4,5,6);
	
	int firstIndex = myList.indexOf(subList.get(0));
	int lastIndex = myList.lastIndexOf(subList.get(subList.size()-1));
	
	if(firstIndex !=-1 && lastIndex != -1){
		System.out.println("First index of sublist: " + firstIndex);
        System.out.println("Last index of sublist: " + lastIndex);
	}
	else{
		
		 System.out.println("Sublist not found in the original list.");
	}
  }
//Find the Maximum and minimum for elements in the given list

public static void Max_Min(){
		
		List<Integer> myList = List.of(1,3,5,68,3,58,100);
		
		int max = Collections.max(myList);
		int min = Collections.min(myList);
		
		System.out.println("Maximum element : "+max);
		System.out.println("Minimum element : "+min);
 }
 
 //Create a list with n elements with default value
 
 public static void N_ElementsDefaultValue(){
	 
	 int n = 7;
	 int Defaultvalue = 0;
	 
	 List<Integer> myList = new ArrayList<>(Collections.nCopies(n,Defaultvalue));
	 
	 System.out.println("List with default values: "+myList);
 }
 
 //Replace all the x value to y value in list
 
 public static void Replace_X_Y_Values(){
	 List<Integer> myList = new ArrayList<>();
	 
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(20);
		myList.add(70);
		myList.add(20);
	System.out.println(" List before Replacement :"+myList);
		int x =20;
		int y = 1000;
		Collections.replaceAll(myList,x,y);
	System.out.println(" List after Replacement :"+myList);	
  }
 
//Sort the list with and without Comparator

public static void SortListComparator(){
	
	List<Integer> myList = new ArrayList<>();
	
		myList.add(2);
		myList.add(13);
		myList.add(5);
		myList.add(7);
		myList.add(1);
		
		Collections.sort(myList);
		System.out.println("Sort the list without comparator :"+myList);
		
		List<String> Animal = new ArrayList<>();
		Animal.add("Crocodile");
		Animal.add("Raccoon");
		Animal.add("Sheep");
		Animal.add("Cheetah");
		Animal.add("Bear");
		
		Collections.sort(Animal,Comparator.comparing(String :: length));
		System.out.println(" sort the list with comparator : "+Animal);
		
  }
} 
//main class
public class Test2 {
	
	public static void main(String[]args){
		
		Print();
	}
	
	public static void Print(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = scanner.nextInt();
		
		SampleTest r = new SampleTest();
		
		//using recursion concept it's helps to easly view the particular program
		
			if( a == 0){
				
				return;
			}
			else if (a == 1) {
				r.Give_Current();
				Print();
			}
			else if (a == 2){
				r.DateComparision();
				Print();
			}
			else if (a == 3) {
				r.DatesOfEqual();
				Print();
			}
			else if (a == 4){
				r.Max_Min_Calendar();
				Print();
				}
			else if (a == 5){
				r.FirstDayOfWeek();
				Print();
			}
			else if ( a == 6){
				r.Current_Day();
				Print();
			}
			else if (a == 7){
				r.Current_MilliSeconds();
				Print();
			}
			else if (a == 8) {
				r.Roll_Calendar();
				Print();
			}
			else if (a == 9){
				r.String_Date();
				Print();
			}
			else if(a == 10){
				r.DifferentDateFormat();
				Print();
			}
			else if (a == 11)
			{
				r. StringArrayTOList();
				Print();
			}
			else if (a == 12){
				r.FoundString();
				Print();
			}
			else if (a == 13){
				r.CopyStringArray();
				Print();
			}
			else if(a == 14){
				r.subArray();
				Print();
			}
			else if(a == 15){
				r.CheckEquals_deepEquals();
				Print();
			}	
			else if(a == 16){
				r.SortArray();
				Print();
			}
			else if(a == 17){
				r. Ascending_Descending();
				Print();
			}
			else if( a == 18){
				r.ConvertString();
				Print();
			}
			else if (a == 19)
			{
				r.Comparator_Comparable();
				Print();
			}
			else if( a == 20){
				r.CopiedList();
				Print();
			}
			else if( a == 21){
				r.CommonElements_List();
				Print();
			}
			else if(a == 22){
				r.DefaultValue();
				Print();
			}
			else if(a == 23){
				r.Occurancence_string();
				Print();
			}
			else if(a == 24){
				r. SubList_Indexes();
				Print();
			}
			else if(a == 25){
				r.Max_Min();
				Print();
			}
			else if(a == 26){
				r.N_ElementsDefaultValue();
				Print();
			}
			else if(a == 27){
				r. Replace_X_Y_Values();
				Print();
			}
			else if(a == 28){
				r.SortListComparator();
				Print();
			}
		   else {
			   System.out.println("not valid ");
		   }
	 }
}















