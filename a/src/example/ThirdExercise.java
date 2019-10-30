package example;


import java.util.Scanner;

public class ThirdExercise {
    public static String write(int digit, int pos){
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] ten = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensTime = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] more = {"hundred", "thousand"};
        String sentence = "";
        if(pos == 1){
            digit *= 10;
        }
        if(pos != 1) {
            if (digit == 1) {
                sentence += numbers[0] + " ";
            } else if (digit == 2) {
                sentence += numbers[1] + " ";
            } else if (digit == 3) {
                sentence += numbers[2] + " ";
            } else if (digit == 4) {
                sentence += numbers[3] + " ";
            } else if (digit == 5) {
                sentence += numbers[4] + " ";
            } else if (digit == 6) {
                sentence += numbers[5] + " ";
            } else if (digit == 7) {
                sentence += numbers[6] + " ";
            } else if (digit == 8) {
                sentence += numbers[7] + " ";
            } else if (digit == 9) {
                sentence += numbers[8] + " ";
            } else if (digit == 10) {
                sentence += ten[0] + " ";
            } else if (digit == 11) {
                sentence += ten[1] + " ";
            } else if (digit == 12) {
                sentence += ten[2] + " ";
            } else if (digit == 13) {
                sentence += ten[3] + " ";
            } else if (digit == 14) {
                sentence += ten[4] + " ";
            } else if (digit == 15) {
                sentence += ten[5] + " ";
            } else if (digit == 16) {
                sentence += ten[6] + " ";
            } else if (digit == 17) {
                sentence += ten[7] + " ";
            } else if (digit == 18) {
                sentence += ten[8] + " ";
            } else if (digit == 19) {
                sentence += ten[9] + " ";
            }
        }else {
            if (digit == 20) {
                sentence += tensTime[0] + " ";
            } else if (digit == 30) {
                sentence += tensTime[1] + " ";
            } else if (digit == 40) {
                sentence += tensTime[2] + " ";
            } else if (digit == 50) {
                sentence += tensTime[3] + " ";
            } else if (digit == 60) {
                sentence += tensTime[4] + " ";
            } else if (digit == 70) {
                sentence += tensTime[5] + " ";
            } else if (digit == 80) {
                sentence += tensTime[6] + " ";
            } else if (digit == 90) {
                sentence += tensTime[7] + " ";
            }
        }

        if(pos == 3){
            sentence += more[1] + " ";
        }else if(pos == 2){
            sentence += more[0] + " ";
        }
        return sentence;
    }

    public static void divide(int number){
        String s = Integer.toString(number);
        int n = s.length();
        int[] digits = new int[n];
        for(int i = 0; i < n; i++){
            digits[i] = (int) s.charAt(i) - 48;
        }
        String sentence = "";
        for(int i = 0; i < n; i++){
            if(digits[i] == 1 && (i + 1 == n - 1)){
                digits[i] = digits[i] * 10 + digits[i+1];
                sentence += write(digits[i],n - i - 2);
                i++;
                continue;
            }
            sentence += write(digits[i],n - i - 1);
        }
        System.out.println(sentence);
    }

    public static void main(String[] args){
        //third
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if(number >= 1 && number <= 9999){
            divide(number);
        }

    }
}

