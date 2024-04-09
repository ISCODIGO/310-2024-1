package pila;

public class Parentesis {
    public static boolean probar(String frase) {
        Stack<Character> pila = new StackList<>(frase.length());
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (caracter != '(' && caracter != ')')
                continue;

            if (caracter == '(') pila.push(caracter);
            if (caracter == ')') {
                if (pila.isEmpty()) return false;
                pila.pop();
            }

        }
        if (!pila.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = ")(";
        System.out.println(probar(s));
    }
}
