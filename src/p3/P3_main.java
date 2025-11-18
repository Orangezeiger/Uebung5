package p3;

public class P3_main {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
                sum += m[i][j];
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print((m[i][j] + 1) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(sum);
        System.out.println();

        for(int i = 0; i < m.length; i++){
            System.out.print(m[2][i] + " ");
            System.out.print(m[1][i] + " ");
            System.out.print(m[0][i] + " ");
            System.out.println();
        }
    }
}
