package es.upm.fis2018.gm11_6.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class GrupoTest {


    static void setUpBeforeClass() throws Exception {
    }


    static void tearDownAfterClass() throws Exception {
    }


    void setUp() throws Exception {
    }


    void tearDown() throws Exception {
    }

    @Test
    void test() {
        fail("Not yet implemented");
    }
    @Test
    void testAddMiembro() {
        Usuario u0 = new Usuario("Jaime","apellido","Jaimito","jaime@upm.es","1234",0);
        Usuario u1 = new Usuario("Raul","apellido","Rulo","raul@upm.es","1234",1);
        Usuario u2 = new Usuario("Rick","Sanchez","Morty","rick@upm.es","1234",2);
        Grupo testGrupo = new Grupo(u0, "0001");
        assertTrue (testGrupo.addMiembro(u1));
        assertTrue (testGrupo.addMiembro(u2));
        assertFalse(testGrupo.addMiembro(u0));
    }
    @Test
    void testBorrarMiembro() {
        Usuario u0 = new Usuario("Jaime","apellido","Jaimito","jaime@upm.es","1234",0);
        Usuario u1 = new Usuario("Raul","apellido","Rulo","raul@upm.es","1234",1);
        Usuario u2 = new Usuario("Rick","Sanchez","Morty","rick@upm.es","1234",2);
        Grupo testGrupo = new Grupo(u0, "0001");
        assertTrue (testGrupo.addMiembro(u1));
        assertTrue (testGrupo.addMiembro(u2));
        assertTrue (testGrupo.borrarMiembro(u1));
        assertTrue (testGrupo.borrarMiembro(u2));
        assertFalse(testGrupo.borrarMiembro(u2));
    }

}