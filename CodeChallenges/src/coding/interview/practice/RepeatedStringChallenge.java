/**Problem statement defined below
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup**/

package coding.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import coding.inerview.ThreadsOnly.ProducerThread;
import coding.inerview.ThreadsOnly.ConsumerThread;

public class RepeatedStringChallenge {

	long repeatedString(String s, long n) {
		System.out.println("starting..");
		long count = 0;
		int countOfa = 0;
		String str = " ";
		long repeat = n / s.length();
		long split = n % s.length();
		System.out.println("starting the loop for creating the list" + repeat + " " + split + " " + s.length());

		for (char c : s.toString().toCharArray()) {
			if ('a' == c) {
				countOfa++;
			}
		}
			count = countOfa * repeat;
			System.out.println("count of a in First string : " + count);
			if (split > 0) {
				str = s.substring(0, (int) split);
				System.out.println("Final string : " + str);

				for (char c1 : str.toString().toCharArray()) {
					if ('a' == c1) {
						count++;
					}
				}
			}
		
		return count;
	}

	public static void main(String[] args) {
		long count = new RepeatedStringChallenge().repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L);
		System.out.println("total count of a is : " + count);
	}

}
