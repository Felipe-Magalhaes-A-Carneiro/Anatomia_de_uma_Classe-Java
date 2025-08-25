public class MinhaClasse { // Nota: Nome da classe deve ser o mesmo do arquivo e em maiúsculo.
    // Nota 02: o código Java é case-sensitive, ou seja, diferencia maiúsculas de minúsculas.
    // Toda aplicação Java deve ter um método main.

    //o método main é o ponto de entrada do programa, é aconselhado que ele esteja dentro de uma classe apenas uma vez. Fazendo com que essa classe escolhida seja chamada de 'Classe Executável'.
    
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        String primeiroNome = "Felipe";
        String segundoNome = "Magalhães";

        //Curiosidade:
        //         variavel nomeCompleto recebe o 'chamado' (termo usado para quando usamos um método anteriormente declarado) do método nomeCompleto
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Criando um método:
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // return é o tipo de retorno do método, ou seja, o que ele vai devolver.
        return "Resultado do método: " + 
        primeiroNome.concat(" ").concat(segundoNome);
        // return é um comando que finaliza a execução do método, ou seja, tudo que estiver depois do return não será executado.
    }
    
}