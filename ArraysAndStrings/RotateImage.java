package ArraysAndStrings;
/*Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]*/

public class RotateImage {
	public static void rotate(int[][] matrix){
		int n=matrix.length;
	    for (int layer=0; layer<n/2; layer++){ 
	    	int first = layer;
	    	int last = n - 1 - layer;
	        for (int i = first; i<last; i++) {
	        	int offset = i-first;
	            int top=matrix[first][i]; //Save Top
	            matrix[first][i]=matrix[last-offset][first]; // Left -> Top
	            matrix[last-offset][first]=matrix[last][last-offset]; // Bottom -> Left
	            matrix[last][last-offset]=matrix[i][last]; // right -> bottom
	            matrix[i][last]=top; // top -> right
	        }
	    }
	    System.out.println(matrix);
	}
	public static void main(String args[]){
		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}
}
