import com.ejercicio.oop.calculos.CalculadoraDeTiempo;
import com.ejercicio.oop.calculos.FiltroRecomendacion;
import com.ejercicio.oop.modelos.Episodio;
import com.ejercicio.oop.modelos.Pelicula;
import com.ejercicio.oop.modelos.Series;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Series casaDragon = new Series();
        casaDragon.setNombre("la casa del drago");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otrapeli = new Pelicula();
        otrapeli.setNombre("matriz");
        otrapeli.setFechaDeLanzamiento(1998);
        otrapeli.setDuracionEnMinutos(180);

        otrapeli.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otrapeli);
        System.out.println("tiempo necesario para ver tus titulos estas vacaciones: " + calculadora.getTiempoTotal() + " minutos");
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("la Casa del papi");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);


    }
}
