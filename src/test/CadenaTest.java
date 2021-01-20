package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.*;

class CadenaTest {
    @Test
    @DisplayName("Test 1 del primer metodo: Si es multiplo de 3")
    void testPrimerMetodo1() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(6);
       // 3 - Aserciones
       assertEquals( "Face", result, "Face");
    }

    @Test
    @DisplayName("Test 2 del primer metodo: Si es multiplo de 5")
    void testPrimerMetodo2() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(10);
       // 3 - Aserciones
       assertEquals( "Book", result, "Book");
    }

    @Test
    @DisplayName("Test 3 del primer metodo: Si es multiplo de 15")
    void testPrimerMetodo3() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(30);
       // 3 - Aserciones
       assertEquals( "Facebook", result, "Facebook");
    }

    @Test
    @DisplayName("Test 4 del primer metodo: no es múltiplo de ninguno")
    void testPrimerMetodo4() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(37);
       // 3 - Aserciones
       assertEquals( "37", result, "37");
    }

    @Test
    @DisplayName("Test 1 del segundo metodo: Si los números son 1 2 y 3")
    void testPrimeroMetodo2() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       int[] valores={1,2,3};
       String result2 = resultado.cadena2(valores);
       // 3 - Aserciones
       assertEquals( "1 2 Face", result2, "1 2 Face");
    }
    @Test
    @DisplayName("Test 2 del segundo metodo: Si los números son 6,10,30")
    void testSegundoMetodo2() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       int[] valores={6,10,30};
       String result2 = resultado.cadena2(valores);
       // 3 - Aserciones
       assertEquals( "Face Book Facebook", result2, "Face Book Facebook");
    }
    @Test
    @DisplayName("Test 3 del segundo metodo: Si los números son 4,6,84,6,8")
    void testTerceroMetodo2() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       int[] valores={4,6,8};
       String result2 = resultado.cadena2(valores);
       // 3 - Aserciones
       assertEquals( "4 6 8", result2, "4 6 8");
    }

}
