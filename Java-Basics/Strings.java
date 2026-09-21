public class Strings {
    public static void main(String[] args) {

        String name = "Diwakar Sharma";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First character: " + name.charAt(0));

        if (name.contains("Sharma")) {
            System.out.println("Name contains Sharma");
        }
    }
}
