import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("plik.txt");
        file.createNewFile();
        List<Integer> list = new ArrayList();
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        System.out.println(list);
        TreeSet<Numbers> set = new TreeSet();
        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            Integer liczba = (Integer)iterator.next();
            Iterator iterator1 = set.iterator();

            while(iterator1.hasNext()) {
                Numbers para = (Numbers)iterator1.next();
                if (liczba == para.getValue()) {
                    para.setCount(para.getCount() + 1);
                }
            }

            set.add(new Numbers(liczba, 1));
        }

        iterator = set.iterator();

        while(iterator.hasNext()) {
            Numbers n = (Numbers)iterator.next();
            System.out.println (n.getValue () + " ilość wysto,pień to " + n.getCount ());
        }

    }
}