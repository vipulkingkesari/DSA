package course2code;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

//class Bracket {
//    Bracket(char type, int position) {
//        this.type = type;
//        this.position = position;
//    }
//
//    boolean Match(char c) {
//        if (this.type == '[' && c == ']')
//            return true;
//        if (this.type == '{' && c == '}')
//            return true;
//        if (this.type == '(' && c == ')')
//            return true;
//        return false;
//    }
//
//    char type;
//    int position;
//}
public class check_brackets {
	 static  boolean check_brackets(String text) {
		 Stack<Character> opening_brackets_stack = new Stack<Character>();
	        for (int position = 0; position < text.length(); ++position) {
	            char next = text.charAt(position);

	            if (next == '(' || next == '[' || next == '{') {
	                // Process opening bracket, write your code here
	            	opening_brackets_stack.push(next);
	            	continue;
	            }

	            if (opening_brackets_stack.isEmpty()) 
	                return false; 
	  
	            switch (next) { 
	            case ')': 
	                opening_brackets_stack.pop(); 
	                if (next == '{' || next == '[') 
	                    return false; 
	                break; 
	  
	            case '}': 
	                opening_brackets_stack.pop(); 
	                if (next == '(' || next == '[') 
	                    return false; 
	                break; 
	  
	            case ']': 
	                opening_brackets_stack.pop(); 
	                if (next == '(' || next == '{') 
	                    return false; 
	                break; 
	            } 
	        } 
	        return (opening_brackets_stack.isEmpty());
	        
	        
	        
	        }
		
	
	public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        if (check_brackets(text)) 
            System.out.println("True"); 
        else
            System.out.println("False "); 

        

        // Printing answer, write your code here
    }

}
