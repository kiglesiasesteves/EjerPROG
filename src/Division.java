public class Division {
    public void Division(float dato1, float dato2) {
        try {
            float resultado = (dato1 / dato2);

        } catch (ArithmeticException e) {
            // Capturar la excepción si ocurre una división por cero u otro error aritmético
            System.err.println("Error aritmético: " + e.getMessage());
        } catch (Exception e) {
            // Capturar cualquier otra excepción que pueda ocurrir durante la división
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }

}
