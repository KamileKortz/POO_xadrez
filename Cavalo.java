public class Cavalo extends Peca {

    public Cavalo(String cor, Posicao posicaoInicial) {
        super(cor, posicaoInicial);
    }

    public void mover(Posicao destino) {
        System.out.println("O Cavalo " + cor + " andou para a linha " + destino.linha + ", coluna " + destino.coluna);
        this.posicaoAtual = destino;
    }
}
