package com.pluralsight;

public class NameFormatter {
    public static String format(String firstName, String lastName) {
        firstName = firstName.trim().substring(0,1).toUpperCase() + firstName.trim().toLowerCase().substring(1);
        lastName = lastName.trim().substring(0,1).toUpperCase() + lastName.trim().toLowerCase().substring(1);
        System.out.printf("%s %s\n", firstName, lastName);
        return lastName + " " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        prefix = prefix.trim().substring(0,1).toUpperCase() + prefix.trim().toLowerCase().substring(1);
        firstName = firstName.trim().substring(0,1).toUpperCase() + firstName.trim().toLowerCase().substring(1);
        middleName = middleName.trim().substring(0,1).toUpperCase() + middleName.trim().toLowerCase().substring(1);
        lastName = lastName.trim().substring(0,1).toUpperCase() + lastName.trim().toLowerCase().substring(1);
        suffix = suffix.trim().substring(0,1).toUpperCase() + suffix.trim().toLowerCase().substring(1);
        System.out.printf("%s, %s. %s %s, %s\n", lastName, prefix, firstName, middleName, suffix);
        return String.format("%s, %s. %s %s, %s\n", lastName, prefix, firstName, middleName, suffix);
    }

    public static String format(String fullName) {
        String[] tempArray = fullName.split("\\ ");
        if (tempArray.length == 2) {
            return tempArray[1] + tempArray[0];
        }
        else if (tempArray.length == 4) {
            return tempArray[2] + tempArray[1] + tempArray[0] + tempArray[3];
        }
        else if (tempArray.length == 5) {
            return String.format("%s, %s. %s %s, %s\n", tempArray[3], tempArray[0], tempArray[1], tempArray[2], tempArray[4]);
        }
        else return "Incorrect Name Format";
    }


}
