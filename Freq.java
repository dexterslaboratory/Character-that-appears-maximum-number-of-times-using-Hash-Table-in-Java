//character that appears max times
import java.io.*;
import java.util.*;

public class Freq {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		input = input.replace(" ", "");
		Map<String, Integer> d = new Hashtable<String, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (d.get("" + input.charAt(i)) == null) {
				d.put("" + input.charAt(i), 1);
			} else {
				int f = d.get("" + input.charAt(i));
				d.put("" + input.charAt(i), ++f);
			}

		}
		int max = d.get("" + input.charAt(0));

		for (int i = 0; i < input.length(); i++) {
			if (d.get("" + input.charAt(i)) > max) {
				max = d.get("" + input.charAt(i));
			}
		}
		for (int i = 0; i < input.length(); i++) {
			if (d.get("" + input.charAt(i)) == max) {
				System.out.println(input.charAt(i));
				break;
			}
		}
		//System.out.println(d.toString()); //uncomment if the individual occurrences are needed

	}

}
