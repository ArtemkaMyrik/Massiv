public class Main {
    public static void main(String[] args) {
        double[][] matrix23123213 = {{1, 2}, {3, 4}, {5, 6}};
        Matrix MAT = new Matrix(matrix23123213,2,3);
        MAT.print(matrix23123213,3,2);

        double[][] matrix3213 = {{1, 2}, {3, 4}, {5, 6}};
        MAT.print(MAT.matrix_add(matrix3213,matrix23123213,3,2),3,2);

        double[][] matrix666 = {{2,2}, {8,9}, {1,8}};
        MAT.print(MAT.matrix_ymnoj(matrix23123213,matrix666,3,2),3,2);

        double[][] matrix222222222 = {{5,2}, {6,9}, {44,1}};
        MAT.print(MAT.matrix_ymnoj_na_chislo(matrix222222222,3,2,5),3,2 );
    }
}