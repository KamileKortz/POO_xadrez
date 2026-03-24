import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Posicao lugarDoCavalo = new Posicao(1, 2);
        Cavalo meuCavalo = new Cavalo("Branco", lugarDoCavalo);

        System.out.println("Próxima posição do Cavalo Branco");
        System.out.print("Linha: ");
        int linhaDigitada = teclado.nextInt();
        System.out.print("Coluna: ");
        int colunaDigitada = teclado.nextInt();

        Posicao destinoDoJogador = new Posicao(linhaDigitada, colunaDigitada);
        meuCavalo.mover(destinoDoJogador);
    }
}
