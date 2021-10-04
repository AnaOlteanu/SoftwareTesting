package pachet1;

import javafx.util.Pair;

import java.io.*;
import java.util.*;


public class MyClass {


    static class Compare implements Comparator<Pair<Integer,Integer>>{
        @Override
        public int compare(Pair<Integer,Integer> p1, Pair<Integer,Integer> p2){
            if(p1.getValue() == p2.getValue())
                return p1.getKey() - p2.getKey();
            return  p1.getValue() - p2.getValue();
        }
    }

    public static void gaseste_interval(File f) throws IOException {

        Scanner myScanner = new Scanner(f);
        FileWriter myWriter = new FileWriter("src/pachet1/licentaOut.txt");

        int n, k, m, i, j;
        boolean ok = false;

        k = myScanner.nextInt();
        if(k < 1 || k > 30){
            myWriter.write("k trebuie sa fie intre 1 si 30");
            myWriter.close();
            return;
        }

        n = myScanner.nextInt();
        if(n < 1 || n > 5){
            myWriter.write("n trebuie sa fie intre 1 si 5");
            myWriter.close();
            return;
        }


        List<Pair<Integer,Integer>> interval_mihaela = new ArrayList<>();

        for(i = 0; i < n; i ++){
            int x = myScanner.nextInt();
            int y = myScanner.nextInt();
            interval_mihaela.add(new Pair(x,y));
        }

        m = myScanner.nextInt();
        if(m < 1 || m > 5){
            myWriter.write("m trebuie sa fie intre 1 si 5");
            myWriter.close();
            return;
        }

        List<Pair<Integer,Integer>> interval_prof = new ArrayList<>();

        for(i = 0; i < m; i ++){
            int x = myScanner.nextInt();
            int y = myScanner.nextInt();
            interval_prof.add(new Pair(x,y));
        }

        Collections.sort(interval_mihaela, new Compare());
        Collections.sort(interval_prof, new Compare());



        for(i = 0; i < n && ok == false; i++){
            j = 0;
            while(j < m && interval_prof.get(j).getValue() < interval_mihaela.get(i).getKey() ) {
                j++;
            }
            while(j < m && interval_prof.get(j).getKey() <= interval_mihaela.get(i).getValue() && !ok){
                int x_m = interval_mihaela.get(i).getKey();
                int y_m = interval_mihaela.get(i).getValue();
                int x_p = interval_prof.get(j).getKey();
                int y_p = interval_prof.get(j).getValue();

                Pair<Integer,Integer> interval = new Pair<>(0,0);

                if(x_m <= x_p && y_m >= y_p) //intervalul mihaelei contine pe cel al profului
                    interval = new Pair<>(x_p, y_p);
                else if(x_m >= x_p && y_m <= y_p) //intervalul profului contine pe cel al mihaelei
                    interval = new Pair<>(x_m, y_m);
                else if(x_m > x_p && y_m > y_p) //intervalul profului incepe inainte de mihaela si se termina inainte de mihaela
                    interval = new Pair<>(x_m, y_p);
                else if(x_m < x_p && y_m < y_p) //intervalul mihaelei incepe inainte de prof si se termina inainte de prof
                    interval = new Pair<>(x_p, y_m);

                int lungime = interval.getValue() - interval.getKey();

                if(lungime >= k){
                    int a = interval.getKey();
                    int b = interval.getKey() + k;

                    myWriter.write(a + " " + b);
                    myWriter.close();
                    ok = true;
                }
                j++;
            }
        }

        if(!ok) {
            myWriter.write("-1");
            myWriter.close();
        }

    }

    public static void main(String args[]){
        try{
            File f = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaIn.txt");
            gaseste_interval(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}