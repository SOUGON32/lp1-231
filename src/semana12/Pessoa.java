package semana12;

public class Pessoa {
    public double altura;
    public double peso;
    public double IMC;

    public Pessoa(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }
    public double CalcularIMC();
    IMC = peso / (altura * altura);
   return IMC;
}
    public string Faixa(){
        if (IMC < 18.5) {
            return "abaixo do peso";
        } 
        else { 
            if (IMC < 24.9) {
             return "no peso ideal";
            } 
                else {
                    return "acima do peso";
                }
        }
    }

    public String situacao() {
        if (IMC < 18.5) {
            return "GANHAR";
        } 
        else { 
            if (IMC < 24.9) {
             return "NORMAL";
            } 
                else {
                    return "PERDER";
                }
    
}
