
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println(Vowels("Hello"));
	    System.out.println(Vowels("Tv"));
	    
	}
	    public static boolean Vowels(String a)
	    {
	        return a.toLowerCase().matches(".*[aeiou].*");
	    }
	
}
