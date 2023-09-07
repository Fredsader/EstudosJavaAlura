import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
//import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Into The Wild");
        meuFilme.setAnoDeLancamento(2008);
        meuFilme.setDuracaoEmMinutos(150);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7.5);

        System.out.println("Avaliação: " + meuFilme.obterMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento("2000");
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
    }
}