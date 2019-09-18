import java.util.Scanner;

public class dna
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        String str = new String();
        String dna = new String();

        System.out.println("Input first nucleotide");
        str = scan.nextLine();

        if (str.equals ("q")) {
            dna = dna + str;
            System.out.println("DNA sequence comlete");
        } else if (str.equals("a")|| str.equals("t") || str.equals("c")|| str.equals("g")) {
            dna = dna + str;
            System.out.println("Input nucleotide or press q when done");
            str = scan.nextLine();
        } else {
            System.out.println("Please input correct value.");
            System.out.println("Input nucleotide");
            str = scan.nextLine();
        }

        int x = 1;
        String a = new String();
        String newdna = new String();
        int adna = 0;
        int tdna = 0;
        int cdna = 0;
        int gdna = 0;

        while (substring.dna(x) != q){
            a = scan.nextLine(substring.dna(x));
            if (a.equals ("a")) {
                newdna = newdna + "t";
                tdna = tdna + 1;      
            } else if (a.equals  ("t")) {
                newdna = newdna + "a";
                adna = adna + 1;
            } else if (a.equals ("c")) {
                newdna = newdna + "g";
                gdna = gdna + 1;
            } else if (a.equals ("g")) {
                newdna = newdna + "c";
                cdna = cdna + 1;
            }
            x = x + 1;
        }

        System.out.println("New DNA sequence complete.");
        Systme.out.println(newdna);

        if (cdna || gdna || adna || tdna >= (adna + tdna + gdna + cdna) * 0.4) {
            System.out.println("Risk for Cancer.");
        }
    }
}