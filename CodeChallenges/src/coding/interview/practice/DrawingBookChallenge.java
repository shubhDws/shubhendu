/** 
 * a book has 'n' number of pages, and you are asked to open page number 'p',
 *  book always starts from page 1 on the right, so accordingly ending page is 
 *  an odd number on the right and if even number then its on the left. 
 *  Identify the number of pages which you need to turn to reach to page no. 'p', 
 *  either from the front or from the back of the book 
 *  **/

package coding.interview.practice;

public class DrawingBookChallenge {
	
	public int shortestPath(int n, int p){
		if(n<p){
			System.out.println("Invalid input, book length should be grater thas specified page number");
			return 0;
		}
		int turnsFromFront = 0;
		int turnsFromBack = 0;
		int evenNum = 0;
		if(p==1){
			return 0;
		}
		else if((n%2 > 0) && (p==n || p==n-1)){
			return 0;
		}
		else if((n%2==0) && (p==n)){
			return 0;
		}
		else{
			/**
			 * starting from front of the page, counting number of even pages in between n & p 
				starting from 1, since that is the first page on right side of the book 
			**/
			for(int i = 1;i<=p;i++){
				if(i%2==0){
					turnsFromFront = turnsFromFront + 1;
				}
			}
			
			/**
			 * starting from back of the page, counting number of even pages in between n & p 
				starting from last page (either even or odd), if even then it could be on left of the book or else 
				if odd then it could be on the right side of the book along with even pair on its left 
			**/
			for(int j=n;j>p;j--){
				if(j%2 == 0){
					turnsFromBack = turnsFromBack + 1; 
				}
			}
		
			if(turnsFromFront < turnsFromBack){
				//System.out.println("turn fron front" + turnsFromFront);
				return turnsFromFront;
				
			}else{
				//System.out.println("turn fron back" + turnsFromBack);
				return turnsFromBack;
			}
		}
		
	}

	public static void main(String[] args) {

		int sP = new DrawingBookChallenge().shortestPath(10,5);
		System.out.println("shortest path has " + sP + " turnovers");
	}

}
