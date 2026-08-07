public class p2 {
    public static void main(String[] args) {
        String[] names = { "Mohan", "Sohan", "john", "rohan" }; // names is array

        for (int i = 0; i <= names.length - 1; i++) { // array = length variable
            System.out.println("length of " + (i + 1) + " is: " + names[i].length()); // string = length() method
        }
        System.out.println("-------------");
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i] + " starts with " + names[i].charAt(0));
        }
        System.out.println("-------------");
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i] + " ends with " + names[i].charAt(names[i].length() - 1));
        }
        System.out.println("-------------");
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i].toUpperCase());
        }
        System.out.println("-------------");
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i].toLowerCase());
        }
        System.out.println("-------------");
    }
}
