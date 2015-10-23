package br.ufg.inf.es.construcao.somanaturais;

/**
 *
 * @author alunoinf
 */
public class SomaNaturais {
    
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Numero ilegal. O 'n' deve ser maior que zero.");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i++;
        }

        return s;
    }
}
