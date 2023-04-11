package org.example;
import java.util.ArrayList;
import java.util.List;

public class CountryList {
    List<Country> countryList;
    public static void main(String[] args) {
    }

    static int getSize(List list) {
        return list.size();
    }

    static void displayList (List list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty");
        }else {
            System.out.println("The collection has " + getSize(list) + " countries in it !");
        }
    }

}
