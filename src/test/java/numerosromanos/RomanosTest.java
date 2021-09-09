package numerosromanos;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanosTest {
  @Test
  public void test() {
    assertEquals("I", Romanos.convertir(1));
    assertEquals("II", Romanos.convertir(2));
    assertEquals("III", Romanos.convertir(3));
    assertEquals("IV", Romanos.convertir(4));
    assertEquals("V", Romanos.convertir(5));
    assertEquals("VI", Romanos.convertir(6));
    assertEquals("VII", Romanos.convertir(7));
    assertEquals("VIII", Romanos.convertir(8));
    assertEquals("IX", Romanos.convertir(9));
    assertEquals("X", Romanos.convertir(10));
    assertEquals("XV", Romanos.convertir(15));
    assertEquals("XXV", Romanos.convertir(25));
    assertEquals("MMMCMXCIX", Romanos.convertir(3999));
  }
}