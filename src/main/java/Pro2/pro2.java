/**Description:
 * <br/>算法分析与设计项目2：求最短路径问题
 * @author XB
 */
package Pro2;

import java.io.IOException;
import java.util.*;

public class pro2 {
	private static int INF=Integer.MAX_VALUE;  
	
	private int[][] path;    
	private List<Integer> result=new ArrayList<Integer>();  
	private int[][] dist; 
	


	public void floyd(int[][] Infor) {
		int n=Infor.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				path[i][j] = -1;
				dist[i][j] = Infor[i][j];
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (dist[i][k] != INF && dist[k][j] != INF
							&& dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
						path[i][j] = k;
					}
				}
			}
		}
	}
	
	public void findPath(int i,int j){  
        int k=path[i][j];  
        if(k==-1)
        	return;  
        findPath(i,k);  
        result.add(k);  
        findPath(k,j);  
    }  
  

	  public pro2(int size){  
	        this.path=new int[size][size];  
	        this.dist=new int[size][size];  
	    }  
	  
	  public  void findCheapestPath(int begin,int end,int[][] matrix){ 
	        floyd(matrix);  
	        result.add(begin);  
	        findPath(begin,end);  
	        result.add(end);  
	        List<Integer> list=result;  
	        System.out.println("from "+begin+" to "+end+",the cheapest path is:");  
	        System.out.println(list.toString());  
	 
	        System.out.println();
	        System.out.println("the minDist is"); 
	        System.out.println(dist[begin][end]);
	        System.out.println(); 
	    }  
	  
	public static void main(String[] args) throws IOException {
		pro2 p = new pro2(9); 
	     int[][] matrix={
	    		 	{INF,INF,INF,INF,INF,INF,INF,INF,INF},	
	                {INF,INF,30,50,INF,INF,INF,1,INF},  
	                {INF,30,INF,INF,32,21,INF,INF,INF},  
	                {INF,50,INF,INF,9,INF,INF,3,1},  
	                {INF,INF,32,9,INF,31,12,INF,44},  
	                {INF,INF,21,INF,INF,INF,50,INF,INF},
	                {INF,INF,INF,INF,12,50,INF,INF,77},
	                {INF,1,INF,3,INF,INF,INF,INF,INF},
	                {INF,INF,INF,1,44,INF,77,INF,INF}
	        };  
	    p.findCheapestPath(7,6, matrix);
	}
}
