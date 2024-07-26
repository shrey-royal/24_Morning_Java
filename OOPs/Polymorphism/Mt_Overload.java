public class Mt_Overload {
    public static void main(String[] args) {
        int[][] matrix1Data = {{1, 2}, {3, 4}};
        int[][] matrix2Data = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(matrix1Data);
        Matrix matrix2 = new Matrix(matrix2Data);

        System.out.println("Matrix 1:");
        matrix1.display();
        System.out.println("\nMatrix 2:");
        matrix2.display();

        Matrix result;

        result = matrix1.add(matrix2);
        System.out.println("\nMatrix 1 + Matrix 2:");
        result.display();

        result = matrix1.add(10);
        System.out.println("\nMatrix 1 + (Scalar)10:");
        result.display();
    }
}

class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new int[rows][cols];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public Matrix add(Matrix other) {
        if(this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrix dimensions must match for addition.");
            return new Matrix(0, 0);
        }

        Matrix result = new Matrix(this.rows, this.cols);

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return result;
    }

    public Matrix add(int scalar) {
        Matrix result = new Matrix(this.rows, this.cols);

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result.data[i][j] = this.data[i][j] + scalar;
            }
        }
        return result;
    }

    public void display() {
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.printf("%02d ", data[i][j]);
            }
            System.out.println();
        }
    }
}