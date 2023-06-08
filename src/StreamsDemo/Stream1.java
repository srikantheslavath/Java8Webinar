package StreamsDemo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {
    public static void main(String[] args) {
//        int[] a = {1, 3, 6, 8, 10};
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                System.out.println(a[i]);
//            }
//        }

//        int []a ={1,2,3,4,5};
//        IntStream even = Arrays.stream(a).filter(n->n%2==0);
//        even.forEach(System.out::println);

//        List<Integer> list = Arrays.asList(1,2,3, 4, 6, 8, 22, 98, 5, 76);
//        List<Integer> filterlist = list.stream()
//                .filter(x->x%2==0)
//                .map(x->x/2)
//                .sorted()
//                .limit(2)
//                .skip(1)
//                .collect(Collectors.toList());
//        System.out.println(filterlist);

        LocalDate mydate = LocalDate.now();
        System.out.println(mydate);

    }
}
