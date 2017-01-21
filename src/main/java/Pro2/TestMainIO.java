package Pro2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TestMainIO {
	
	  public static void main(String[] args) throws IOException {  
	        TestMainIO test_print = new TestMainIO();  
	        int[][] G = test_print.init(10); 
	        int[][] Dis = test_print.floyd(G, 10);     
	        test_print.printG(Dis, 10);  
	    }  
	      
	  
	  public int[][] init(int v) throws IOException{
		  int[][] G = new int[v][v];
		  BufferedReader in = new BufferedReader(new FileReader(new File(
					"D:\\eclipse\\workSpace\\JTest\\src\\Pro2\\infor.txt")));
			String line = in.readLine();
			String[] sline;
			while (line != null) {
				sline = line.split("\\s");
				
				G[Integer.parseInt(sline[0])-1][Integer.parseInt(sline[1])-1] = Integer
						.parseInt(sline[2]);
				line=in.readLine();
			}
			in.close();
			return G;
	  }
	  
	    public void printG(int[][] G,int n){  
	        for(int i=0;i<n;i++){  
	            for(int j=0;j<n;j++){  
	                System.out.println(i+"->"+j+"  "+G[i][j]);  
	            }  
	        }  
	    }  
	  
	
	      
	    public int[][] floyd(int[][] G,int n){  
	        int[][] Dis= new int[n][n];  
	        for(int q=0;q<n;q++){  
	            for(int w=0;w<n;w++){  
	                Dis[q][w]=G[q][w];  
	            }  
	        }  
	              
	        for(int k = 0; k < n; k++){  
	            for(int i=0; i < n; i++ ){  
	                for(int j=0; j < n; j++){  
	                    if(Dis[i][j]>Dis[i][k]+Dis[k][j]){  
	                        Dis[i][j]=Dis[i][k]+Dis[k][j];  
	                    }  
	                }  
	            }  
	        }  
	        return Dis;  
	    }  
}
