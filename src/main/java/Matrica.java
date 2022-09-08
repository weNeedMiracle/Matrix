import java.util.Random;

public class Matrica {
    Random rd = new Random();
    int a;
    int b;
    int[][] m1;
    int[][] m2;
    int u;

    void get(int a, int b){
        this.a = a;
        this.b = b;
    }

    void sozdat(int a, int b){
        int[][] m1 = new int[a][b];
        int[][] m2 = new int[a][b];
        for (int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                m1[i][j] = rd.nextInt(11);
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[i].length; j++){
                m2[i][j] =rd.nextInt(11);
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        this.m1 = m1;
        this.m2 = m2;
    }
    void sloz(int[][] m1, int[][] m2){
        int[][] sum = new int[m1.length][m1[0].length];
        for(int i = 0; i < m1.length || i < m2.length; i++){
            for(int j = 0; j < m1[i].length || j < m2[i].length; j++){
                sum[i][j] = m1[i][j]+m2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void unch(int[][] m1, int u){
        int[][] m = new int[m1.length][m1[0].length];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                m[i][j] = m1[i][j]*u;
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void umMat(int[][] m1, int[][] m2){
        int[][] m = new int[m1.length][m1[0].length];
        int r = 0;
        for(int i = 0; i < m1.length || i < m2.length; i++) {
            for (int j = 0; j < m1[i].length || j < m2[i].length; j++) {
                if(m1.length < m1[i].length) {
                    for (int k = 0; k < m1.length; k++) {
                        r = r + (m1[i][k] * m2[k][j]);
                    }
                }
                else {
                    for (int k = 0; k < m1[i].length; k++) {
                        r = r + (m1[i][k] * m2[k][j]);
                    }
                }
                m[i][j] = r;
                r = 0;
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}


