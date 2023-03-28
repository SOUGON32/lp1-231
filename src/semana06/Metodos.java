package semana06;

public class Metodos {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        imprimirPalavra("olá mundo");
        imprimirPalavra("hello world");
        
        double soma = Calculadora.somar(10.0, 2.0);
        System.out.println(soma);
        System.out.println(Calculadora.somar(3.3, 4.1));

     }
    

     // metodo que soma dois numeros e retorna o resultado
 
      

     
    //Assinatura do método
    //public - acesso em qualquer parte do projeto
    // static- método atrelado a classe (não precisa criar um objeto)
    // void - tipo de retorno (sem retorno)
    //ImprimirPalavra - nome do método
    // String palavra - parâmetro (pode ter zero ou muitos)
    // definindo o método

    public static void imprimirPalavra(String palavra){
        System.out.println(palavra.toUpperCase());
    }
}
