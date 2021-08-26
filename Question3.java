public class Question3 {
    public static void main(String[] args) {
        String[] month = new String[]{" ", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        int number;
        number = Integer.parseInt(args[0]);
        System.out.println("The month name with the number " + number + " is: " + month[number]);

    }

}


