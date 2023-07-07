package pluviometros;

import java.util.HashSet;
import java.util.Set;

public class CaminhaoBeta extends Caminhao {
    private Set<String> tiposPluviometro;

    public CaminhaoBeta() {
        super(Integer.MAX_VALUE); // Capacidade máxima infinita do caminhão Beta
        this.tiposPluviometro = new HashSet<>();
    }

    @Override
    public void inserePluviometro(Pluviometro pluviometro) {
        String tipoPluviometro = pluviometro.getTipo();
        if (!tiposPluviometro.contains(tipoPluviometro)) {
            tiposPluviometro.add(tipoPluviometro);
            System.out.println("Pluviômetro inserido no caminhão Beta.");
        } else {
            System.out.println("O caminhão Beta já possui um pluviômetro do tipo " + tipoPluviometro + ".");
        }
    }
}