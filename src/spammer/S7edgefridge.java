package spammer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class S7edgefridge {
    public static void cagırım(String agız, int beyin) throws IOException {
        System.out.println("Text dosyasını nereye oluşturulsun?");
        Scanner al = new Scanner(System.in,"ISO-8859-9");
        String anen= al.nextLine();
        String yerim = anen.replace("\\", "\\\\");
        FileWriter yazıcı = new FileWriter(new File (yerim,"As Your Wish Sir.txt"));
        for (int i = 0; i < beyin; i++) {
            yazıcı.write(agız);
            int a=0;
               while
        (a<=agız.length()){
    yazıcı.write(agız);
    a++;}}
yazıcı.close();
    }
    public static void main(String[] args) throws IOException {
        System.out.println(" this is a project about a spam maker. basicly this does  gives you random amount of what you write  here. For usage of this program  idk some cokain farm i guess. enter your shit here");
        Scanner n = new Scanner(System.in);
        String soyle = n.nextLine();
        double lkq = Math.random();
        double x2x = lkq * 5000;
        cagırım(soyle, (int) x2x);}}