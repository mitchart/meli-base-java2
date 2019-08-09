package ar.com.mercadolibre.tragamonedasTest;

import ar.com.mercadolibre.tragamonedas.Tambor;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TamborTest {
    @Test
    public void crearTambor(){
        Tambor tambor = new Tambor();
        Assertions.assertThat(tambor).isNotNull();
    }

    @Test
    public void probarTambor(){
        Tambor tambor = new Tambor();
        tambor.girar();
        Integer posicion = tambor.obtenerPosicion();
        Assertions.assertThat(posicion).isBetween(1,8);
    }
}
