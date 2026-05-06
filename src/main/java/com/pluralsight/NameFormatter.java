package com.pluralsight;

public class NameFormatter {
    public static String format(String firstName, String lastName) {
        firstName = firstName.trim().substring(0,1).toUpperCase() + firstName.trim().toLowerCase().substring(1);
        lastName = lastName.trim().substring(0,1).toUpperCase() + lastName.trim().toLowerCase().substring(1);
        System.out.printf("%s %s\n", firstName, lastName);
        return firstName + " " + lastName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        prefix = prefix.trim().substring(0,1).toUpperCase() + prefix.trim().toLowerCase().substring(1);
        firstName = firstName.trim().substring(0,1).toUpperCase() + firstName.trim().toLowerCase().substring(1);
        middleName = middleName.trim().substring(0,1).toUpperCase() + middleName.trim().toLowerCase().substring(1);
        lastName = lastName.trim().substring(0,1).toUpperCase() + lastName.trim().toLowerCase().substring(1);
        suffix = suffix.trim().substring(0,1).toUpperCase() + suffix.trim().toLowerCase().substring(1);
        System.out.printf("%s. %s %s %s, %s\n", prefix, firstName, middleName, lastName, suffix);
        return prefix + ". " + firstName + " " + middleName + " " + lastName + ", " + suffix;
    }

    public static String format(String fullName) {
        String[] tempArray = fullName.split(" ");
        String extra = "";
        for (String x : tempArray) {
            extra = extra + x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        System.out.println(extra);
        return fullName;
    }


}
