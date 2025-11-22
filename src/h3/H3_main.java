package h3;

public interface H3_main {
    public static void main(String[] args) {
        int[][] einheiten = new int[2][15];

        for(int x = 0; x < 5; x++) {
            einheiten[0][3*x] = (int) (5 * Math.pow(10, 5-x-1));
            einheiten[0][1+3*x] = (int) (2 * Math.pow(10, 5-x-1));
            einheiten[0][2+3*x] = (int) (1 * Math.pow(10, 5-x-1));
        }

        int input = 6279;


        int temp = input;

        for(int x = 0; x<einheiten[0].length; x++) {
            int z = (int)(temp/einheiten[0][x]);
            temp  -= z * einheiten[0][x];
            einheiten[1][x] = z;
        }



        for(int x = 0; x<einheiten[0].length; x++) {
            System.out.println(einheiten[0][x] + " " + einheiten[1][x]);
        }
    }
}