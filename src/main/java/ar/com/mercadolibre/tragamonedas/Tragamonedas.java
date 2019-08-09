package ar.com.mercadolibre.tragamonedas;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Tragamonedas {

    private List<Tambor> tambores;

    public Tragamonedas(Integer cantTambores){
        this.tambores = new ArrayList<Tambor>();
        for(Integer i = 0; i < cantTambores; i++){
            Tambor tambor = new Tambor();
            tambores.add(tambor);
        }
    }

    public Tragamonedas(List<Tambor> tambores){
        this.tambores = tambores;
    }

    public List<Tambor> getTambores(){
        return this.tambores;
    }

    public Boolean jugar(){
        List<Integer> resultados = bajarPalanca();
        return resultados.get(0).equals(resultados.get(1)) && resultados.get(0).equals(resultados.get(2));
    }
    
    public List<Integer> bajarPalanca(){
        List<Integer> resultados = new ArrayList<>();
        for (Tambor tambor : this.tambores) {
            tambor.girar();
            resultados.add(tambor.obtenerPosicion());
        }
        return resultados;
    }
    
}
