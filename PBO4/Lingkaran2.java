package PBO4;

public class Lingkaran2 {
    //3 variable ini 
    public static void main (String [] args) {
    LingkaranBase l1 = new LingkaranBase(5);
    LingkaranBase l2 = l1;
    LingkaranBase l3 = new LingkaranBase (7);
    System.out.println(l1.getJari2());
    System.out.println(l2.getJari2());
    System.out.println(l3.getJari2());
    l2 = l3;
    System.out.println(l1.getJari2());
    System.out.println(l2.getJari2());
    System.out.println(l3.getJari2());

    
    
    }
}