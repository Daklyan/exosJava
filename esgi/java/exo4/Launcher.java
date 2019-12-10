package esgi.java.exo4;


public class Launcher {
    public static void main(String[] args) {
        int i;
        if (args.length < 2) {
            System.err.println("Not enough arguments");
            System.exit(-1);
        }
        for (i = 0; i < args.length; ++i) {
            if (args[i].equals("/a")) {
                annagram(args[i - 1], args[i + 1]);
            } else if (args[i].equals("/o")) {
                System.out.println(delSubstring(args[i - 1], args[i + 1]));
            } else {
                verifString(args[1], args[0]);
            }
        }
    }

    public static void verifString(String str, String dict) {
        int i;
        boolean verif = true;
        for (i = 0; i < str.length(); ++i) {
            if (dict.indexOf(str.charAt(i)) == -1) {
                verif = false;
            }
        }
        if (!verif) {
            System.err.println("Non conform String");
        }
    }

    public static String shiftStringRight(int nb, String str) {
        return str.substring(str.length() - nb) + str.substring(0, str.length() - nb);
    }

    public static String shiftStringLeft(int nb, String str) {
        return str.substring(nb) + str.substring(0, nb);
    }

    public static boolean annagram(String str1, String str2) {
        return false;
    }

    public static String delSubstring(String str1, String str2) {
        return str1.replace(str2,"");
    }
}
