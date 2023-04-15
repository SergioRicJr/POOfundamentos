package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevFront extends Dev{
    private List<String> experiencias;

    public DevFront() {
        this.experiencias = new ArrayList<>(Arrays.asList("Desenvolvimento web", "WebDesign", "Acessibilidade web"));
    }

    public List<String> getExperiencias() {
        return experiencias;
    }
}
