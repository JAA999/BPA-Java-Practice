import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class Java_340 {
	
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("input340.txt");
		Scanner s = new Scanner(f);
		
		System.out.println(s);
		
		
		while(s.hasNext()) {
			String s1 = s.nextLine().trim();
			String [] blank = null;
			blank = s1.split("");
			ArrayList<Integer> isbn = new ArrayList<Integer>();
			
			for(int i = 0; i < blank.length; i++) {
				
				if(i == 1 || i == 5 || i == 11) continue;
				else {
					isbn.add(Integer.parseInt(blank[i]));
				}
				
			}
			
			int o = 10;
			
			for(int j = 0; j < isbn.size(); j++) {
				int x = isbn.get(j);
				isbn.set(j, (x*o));
				o--;
			}
			
			int total = 0;
			
			for(int k = 0; k < isbn.size(); k++) {
				total += isbn.get(k);
			}
			
			if(total % 11 == 0) {
				System.out.println("ISBN is valid");
			} else {
				System.out.println("ISBN is NOT valid");
			}
			
		}
		
		s.close();
		
	}

}