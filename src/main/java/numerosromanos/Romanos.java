package numerosromanos;

public class Romanos {

  public static String convertir(int n) {
    int[] arabigos = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    for (int i = 0; i < arabigos.length; i++) {
      if (n >= arabigos[i]){
        return romanos[i] + convertir(n - arabigos[i]);
      }
    }

    return "";
  }
}
