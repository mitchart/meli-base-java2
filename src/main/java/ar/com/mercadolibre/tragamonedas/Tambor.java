package ar.com.mercadolibre.tragamonedas;

import java.util.Random;

public class Tambor {

    public Integer posicion = 1;

    public Tambor(){
        girar();
        this.posicion = obtenerPosicion();
    }

    public void girar(){
        Random r = new Random();
        this.posicion = r.nextInt(8) + 1;
    }

    public Integer obtenerPosicion(){
        return this.posicion;
    }
}
