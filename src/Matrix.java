public class Matrix {
    double[][] matrix;

    private int rows;
    private int columns;

    public Matrix(double[][] matrix, int rows, int columns) {
        this.matrix = matrix;
        this.rows = rows;
        this.columns = columns;

    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] matrix_add(double[][] matrix, double[][] matrix_b, int rows, int columns) {
        double[][] matrix_c = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix_c[i][j] = matrix[i][j] + matrix_b[i][j];
            }
        }
        return matrix_c;
    }

    void print(double[][] matrix231232, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(matrix231232[i][j]);
            }
            System.out.println();
        }
    }

    public double[][] matrix_ymnoj(double[][] matrix, double[][] matrix_b, int rows, int columns) {
        double[][] ymnoj = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    ymnoj[i][j] += matrix[i][k] * matrix_b[k][j];
                }
            }
        }
        return ymnoj;
    }
    public double[][] matrix_ymnoj_na_chislo(double[][] matrix, int rows, int columns, int n){
        double[][] chislo = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                chislo[i][j] = matrix[i][j] * n;
            }
        }
        return chislo;
    }
}

