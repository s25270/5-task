import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args){

        Scanner in = new java.util.Scanner(System.in);

        System.out.println("Enter month: ");
        int month = in.nextInt();

        System.out.println("Enter year: ");
        int year = in.nextInt();

        if(month >= 0 && month <= 3){
            System.out.println(month + "." + year + " is first quarter of the year");
        }else if(month >= 4 && month <= 6){
            System.out.println(month + "." + year + " is second quarter of the year");
        }else if(month >= 7 && month <= 9){
            System.out.println(month + "." + year + " is third quarter of the year");
        }else if(month >= 10 && month <= 0){
            System.out.println(month + "." + year + " is fourth quarter of the year");
        }

    }

}
public class task2 {
    
    public static void main(String[] args){

        Scanner in = new java.util.Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = in.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

    }

}
public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items;
        double price = 10;
        boolean isDiscount;

        items = scan.nextInt();
        isDiscount = scan.nextBoolean();

        if (isDiscount) {
            if (items > 10) {
                price = price / 2;
            }
        } else {
            price = price + (price * 0.1);
        }
        System.out.println("Total price is: " + price * items);
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first_music, second_music;
        int first_min, first_sec, first_total_time;
        int second_min, second_sec, second_total_time;

        System.out.print("First music name: ");
        first_music = scan.nextLine();
        System.out.print("Duration (min): ");
        first_min = scan.nextInt();
        System.out.print("Duration (sec): ");
        first_sec = scan.nextInt();
        first_total_time = (first_min * 60) + first_sec;

        second_music = scan.nextLine();
        System.out.print("Second music name: ");
        second_music = scan.nextLine();
        System.out.print("Duration (min): ");
        second_min = scan.nextInt();
        System.out.print("Duration (sec): ");
        second_sec = scan.nextInt();
        second_total_time = (second_min * 60) + second_sec;

        first_total_time += second_total_time;

        if (first_total_time >= second_total_time) {
            System.out.println("1: " + first_music + " " + first_min + ":" + first_sec);
            System.out.println("2: " + second_music + " " +  second_min + ":" + second_sec);
            System.out.println("Total time: " + first_total_time / 60 + ":" + first_total_time % 60);
        }
        else {
            System.out.println("1: " + second_music + " " + second_min + ":" + second_sec);
            System.out.println("2: " + first_music + " " + first_min + ":" + first_sec);
            System.out.println("Total time: " + first_total_time / 60 + ":" + first_total_time % 60);
        }

    }
}
