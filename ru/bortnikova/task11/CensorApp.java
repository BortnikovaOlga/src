package ru.bortnikova.task11;
// цензура на слово "бяка"

public class CensorApp {
    public static void main(String[] args) {

        String myStr = "Вот текст про дом, который построил БяКа , " +
                "а вот та самая БЯка синица, которая тырит в том доме пшеницу";

        System.out.println(Censor.replWord(myStr, "БЯКА"));

        String myStr2 = "бЯКа";

        System.out.printf(Censor.replWord(myStr2, "БякА"));

    }
}

class Censor {

    // меняет в строке слово, передаваемое вторым параметром, на CENSOR!
    public static String replWord(String inStr, String replWord) {

        String st1 = inStr.toLowerCase();
        String rw = replWord.toLowerCase();

        StringBuilder st2 = new StringBuilder("");
        int ind1 = 0, ind2;

        ind2 = st1.indexOf(rw, ind1);
        while (ind2 != -1) {
            st2.append(inStr.substring(ind1, ind2));
            st2.append("CENSOR !!!");
            ind1 = ind2 + rw.length();
            ind2 = st1.indexOf(rw, ind1);
        }
        st2.append(inStr.substring(ind1));
        return st2.toString();
    }

}


