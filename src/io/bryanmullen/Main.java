package io.bryanmullen;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Define constants
        final int WORKING_WEEKS_IN_YEAR = 48;

        // Define variables - assume either could have decimal point
        double monthlyWage;
        double weeklyHours;
        double annualWage;
        double hourlyWage;

        // Store users monthly wage and convert to integer
        String monthlyWageStr = JOptionPane.showInputDialog(
                null,
                "How much do you make per month?"
        );
        monthlyWage = Integer.parseInt(monthlyWageStr);

        // Store users weekly hours and convert to integer
        String weeklyHoursStr = JOptionPane.showInputDialog(
                null,
                "How many hours do you work per week?"
        );
        weeklyHours = Integer.parseInt(weeklyHoursStr);

        // Calculate annual and hourly income
        annualWage = monthlyWage * 12;
        hourlyWage = annualWage / WORKING_WEEKS_IN_YEAR / weeklyHours;

        // Get Locale
        Locale locale = new Locale("en", "IE");
        // Create formatter for locale
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

        // Display users annual wage
        JOptionPane.showMessageDialog(
                null,
                "You make " + formatter.format(annualWage) + " per year."
        );

        // Display users hourly wage
        JOptionPane.showMessageDialog(
                null,
                "You make " + formatter.format(hourlyWage) + " per hour on average, " +
                        "after holidays are considered."
        );

    }
}
