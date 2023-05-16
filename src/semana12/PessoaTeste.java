package semana12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
    @Test
    public void testeACIMA() {
        Pessoa p1 = new Pessoa(165.0, 85.0);
        double IMC = p1.calcularIMC();

        assertEquals(9.375, IMC);

    }

    @Test
    public void testeNORMAL() {
        Pessoa p1 = new Pessoa(165.0, 75.0);
        double IMC = p1.calcularIMC();

        assertEquals(31.0, IMC);

    }
    
    @Test
    public void testeABAIXO() {
        Pessoa p1 = new Pessoa(165.0, 44.0);
        double IMC = p1.calcularIMC();

        assertEquals(9.375, IMC);
    }
}