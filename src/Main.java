import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

	/* 4 laboratorinis darbas. Objektinis programavimas. Klasės
        //
        //Gynimas
        //
        //1. Sukurti klasę Automobilis, panaudojant tinkamiausius duomenų tipus:
        //- markė;
        //- modelis;
        //- spalva;
        //- pagaminimo metai;
        //- durų skaičius;
        //- rida;
        //- elektramobilis. // (true, false)
        //2. Sukurti get'erius, set'erius ir konstruktorių.
        //3. Sukurti 5 klasės objektus (skirtingus).
        //4. Pakeisti kiekvieno objekto bent po 1 požymį.
        //5. Atspausdinti objektus prieš ir po pakeitimų.
        //
        //REKOMENDACIJA:
        //kurti naują projektą.*/

         Automobilis hondaCivic = arrayListToCar(readingValueFromFile("auto1.txt"));
         Automobilis audi100 = arrayListToCar(readingValueFromFile("auto2.txt"));
         Automobilis hyundai20 = arrayListToCar(readingValueFromFile("auto3.txt"));
         Automobilis yaris = arrayListToCar(readingValueFromFile("auto4.txt"));
         Automobilis octavia = arrayListToCar(readingValueFromFile("auto5.txt"));

        System.out.println(octavia.isElektromobilis());


        atspausdintiAutomobiliuSarasoAntraste();
        atspausdintiAutomobiliuSarasa(
                pridetiAutomobilisISarasa(hondaCivic, audi100, hyundai20, yaris, octavia));
        atspausdintiAutomobiliuSarasoPoraste();
    }

    public static ArrayList<Object> readingValueFromFile(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        ArrayList<Object> arrayFromFile = new ArrayList<Object>();
        int i = 0;
        while (scanner.hasNext() || scanner.hasNextBoolean() || scanner.hasNextInt()) {
            if (scanner.hasNext()) {
                arrayFromFile.add(scanner.next());
                i++;
            } else if (scanner.hasNextInt()) {
                arrayFromFile.add(scanner.nextInt());
                i++;
            } else if (scanner.hasNextBoolean()) {
                arrayFromFile.add(scanner.nextBoolean());
            }
        }
        return arrayFromFile;
    }

    public static void printArrayList(ArrayList<Object> arrayFromFile) {
        // Print the name from the list....
        arrayFromFile.forEach(System.out::println);
    }

    public static Automobilis arrayListToCar(ArrayList <Object> arrayList) {
                Automobilis car = new Automobilis(
                        String.valueOf(arrayList.get(0)),
                        String.valueOf(arrayList.get(1)),
                        String.valueOf(arrayList.get(2)),
                        Integer.valueOf(String.valueOf(arrayList.get(3))),
                        Integer.valueOf(String.valueOf(arrayList.get(4))),
                        Integer.valueOf(String.valueOf(arrayList.get(5))),
                        Boolean.valueOf(String.valueOf(arrayList.get(6)))
                );
        return car;
    }

    public static ArrayList<Automobilis> pridetiAutomobilisISarasa(Automobilis... automobilis) {
        ArrayList<Automobilis> automobiliuSarasas = new ArrayList<Automobilis>();
        for (int i = 0; i < automobilis.length; i++) {
            automobiliuSarasas.add(automobilis[i]);
        }
        return automobiliuSarasas;
    }

    public static void atspausdintiAutomobiliuSarasa(ArrayList<Automobilis> automobilis) {
        for (int i = 0; i < automobilis.size(); i++) {
            System.out.printf("%-4s%-15s%-15s%-15s%-20s%-20s%-10s%-15s\n",
                    i + 1,
                    automobilis.get(i).getMarke(),
                    automobilis.get(i).getModelis(),
                    automobilis.get(i).getSpalva(),
                    automobilis.get(i).getPagaminimoMetai(),
                    automobilis.get(i).getDuruSkaicius(),
                    automobilis.get(i).getRida(),
                    automobilis.get(i).isElektromobilis()
            );
        }
    }

    public static void atspausdintiAutomobiliuSarasoAntraste() {
        System.out.printf("%-4s%-15s%-15s%-15s%-20s%-20s%-10s%-25s\n",
                "Nr.",
                "Marke ",
                "Modelis ",
                "Spalva ",
                "Pagaminimo metai ",
                "Duru skaicius",
                "Rida",
                "Varomas elektra "
        );
        for (int i = 0; i < 110; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void atspausdintiAutomobiliuSarasoPoraste() {
        for (int i = 0; i < 110; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
