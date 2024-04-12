import java.util.*;
import java.util.Scanner;

class SampleNew{

//Get first and last indexes of a char in a String

public static void CharIndex_FirstLast(){

        String str = "Your are the best";
        char ch = 'a';

        int firstIndex = str.indexOf(ch);
        int lastIndex = str.lastIndexOf(ch);

        if (firstIndex != -1 && lastIndex != -1) {
            System.out.println("First index of '" + ch + "': " + firstIndex);
            System.out.println("Last index of '" + ch + "': " + lastIndex);
        } else {
            System.out.println("Character '" + ch + "' not found in the string");
        }
    }
	
// Get all indexes of a char in a string

public static void AllIndexOfString(){
	
	String word = "FreeFees";
	String guess = "e";
	
	for (int index = word.indexOf(guess);
     index >= 0;
     index = word.indexOf(guess, index + 1))
	{
	System.out.println("index of 'e' :"
	+index);
	}
  }
  
//Check the string starting and ending with expected values

  /* public static boolean startsAndEndsWith(String str, String startValue, String endValue) {
        
        boolean startsWith = str.substring(0, startValue.length()).equals(startValue);
        
        
        boolean endsWith = str.substring(str.length() - endValue.length()).equals(endValue);
        
        return startsWith && endsWith;
    }

  
        String str = "Hello, world!";
        String startValue = "Hello";
        String endValue = "world!";

        boolean result = startsAndEndsWith(str, startValue, endValue);

        System.out.println(result ? "String starts with \"" + startValue + "\" and ends with \"" + endValue + "\""
                                   : "String does not start with \"" + startValue + "\" or end with \"" + endValue + "\"");
    }*/

//Check the equality of 2 strings irrespective of upper or lower case

public static boolean isEqualIgnoreCase(String str1, String str2) {
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("TRUE");
		}
		else{
			System.out.println("False");
		}
        return str1.equalsIgnoreCase(str2);
		
    }

//Replace a sub string with new value in a original string 

public static void ReplaceSubstring(){
	
	String str1 = "pray,trust,wait";
	System.out.println("String before modify : "+str1);
	System.out.println("");
	String str2 =str1.replace("trust","Hope");
	System.out.println("String after modify : "+str2);
  }	
  
//Split the string value with comma separator

public static void StringComma(){

		String str = " Reebok, Betta, Woodland, Addidas, Puma";
		String[] footwears = str.split(",");
		
		System.out.println("Spilt String : ");
		for( String Things : footwears){
			System.out.println(Things);
		}
   }
//Create a sub string from the original string

public static void IndexSubString(){

	String str = "Ellam nanmaike";
	
	String str1 = str.substring(6);
	System.out.print("substring 1 : ");
	System.out.println(str1);
	
	System.out.println("");
	
	String str2 = str.substring(0,5);
	System.out.println("substring 2: "+str2);
  }	
  
//Convert the string to lower and upper cases

public static void LowertoUpper(){
	
	String str = "Die with memories, not dreams";
	
	String strUpper = str.toUpperCase();
	System.out.println("string upper case: "+strUpper);
	
	System.out.println("");
	
	String strLower = str.toLowerCase();
	System.out.println("string lower case : "+strLower);
	}
//Get the string value of int, double, float, long, char, boolean

public static void StringMultiDataTypes(){

		int intValue = 100;
		double doubleValue = 2.14;
		float floatValue = 5.2f;
		long longValue =1000000000L;
		char charValue = 'A';
		boolean booleanValue = true;
		
		String intString = String.valueOf(intValue);
		System.out.println("int value as String:"+intString);
		
		String doubleString = String.valueOf(doubleValue);
		System.out.println("double value as String: "+doubleString);
		
		String floatString = String.valueOf(floatValue);
		System.out.println("float value as String : "+floatString);
		
		String longString = String.valueOf(longValue);
		System.out.println("long value as a String: "+longString);
		
		String charString = String.valueOf(charValue);
		System.out.println("char value as String : "+charString);
		
		String booleanString = String.valueOf(booleanValue);
		System.out.println("boolean value as a String : "+booleanString);
 }	
 
//Append a string, int, float values in a StringBuffer

public static void Stringbuffer_AppendValues(){
	StringBuffer sb = new StringBuffer();
	
	sb.append("hevin");
	
	int intValue = 420;
	sb.append(intValue);
	
	float floatValue = 3.14f;
	sb.append(floatValue);
	
	System.out.println(" int,string,float values append in StringBuffer : "+sb);
 }
//Insert a string, long, double values in a StringBuffer

public static void InsertString(){
	StringBuffer sb = new StringBuffer();
	
	sb.insert(0,"hello");
	
	long longValue = 1000000000L;
	sb.insert(5,longValue);
	
	double doubleValue = 3.15;
	sb.append(doubleValue);
	
	System.out.println("stringBuffer Content : "+sb.toString());
    }
//Delete a sub string from a StringBuffer

public static void DeleteBuffer(){
	
	StringBuffer sb = new StringBuffer("Accept the reality");
	System.out.println("Stringbuffer content : "+sb);
	
	System.out.println("");
	
	sb.delete(7,10);
	System.out.println("After deleting StringBuffer content : "+sb);
	}
	
//	Reverse the string value using StringBuffer

public static void Reverse_StringBuffer(){
	
	String value = "MALAYALAM LANGUAGE";
	System.out.println("Orginal String  :"+value);
		
	System.out.println("");
		
	StringBuffer sb = new StringBuffer(value);
	sb.reverse();
		
	String reversedString =sb.toString(); 
	System.out.println("After reverse string : "+reversedString);
	}
	
//Clear the StringBuffer

