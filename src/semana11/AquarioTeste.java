package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTeste {

    @Test
    public void calculaVolume() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 30.0;
        aquario.largura = 20.0;
        aquario.altura = 20.0;

        double calcularVolume = aquario.CalcularVolume();

        assertEquals(12, calcularVolume);
    }

    @Test
    public void PotenciadoTermostato() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 30.0;
        aquario.largura = 20.0;
        aquario.altura = 20.0;
        aquario.temp_desejada = 28;
        aquario.temp_ambiente = 25;

        double calculaPotencia = aquario.PotenciadoTermostato();

        assertEquals(1.8000000000000003, calculaPotencia);
    }
    
    @Test
    public void calculaQuantidadeLitrosFiltro() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 30.0;
        aquario.largura = 20.0;
        aquario.altura = 20.0;
    
        double calculaFiltragem = aquario.CalcularVolume() * 3;
    
        assertEquals(36, calculaFiltragem);
    }
}