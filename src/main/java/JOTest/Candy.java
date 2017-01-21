package JOTest;
/**
 * There are N children standing in a line. Each child is assigned a rating value.
 * You are giving candies to these children subjected to the following requirements:
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 * 
 * @author XB
 *
 */
public class Candy {
	static void setResults(int[] results, int[] ratings, int i){
		if(ratings[i] > ratings[i-1]){
			results[i] = results[i-1] + 1;
		}else if(ratings[i] == ratings[i-1]){
			results[i] = 1;
		}else{
			results[i] = 1;
		}
	}
	
	static public int candy(int[] ratings){
		int given = 0;
		int length = ratings.length;
		int[]  results = new int[length];
		for(int i = 1;i < length; i++)
			setResults(results, ratings, i);
		for(int j: results){
			given += j;
			System.out.println("Results: " + j);
		}
		return given;
	}
	
	public static void main(String[] args){
		int[] test = {2,3,4,1,0,0,4};
		System.out.println(candy(test));
	}
}
