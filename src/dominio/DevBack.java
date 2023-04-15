package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevBack extends Dev{
    private List<String> experiencias;

    public DevBack() {
        this.experiencias = new ArrayList<>(Arrays.asList("Linux", "Java para desktop", "Estrutura de dados"));
    }

    public List<String> getExperiencias() {
        return experiencias;
    }
}
