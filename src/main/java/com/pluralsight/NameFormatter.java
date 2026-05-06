package com.pluralsight;

public class NameFormatter {
    private String firstName, lastName, middleName, prefix, suffix;

    public static String format(String firstName, String lastName) {
        firstName = firstName.trim().replaceAll("\\s+", "").substring(0,1).toUpperCase() + firstName.trim().replaceAll("\\s+", "").toLowerCase().substring(1);
        lastName = lastName.trim().replaceAll("\\s+", "").substring(0,1).toUpperCase() + lastName.trim().replaceAll("\\s+", "").toLowerCase().substring(1);
        System.out.printf("%s %s\n", firstName, lastName);
        return firstName + " " + lastName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        prefix = prefix.trim().replaceAll("\\s+", "").substring(0,1).toUpperCase() + prefix.trim().replaceAll("\\s+", "").toLowerCase().substring(1);
        firstName = firstName.trim().replaceAll("\\s+", "").substring(0,1).toUpperCase() + firstName.trim().replaceAll("\\s+", "").toLowerCase().substring(1);
        middleName = middleName.trim().replaceAll("\\s+", "").substring(0,1).toUpperCase() + middleName.trim().replaceAll("\\s+", "").toLowerCase().substring(1);
        lastName = lastName.trim().replaceAll("\\s+", "").substring(0,1).toUpperCase() + lastName.trim().replaceAll("\\s+", "").toLowerCase().substring(1);
        suffix = suffix.trim().replaceAll("\\s+", "").substring(0,1).toUpperCase() + suffix.trim().replaceAll("\\s+", "").toLowerCase().substring(1);
        System.out.printf("%s. %s %s %s, %s\n", prefix, firstName, middleName, lastName, suffix);
        return prefix + ". " + firstName + " " + middleName + " " + lastName + ", " + suffix;
    }

    public static String format(String fullName) {
        return fullName;
    }


}
