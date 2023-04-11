package org.example;
import java.util.*;
import static org.example.CountryList.displayList;
import org.example.CountryComparator;


public class Main {
    public static void main(String[] args) {
//        a), b)
        List<Country> countryList = new ArrayList<>();
        System.out.println("|| Adding countries ... ||");
        countryList.add(new Country("France"));
        countryList.add(new Country("Germany"));
        countryList.add(new Country("España"));
        countryList.add(new Country("England"));

        displayList(countryList);
        for (Country country: countryList) {
            System.out.println(country.name);
        }

//        c)
        System.out.println("\n|| Clearing the list ... ||");
        countryList.clear();
        displayList(countryList);
        for (Country country: countryList) {
            System.out.println(country.name);
        }

//        d)
        System.out.println("\n|| Adding countries ... ||");
        countryList.add(new Country("Brasiliumium"));
        countryList.add(new Country("Canadada"));
        countryList.add(new Country("Russia"));
        countryList.add(new Country("China"));
        displayList(countryList);
        for (Country country: countryList) {
            System.out.println(country.name);
        }

        System.out.println("\n|| Changing 1 country ... ||");
        countryList.set(2, new Country("Korea"));
        displayList(countryList);
        for (Country country: countryList) {
            System.out.println(country.name);
        }

//        e)
        System.out.println("\n|| Sorting ASC countries ... ||");
        Collections.sort(countryList, new CountryComparator(false));
        for (Country country : countryList) {
            System.out.println(country);
        }

        System.out.println("\n|| Sorting DSC countries ... ||");
        Collections.sort(countryList, new CountryComparator(true));
        for (Country country : countryList) {
            System.out.println(country);
        }


//        f)
        System.out.println("\n|| Sorting countries by length ... ||");
        Collections.sort(countryList, CountryComparator.compareByLength(false));
        for (Country country: countryList) {
            System.out.println(country.name);
        }

//        g)
        System.out.println("\n|| Removing countries with name length > 5 ... ||");
        countryList.removeIf(c -> c.name.length() > 5);
        displayList(countryList);
        for (Country country: countryList) {
            System.out.println(country.name);
        }
    }
}