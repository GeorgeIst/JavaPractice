package project.testFormaGeometrica;

import org.junit.Test;

public class MagazinDeVopseaTest {

    @Test
    public void cantitateTotalaDeVopsea() {

        FormaGeometrica cerc = new Cerc(12);
        FormaGeometrica dreptunghi = new Dreptunghi(3, 4);
        FormaGeometrica patrat = new Patrat(15,15);
        FormaGeometrica triunghi = new Triunghi(1,2,3);

        FormaGeometrica [] lista = {cerc, dreptunghi, patrat, triunghi};
        MagazinDeVopsea magazin = new MagazinDeVopsea();
        System.out.println(magazin.cantitateTotalaDeVopsea(lista));
    }
}