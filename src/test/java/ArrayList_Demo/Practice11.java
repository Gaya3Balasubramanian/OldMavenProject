package ArrayList_Demo;

import java.util.HashMap;

public class Practice11 {

	public static void main(String[] args) {
		String str= "Bangalore";
		
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			
			char c= str.charAt(i);
			if(map.containsKey(c)) {
				int count= map.get(c);
				map.put(c, count+1);
			}else {
				map.put(c, i);
			}
		}
		System.out.println(map);
   

}

	
}