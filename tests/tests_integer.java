import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTest {

    // Caso de Prueba 1: Valor Entero Válido
    @Test
    public void testIsIntegerValid() {
        String value = "42";
        boolean result = isInteger(value);
        Assert.assertTrue(result);
    }

    // Caso de Prueba 2: Valor No Entero
    @Test
    public void testIsIntegerInvalid() {
        String value = "3.14"; // Un número decimal
        boolean result = isInteger(value);
        Assert.assertFalse(result);
    }

    // Función que verifica si un valor es un número entero.
    public boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
