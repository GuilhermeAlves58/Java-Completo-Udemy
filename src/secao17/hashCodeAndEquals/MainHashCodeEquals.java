package secao17.hashCodeAndEquals;

public class MainHashCodeEquals {
    public static void main(String[] args) {
        ClientHashCodeAndEquals c1 = new ClientHashCodeAndEquals("Abgail", "Abigail@gmail.com");
        ClientHashCodeAndEquals c2 = new ClientHashCodeAndEquals("Abgail", "Valdemar@gmail.com");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
