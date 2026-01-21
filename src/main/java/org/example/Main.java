package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));


        //Stream functions - FMSCRF
        List<Integer> list = List.of(1, 2, 3 ,4 , 5, 6);
        //1. F - filter - filtering only the even nums
        List<Integer> evenNums = list.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());

        //2. M - map - transforms the data into another form
        List<Integer> squareNums = list.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());

        //3. S - sort - sort the data
        List<Integer> descSorted = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        //4. C - collect - collect the data to list/map/set
        Set<Integer> numberSet = list.stream()
                .collect(Collectors.toSet());

        //5. R - reduce - aggregates the data to a unified value
        int total = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(total);

        //6. F - forEach - consumes the data
        descSorted.stream()
                .forEach(System.out::println);

        //Combined
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.stream()
                .filter(n -> n % 2 == 0)//intermediate
                .map(n -> n * n)//intermediate
                .forEach(System.out::println);//ternary

    }
}