public class Question2 {
    public static void main(String[] args) {
        int[] marks = new int[10];
        int sum = 0;
        for(int i=0;i<10;i++){
            int n;
            n = Integer.parseInt(args[i]);
            marks[i] = n;
            sum = sum + marks[i]*marks[i];
        }
        System.out.println("The sum of square of numbers in array is: " + sum);

    }

}
