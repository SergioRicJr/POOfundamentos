package dominio;

import java.util.ArrayList;
import java.util.List;

public class Site {
    public List<Bootcamp> listaBootcamps;
    public List<Dev> listaDevsCadastrados;

    public Site() {
        this.listaBootcamps = new ArrayList<>();
        this.listaDevsCadastrados = new ArrayList<>();
    }

    public void adicionarBootcamp(Bootcamp bootcamp) {
        listaBootcamps.add(bootcamp);
        System.out.println("Bootcamp adicionado com sucesso");
    }

    public void adicionarDev(Dev dev) {
        listaDevsCadastrados.add(dev);
        System.out.println("Dev adicionado com sucesso");
    }
}
