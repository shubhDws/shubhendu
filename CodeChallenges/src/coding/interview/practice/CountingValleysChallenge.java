/**Problem statement can be viewed on Hackerrank portal -> https://www.hackerrank.com/challenges/counting-valleys/problem**/

package coding.interview.practice;

public class CountingValleysChallenge {

	public int countingValleys(int n,String s){
		/**================================validation checks below=========================================**/
		char[] charArray = s.toCharArray();
		int valid = 0;
		for(char s1 : charArray){
			if('D'==s1 || 'U'==s1){
				valid++;
			}
		}
		if(valid != s.length()){
			System.out.println("Proper step counts needed in terms of 'D' & 'U' only");
			return 0;
		}
		if(n != s.length()){
			System.out.println("steps count with actual steps do not match");
			return 0;
		}
		if(n%2 > 0){
			System.out.println("Hiking is not completed yet");
			return 0;
		}
		/**=============================================================================================**/
		int stepsCount = 0;
		int valleys = 0;
		for(char s2 : charArray){
			if('D'==s2 && stepsCount == 0){
				valleys = valleys + 1;
			}
			if('D'==s2){
				stepsCount = stepsCount - 1;
			}else{
				stepsCount = stepsCount + 1;
			}
			
		}
		return valleys;
	}
	
	public static void main(String[] args) {
		
		int valleys = new CountingValleysChallenge().countingValleys(16, "DUUDDUUDDDUUDDUU");
		System.out.println("Total valleys are : " + valleys);
	}

}
