public class str_operator {
    public static void main(String[] args) {
        String a = "Helloworld";

        String part = a.substring(0,6);//substring
        System.out.println(part);

        char ch = a.charAt(7);
        System.out.println(ch);

        int id = a.indexOf('w');
        System.out.println(id);

        String b = a.replace('o','r');
        System.out.println(b);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);

    }
}
