package ar.com.mercadolibre.tragamonedasTest;

import ar.com.mercadolibre.tragamonedas.Tambor;
import ar.com.mercadolibre.tragamonedas.Tragamonedas;
import ar.com.mercadolibre.tragamonedasFakes.Tambor1Fake;
import ar.com.mercadolibre.tragamonedasFakes.Tambor2Fake;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TragamonedasTest {

    @Test
    public void crearTragamoneda(){
        Tragamonedas tragamonedas = new Tragamonedas(3);
        Assertions.assertThat(tragamonedas.getTambores().size()).isEqualTo(3);
    }

    @Test
    public void jugarEsperandoGanar(){
        List<Tambor> tambores1Fake = new ArrayList();
        Tambor1Fake tambor11 = new Tambor1Fake();
        Tambor1Fake tambor12 = new Tambor1Fake();
        Tambor1Fake tambor13 = new Tambor1Fake();
        tambores1Fake.add(tambor11);
        tambores1Fake.add(tambor12);
        tambores1Fake.add(tambor13);
        Tragamonedas tragamonedasFake = new Tragamonedas(tambores1Fake);

        Assertions.assertThat(tragamonedasFake.jugar()).isTrue();

    }

    @Test
    public void jugarEsperandoPerder(){
        List<Tambor> tambores1Fake = new ArrayList();
        Tambor1Fake tambor11 = new Tambor1Fake();
        Tambor1Fake tambor12 = new Tambor1Fake();
        Tambor2Fake tambor13 = new Tambor2Fake();
        tambores1Fake.add(tambor11);
        tambores1Fake.add(tambor12);
        tambores1Fake.add(tambor13);
        Tragamonedas tragamonedasFake = new Tragamonedas(tambores1Fake);

        Assertions.assertThat(tragamonedasFake.jugar()).isFalse();

    }

}

