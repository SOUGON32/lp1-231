package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
    @Test
    public void testeACIMA() {
        Pessoa p1 = new Pessoa();
        p1.altura = 165.0;
        p1.peso = 85.0;
        p1.calcularIMC();

        assertEquals(0.0031221303948576677, p1.IMC, 0.01); 
        assertEquals("acima do peso", p1.faixa());
        assertEquals("PERDER", p1.situacao());
    }

    @Test
    public void testeNORMAL() {
        Pessoa p1 = new Pessoa();
        p1.altura = 165.0;
        p1.peso = 75.0;
        p1.calcularIMC(); 
        assertEquals([0.0027548209366391185, p1.IMC, 0.01); 
        assertEquals("no peso ideal", p1.faixa());
        assertEquals("NORMAL", p1.situacao());
    }
    
    @Test
    public void testeABAIXO() {
        Pessoa p1 = new Pessoa();
        p1.altura = 165.0;
        p1.peso = 44.0;
        p1.calcularIMC();

        assertEquals(0.0016161616161616162, p1.IMC, 0.01);
        assertEquals("abaixo do peso", p1.faixa());
        assertEquals("GANHAR", p1.situacao());
    }
}
