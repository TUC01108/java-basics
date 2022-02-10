package inheritance;

import java.util.StringTokenizer;

public class StringBufferDemo {

	public static void main(String[] args) {
		int count=0;
		String quotes = "Honesty is the best policy and is good policy and is healthy policy";
		StringTokenizer tokenizer = new StringTokenizer(quotes);
		while(tokenizer.hasMoreTokens()) {
			String temp = tokenizer.nextToken();
			if(temp.equals("and"))
				count++;
		System.out.println("Count of \"and\" in the string : "+count);
		}

	}

}
