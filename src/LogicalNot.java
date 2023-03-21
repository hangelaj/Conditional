public class LogicalNot {
    public static void main(String[] args) {
        System.out.println("Is the string equal to 'Jemal'? ");
        String text = "Hangela";
        if (!(text.equals("Jemal"))) {// true
            System.out.println("No!");
        } else {
            System.out.println("Yes");
        }
    }
}

