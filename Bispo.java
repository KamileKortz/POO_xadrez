public class Bispo extends Peca {

    public Bispo(String cor, Posicao posicaoInicial) {
        super(cor, posicaoInicial);
    }

    public void mover(Posicao destino) {
        System.out.println("O Bispo " + cor + " andou para a linha " + destino.linha + ", coluna " + destino.coluna);
        this.posicaoAtual = destino;
    }
}