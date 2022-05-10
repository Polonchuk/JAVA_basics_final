package lesson8dataprocess.task12;

public class ILikeJava {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        System.out.println("Строка \"" + str + "\" содержит \"Java\": " + str.contains("Java"));
        System.out.println("Строка \"" + str + "\" начинается с \"I like\": " + str.startsWith("I like"));
        System.out.println("Строка \"" + str + "\" заканчивается тремя восклицательными знаками: " + str.endsWith("!!!"));
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }
        str = str.replace('a','o');
        System.out.println(str.substring(7,11));
    }
}
