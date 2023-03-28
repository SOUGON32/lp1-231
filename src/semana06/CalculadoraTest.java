package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class CalculadoraTest {
    @Test
    public void somaDoisNumeroPositivos() {
        // AAA
        // Arrange
      double n1 = 10.0;
      double n2 = 2.0;
        // Act
      double soma = Calculadora.somar(n1, n2);
        // Assert
        assertEquals(12.0, soma);
    }

    @Test
    public void somaDoisNumeroPositivosEUmNegativo() {
        // AAA
        // Arrange
      double n1 = 10.0;
      double n2 = -2.0;
        // Act
      double soma = Calculadora.somar(n1, n2);
        // Assert
        assertEquals(8.0, soma);
    }

    @Test
    public void somaDoisNumerosNegativos() {
        // AAA
        // Arrange
      double n1 = -10.0;
      double n2 = -2.0;
        // Act
      double soma = Calculadora.somar(n1, n2);
        // Assert
        assertEquals(-12.0, soma);
    }
    @Test
    public void somaDoisNumerosNegativos() {
        // AAA
        // Arrange
      double n1 = -10.0;
      double n2 = -2.0;
        // Act
      double soma = Calculadora.somar(n1, n2);
        // Assert
        assertEquals(-12.0, soma);
    }
    @Test
    public void multilicaDoisNumeros() {
        // AAA
        // Arrange
      double n1 = 10.0;
      double n2 = 2.0;
        // Act
      double multi = Calculadora.multiplicar(n1, n2);
        // Assert
        assertEquals(20.0, multi);
     
    

  
    }

}
