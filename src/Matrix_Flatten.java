public class Matrix_Flatten {

    public int[] flatten_3d_matrix(int[][][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int p = mat[0][0].length;
        int arr[] = new int[n * m * p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    arr[i + (m-1) * (j + (p-1) * k)] = mat[i][j][k];
                }
            }
        }
        return arr;
    }

    // main function to test the flatten_3d_matrix function
    public static void main(String[] args) {
        Matrix_Flatten f = new Matrix_Flatten();
        // Initialize a 3d matrix
        int[][][] mat = new int[][][]{
                {{3, 4, 2, 3}, {0, -3, 9, 11}, {23, 12, 23, 2}},
                {{13, 4, 56, 3}, {5, 9, 3, 5}, {5, 1, 4, 9}}
        };
        int n = mat.length;
        int m = mat[0].length;
        int p = mat[0][0].length;

        // flat the matrix to 1 d array
        int arr[] =f.flatten_3d_matrix(mat);

        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    System.out.print(mat[i][j][k] + " " + arr[i + (m-1) * (j + (p-1) * k)] + " , ");
                }
                System.out.println();
            }
        }
    }
}