public class Main {
    public static void main(String[] args) {

        Posicao lugarDoCavalo = new Posicao(1, 2);
        Cavalo meuCavalo = new Cavalo("Branco", lugarDoCavalo);

        Posicao lugarDoBispo = new Posicao(5, 5);
        Bispo meuBispo = new Bispo("Preto", lugarDoBispo);

        Posicao novoLugarCavalo = new Posicao(3, 3);
        meuCavalo.mover(novoLugarCavalo);

        System.out.println();

        Posicao novoLugarBispo = new Posicao(7, 7);
        meuBispo.mover(novoLugarBispo);
    }
}