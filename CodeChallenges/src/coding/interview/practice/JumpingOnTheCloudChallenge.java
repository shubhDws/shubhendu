/**Problem definition available on hackerrank check below link
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup	**/

package coding.interview.practice;

public class JumpingOnTheCloudChallenge {

	int shortestJump(int[] n) {
		int jumps = 0;
		for (int i = 0; i < n.length;) {
			if (n[i] != 0) {
				System.out.println("Not a vlaid start of the game");
				return jumps;
			}
			
			if(i == n.length - 1){
				//jumps++;
				//i = i + 1;
				return jumps;
			}else if(i == n.length - 1){
				//i = i + 1;
				return jumps;
			}

			if (n.length - i > 2 && n[i + 2] == 0) {
				jumps++;
				i = i + 2;
			} else if (n[i + 1] == 0) {
				jumps++;
				i = i + 1;
			}
		}
		return jumps;
	}

	public static void main(String[] args) {

		int[] n = new int[]{0,0,1,0,0,1,0};
		int jump = new JumpingOnTheCloudChallenge().shortestJump(n);
		System.out.println("shortes jumps to end line are : " + jump);
	}

}
