package Basic;

public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("priyam") ;// declaring stringbuioder class
        System.out.println(sb);
        System.out.println(sb.charAt(0));// this will give charater at index 0
        sb.setCharAt(3,'t');//this set or change the character at index given to given char
        System.out.println(sb);
        sb.insert(0, 'm');//insert the given char at given position
        System.out.println(sb);
        sb.delete(0,1);//delet from start to end, end is not inclesuve
        System.out.println(sb);
        sb.append('m');//simple add anythng
        System.out.println(sb);
        System.out.println(sb.length());//print the length of string
    }
}
