public class Question1 {
    public static void main(String[] args) {
        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        int[] input = {x, y, z};
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                for (z = 0; z < 3; z++) {
                    if (x != y && y != z && z != x) {
                        System.out.println(input[x] + "" + input[y] + "" + input[z]);
                    }
                }
            }
        }
    }
}