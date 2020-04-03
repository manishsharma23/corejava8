package com.streamjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()                        // Convert to steam
                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

       // System.out.println("result1.."+result1);
        
        List<Person> customersWithMoreThan10Points = persons
        		  .stream()
        		  .filter(c -> c.getAge() > 10)
        		  .collect(Collectors.toList());
        
        customersWithMoreThan10Points.forEach(customers->System.out.println(customers.getName()));
        
        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println("...result2...."+result2);

    }

}