import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // To find evennumber
//        List<Integer> numberList= Arrays.asList(2,3,4,5,6,7,8,12,14,15,17,20);
//        List<Integer> evenNumber= new ArrayList<>();
//       evenNumber= numberList.stream().filter(n-> n%2==0).collect(Collectors.toList());
//        System.out.println(evenNumber);
//        numberList.stream().filter(n-> n%2==0).forEach(System.out::println);

        // Remove null
//        List<String> words= Arrays.asList("cup" , "bus", null , "train", null, "book");
//        List<String> result = new ArrayList<>();
//        result= words.stream().filter(w-> w!=null).collect(Collectors.toList());
//        System.out.println(result);

       // print only that name which is greater than 4 and lss than 8
//        List<String> names= Arrays.asList("Soumyadip" , "Pankaj", "Joy", "Rajendra","Deb");
//        List<String> longName= names.stream().filter(str->str.length()>4 && str.length()<8).collect(Collectors.toList());
//        System.out.println(longName);

            // Map Method ----->
//        give me list with upper case
//        List<String> vechile= Arrays.asList("bus","Train","Cycle" , "Bike","Toto");
//        List<String> vechileWithUpperCase= vechile.stream().map(vname->vname.toUpperCase()).collect(Collectors.toList());
//        System.out.println(vechileWithUpperCase);

        // find all the element length
//        List<String> vechile=Arrays.asList("bus","Train","Cycle" , "Bike","Toto");
//      vechile.stream().map(vname->vname.length()).forEach(len->System.out.println(len));

        // use distinct() method
//        List<Integer> numbers=  Arrays.asList(2,3,4,5,6,7,7,2,9,9,1,4);
//        List<Integer> distint= numbers.stream().distinct().collect(Collectors.toList());
//        System.out.println(distint);

        // use count() method
//        List<Integer> numbers=  Arrays.asList(2,3,4,5,6,7,7,2,9,9,1,4);
//        long count= numbers.stream().distinct().count();
//        System.out.println(count);


        // use limit() method
//        List<Integer> numbers=  Arrays.asList(2,3,4,5,6,7);
//        List<Integer> limit = numbers.stream().limit(3).collect(Collectors.toList());
//        System.out.println(limit);

        // use count method to find how many even numbers are there
//        List<Integer> numberList= Arrays.asList(2,3,4,5,6,7,8,12,14,15,17,20);
//        long evenNumber= numberList.stream().filter(n-> n%2==0).count();
//        System.out.println(evenNumber);

        //min() && max()
//        List<Integer> numberList= Arrays.asList(2,3,4,5,6,7,8,12,14,15,17,20);
//        Optional<Integer> min= numberList.stream().min((val1 , val2 )->{
//            return val1.compareTo(val2);
//        });
//        System.out.println(min.get());

        //max()
//        List<Integer> numberList= Arrays.asList(2,3,4,5,6,7,8,12,14,15,17,20);
//        Optional<Integer> max = numberList.stream().max((val1 , val2 )->{
//            return val1.compareTo(val2);
//        });
//        System.out.println(max.get());

        // reduce() when we combine all the obj into single collection
//        List<String> stringList = Arrays.asList("A","B","C","D","3","8","9");
//      Optional<String> reduced = stringList.stream().reduce((value , combinedvalue)->
//                                 { return combinedvalue + value;
//
//        });
//        System.out.println(reduced.get());
                    // <----------------------THIS IS ALL THE TERMINAL OPERATION------------------------------------->

//        List<Integer> list1 = Arrays.asList(2,3,4,5,6,7,8,12,14,15,17,20);
//        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList);

        //anyMatch() && allMatch()

//        Set<String> fruites= new HashSet<>();
//        fruites.add("One Mango");
//        fruites.add("One Mango");
//        fruites.add("Two Apple");
//        fruites.add("One Graves");
//        fruites.add("Three Lemon");
//       boolean result = fruites.stream().anyMatch(value-> {return value.startsWith("One");});
//        System.out.println(result);
//
//       allMatch
//        result = fruites.stream().allMatch(value->{return value.startsWith("one"); });
//        System.out.println(result);


    }
}