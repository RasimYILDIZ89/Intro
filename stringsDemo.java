//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class stringsDemo {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);
       /* System.out.println("Eleman Sayısı= " +message.length());
        System.out.println("5.Eleman= " +message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        String message2=message.concat(" Yaşasın!");
        System.out.println(message2);
        System.out.println(message.startsWith("b"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.indexOf("çok"));
        System.out.println(message.lastIndexOf("e"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.lastIndexOf("üz"));*/
        System.out.println(message.replace(" ","-"));
        String message3=message.replace(" ","-");
        System.out.println(message3);
        System.out.println(message.substring(2,4));
        System.out.println(message.substring(2));
        for (String word:message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}