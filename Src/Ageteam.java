import sun.net.RegisteredDomain;

import java.util.Arrays;
import java.util.Random;



public class Ageteam {
    public static void main(String[] args) {
        int[] array = new int[50];
        int[] mas1 = new int[20];
        int[] mas2 = new int[21];
        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        double average1 = 20;
        double average2 = 21;
        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        }
        if(average1 > average1){
            System.out.println("Среднее возраст первой команды ("+average1+") больше среднего возраста "+
                    "второй команды ("+average2+")");
        } else if(average1 < average2){
            System.out.println("Средний возраст первой команды ("+average1+") меньше среднего возраста "+
                    "второй команды ("+average2+")");
        } else {
            System.out.println("Средние возроста команд равны ("+average1+")");
        }


        }
    }












