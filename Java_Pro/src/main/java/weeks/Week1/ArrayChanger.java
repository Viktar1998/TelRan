package weeks.Week1;

import java.util.Random;

public class ArrayChanger {

    public static void main(String[] args) {
        changeArray(createArray());
    }

    public static int[] createArray(){
        Random r = new Random();
        int length = r.nextInt(5,10);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            boolean isZero = r.nextBoolean();
            array[i] = isZero? 0: r.nextInt(1,10);
        }
        outPut(array);
        return array;
    }

    public static int[] changeArray(int[] array){
        int[] newArray = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                newArray[counter] = array[i];
                counter++;
            }
        }
        outPut(newArray);
        return newArray;
    }

    public static void outPut(int[] array){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(']');
    }
}
