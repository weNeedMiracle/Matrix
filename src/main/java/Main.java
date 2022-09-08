public class Main {
    public static void main(String[] args) {
    Matrica mat1 = new Matrica();
    mat1.get(5,3);
    mat1.u = 3;
    mat1.sozdat(mat1.a, mat1.b);
    System.out.println("Сложение матриц:");
    mat1.sloz(mat1.m1, mat1.m2);
    System.out.println("Матрица умноженная на число:");
    mat1.unch(mat1.m1, mat1.u);
    System.out.println("Умноженая матрица:");
    mat1.umMat(mat1.m1, mat1.m2);
    }
}
