package Basic;

public class javaStringMethods {
    public static void main(String[] args) {
        String name = "Priyam";
        String line = "       This is a line       ";
        System.out.println(name);//print name and then goes to new line
        System.out.print(name + '\n');//just print the name
        System.out.printf("my name is %s", name);//or use  System.out.format()
        //%is a format specifier; %s is for string,%d=int,%c=char,%f=float;
        System.out.println();
        System.out.println(name.length());//gives string length
        System.out.println(name.toLowerCase());//converts to lower case
        System.out.println(name.toUpperCase());//converts to uppercase
        System.out.println(line.trim());//remove before and after leading space from string
        System.out.println(name.substring(2));//print string from given start to end of string
        System.out.println(name.substring(2, 4));//print string from given start to given end of string
        System.out.println(name.replace('m', 'r'));//replace old char to new char in given string
        System.out.println(name.startsWith("Pr"));//checks if string starts whith given char(case sensetive)
        System.out.println(name.endsWith("am"));//checks if string ends whith given char(case sensetive)
        System.out.println(name.indexOf("iy"));//return index of given string, first appeared , otherwise gives -1
        System.out.println(name.charAt(1));//return the char at given index otherwise error
        System.out.println(name.indexOf('m',3));//return index of given string start seacching from given index, first appeared , otherwise gives -1
        System.out.println(name.lastIndexOf('P'));//same as .indexOf but start searching backword in string
        System.out.println(name.lastIndexOf('i',5));//same as .indexOf but start searching backwords from given index no. in string
        System.out.println(name.equals("Priyam"));//return true if given str is same as decleared str(case sescetive)
        System.out.println(name.equalsIgnoreCase("priyam"));//work same as .equal() but ignore spaces

        String na = "123";
        int bc = 124;
        System.out.println(Integer.parseInt(na));//convert string inside integert to integer
        System.out.println(Integer.toString(bc));// convert integer to string
    }
}
