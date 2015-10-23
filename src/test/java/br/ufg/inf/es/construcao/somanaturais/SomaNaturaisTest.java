package br.ufg.inf.es.construcao.somanaturais;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alunoinf
 */
public class SomaNaturaisTest {
    
    public SomaNaturaisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Teste para verificar o tratamento de numeros ilegais.
     * O esperado é IllegalArgumentException para inteiros menores que 1.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroIlegal() {
        SomaNaturais.somaNaturais(0);
    }
    
    /**
     * Teste do metodo somaNaturais, da classe SomaNaturais.
     */
    @Test
    public void testSomaNaturais() {
        System.out.println("somaNaturais");
        int n = 2;
        int expResult = 3;
        int result = SomaNaturais.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
}
