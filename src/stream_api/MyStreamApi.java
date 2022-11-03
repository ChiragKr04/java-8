package stream_api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

class MyStreamApiFunctions {
    private int generateRandomNumber(){
        return (int)(Math.random()*(101));
    }
    public ArrayList<Integer> generateRandomArray(int length){
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            array.add(generateRandomNumber());
        }

        return array;
    }
}

public class MyStreamApi{
    public static void main(String[] args) {

        MyStreamApiFunctions myStreamApiFunctions = new MyStreamApiFunctions();

        ArrayList<Integer> myArray = myStreamApiFunctions.generateRandomArray(10);

        System.out.println(myArray);

        System.out.println(myArray.stream().filter(integer -> integer < 10).collect(Collectors.toList()));

        System.out.println(myArray.stream().map(integer -> integer * 100).collect(Collectors.toList()));

        var data = myArray.stream().reduce(Integer::sum);
        boolean isPresent = data.isPresent();

        System.out.println(isPresent? data.get(): "Error");

    }
}
