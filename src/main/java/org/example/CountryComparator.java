package org.example;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    private boolean isDescending;

    public CountryComparator(boolean isDescending) {
        this.isDescending = isDescending;
    }

    public int compare(Country c1, Country c2) {
        if (!isDescending) {
            return c1.toString().compareTo(c2.toString());
        } else {
            return c2.toString().compareTo(c1.toString());
        }
    }

    public static Comparator<Country> compareByLength(boolean isDescending) {
        Comparator<Country> comparator = (c1, c2) -> Integer.compare(c1.name.length(), c2.name.length());
        if (isDescending) {
            comparator = comparator.reversed();
        }
        return comparator;
    }

}
