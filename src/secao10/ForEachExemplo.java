package secao10;

public class ForEachExemplo {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");

        for (String obj: vect) {
            System.out.println(obj);
        }
    }
}