public static void Clear_StringBuffer(){

	String value = "Dream without fear. Love without limits.";
	StringBuffer sb = new StringBuffer(value);
	System.out.println("String before clear : "+sb);
	
	sb.setLength(0);
	System.out.println("String after clear : "+sb);
	}
	
//Append a string, int, float values in a StringBuilder	

public static void StringBuilder_AddDatatypes(){
	
	StringBuilder sb = new StringBuilder();
	
	String StringValue = "What we think, we become.";
	sb.append(StringValue);
	
	int intValue = 150;
	sb.append(intValue);
	
	float floatValue = 3.14f;
	sb.append(floatValue);
	
	System.out.println("Append a Values of String,int,float in StringBuilder : "+sb);
 }
 
// Insert a string, long, double values in a StringBuilder

public static void Insert_ValuesStringBuilder(){
	
	StringBuilder sb = new StringBuilder();
	
	sb.insert(0,"And still, I rise");
	
	double doubleValue = 1.34;
	sb.insert(17,doubleValue);
	
	long longValue = 1000000000L;
	sb.append(longValue);
	
	System.out.println("StringBuilder Insert content : "+sb);
 }
// Delete a sub string from a StringBuilder

public static void Delete_StringBuffer(){
	
	StringBuffer sb = new StringBuffer("What we think, we become ");
	
	System.out.println("Original string :"+sb);
	
	System.out.println("");
	
	sb.delete(5,7);
	System.out.println("After delete string : "+sb);
	}
	
//Reverse the string value using StringBuilder	

public static void Reverse_StringBuilder(){
	
	String value ="amma is not word it's emotion";
	
	StringBuilder sb = new StringBuilder(value);
	
	System.out.println(" original String :"+sb);
	sb.reverse();
	
	System.out.println("");
	
	String ReversedString = sb.toString();
	System.out.println("After reversedStringing :"+ReversedString);
	
	} 
//Clear the StringBuilder

public static void Clear_StringBuilder(){
	
	String value = "When words fail, music speaks";
	StringBuilder sb = new StringBuilder(value);
	System.out.println("before clearing string :"+sb);

	System.out.println("");
	
	sb.setLength(0);
	System.out.println("after cleared string :");
	}
	
	        /*Tasks using Class, Object*/
	
//Get the class object for particular class name

public static void getClassObeject(){

	Test3 s1 = new Test3();
	
	System.out.println(s1.getClass());
	System.out.println(s1.getClass().getName());
	
	}	
	
//Get the package name and super class of the class in java program

public static void packageName(){
	
	  try {
            Class<?> cls = Class.forName("java.util.ArrayList");
            Package packageName = cls.getPackage();
            System.out.println("Package Name: " + packageName.getName());
			System.out.println("Simple name :"+cls.getSimpleName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}

//Get class name of the Object

public static void getClassName(){

		Test3 c = new Test3();
		
		String className = c.getClass().getName();
		System.out.println("Class Name : "+className);
	}
	
	
	        /*Tasks using Exception classes*/
		 
//Catch the multiple exceptions according to their hierarchy

public static void multipleException(){
 
	 try {
			int value = 10/0;
			Object obj = null;
			obj.toString();
		}catch(ArithmeticException e){
				System.out.println("ArithmeticException occured : "+e.getMessage());
		}catch(NullPointerException e ){
				System.out.println("NullPointerException :"+e.getMessage());
		}catch (Exception e){
				System.out.println("Some other exception occured :"+e.getMessage());
		}
	}	
	
//	Skip the catch block and continue with finally  block

public static void skipCatch(){
		try{
			
			int value =10/0;
			Object obj = null;
			obj.toString();
		}finally {
			
				System.out.println("Finally block excecuted");
		}
			
	}	
}	


//main class 
public class Test3{
	
	public static void main(String [] args){
	 
	 display();
	
	}
	
	public static void display(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		
		SampleNew s = new SampleNew();
		
	//using recursion concept it's helps to easly view the particular program
		
		if(a == 0){
		return;
		}
		if(a == 1){
			s.CharIndex_FirstLast();
			display();
		}
		if(a == 2){
			s.AllIndexOfString();
			display();
		}
		if(a == 3){
			s.isEqualIgnoreCase("hello","Hello");
			display();
		}
		if(a == 4){
			s.ReplaceSubstring();
			display();
		}
		if(a == 5){
			s.StringComma();
			display();
		}
		if(a == 6){
			s.IndexSubString();
			display();
		}
		if(a == 7){
			s.LowertoUpper();
			display();
		}
		if( a == 8){
			s.StringMultiDataTypes();
			display();
		}
		if(a == 9){
			s.Stringbuffer_AppendValues();
			display();
		}
		if(a == 10){
			s.InsertString();
			display();
		}
		if(a == 11){
			s.DeleteBuffer();
			display();
		}
		if(a == 12){
			s.Reverse_StringBuffer();
			display();
		}
		if(a == 13){
			s.Clear_StringBuffer();
			display();
		}
		if(a == 14){
			s.StringBuilder_AddDatatypes();
			display();
		}
		if(a == 15){
			s.Insert_ValuesStringBuilder();
			display();
		}
		if(a == 16){
			s.Delete_StringBuffer();
			display();
		}
		if(a == 17){
			s.Reverse_StringBuilder();
			display();
		}
		if(a == 18){
			s.Clear_StringBuilder();
			display();
		}
		if(a == 19){
			s.getClassObeject();
			display();
		}
		if(a == 20){
			s.packageName();
			display();
		}
		if(a == 21){
			s.getClassName();
			display();
		}
		if(a == 22){
			s.multipleException();
			display();
		}
		if(a == 23){
			s.skipCatch();
			display();
		}
		
	}
}