package javabasics;

import java.util.Scanner;

public class bai64 {
    public static boolean isleapyear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int checkmonth(String month, int year) {
        switch (month) {
            case "Jan.":
            case "January":
            case "1":
            case "Jan":
                return 31;
            case "February":
            case "Feb.":
            case "Feb":
            case "2":
                return isleapyear(year) ? 29 : 28;
            case "March":
            case "Mar.":
            case "Mar":
            case "3":
                return 31;
            case "April":
            case "Apr":
            case "Apr.":
            case "4":
                return 30;
            case "May":
            case "5":
                return 31;
            case "June":
            case "Jun":
            case "6":
                return 30;
            case "July":
            case "7":
                return 31;
            case "August":
            case "Aug.":
            case "Aug":
            case "8":
                return 31;
            case "September":
            case "Sept.":
            case "Sept":
            case "9":
                return 30;
            case "October":
            case "Oct.":
            case "Oct":
            case "10":
                return 31;
            case "November":
            case "Nov.":
            case "Nov":
            case "11":
                return 30;
            case "December":
            case "Dec.":
            case "Dec":
            case "12":
                return 31;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Nhap nam: ");
        int year = keyboard.nextInt();

        while (year < 0) {
            System.out.println("Nam khong hop le. Nhap lai: ");
            year = keyboard.nextInt();
        }

        keyboard.nextLine();

        String month;
        int check;
        do {
            System.out.print("Nhap thang: ");
            month = keyboard.nextLine();
            check = checkmonth(month, year);

            if (check == -1) {
                System.out.println("Thang khong hop le. Vui long nhap lai.");
            }
        } while (check == -1); 

        System.out.println("So ngay cua thang " + month + " nam " + year + " la: " + check);

        keyboard.close();
    }
}
