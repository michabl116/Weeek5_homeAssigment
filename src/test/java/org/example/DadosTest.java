package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DadosTest {

    @Test
    public void testRollGeneratesValidValues() {
        Dados dados = new Dados();
        dados.roll();
        assertTrue(dados.getDie1() >= 1 && dados.getDie1() <= 6);
        assertTrue(dados.getDie2() >= 1 && dados.getDie2() <= 6);
    }

    @Test
    public void testIsDoubleTrue() {
        Dados dados = new Dados();

        dados.roll();
        int value = dados.getDie1();
        dados.roll();
        dados.roll();
        dados.roll();
    }

    @Test
    public void testRollUntilDoubleEventuallySucceeds() {
        Dados dados = new Dados();
        int attempts = dados.rollUntilDouble();
        assertTrue(attempts >= 1);
    }
}