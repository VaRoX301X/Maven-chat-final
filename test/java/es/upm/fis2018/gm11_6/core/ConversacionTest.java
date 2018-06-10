package es.upm.fis2018.gm11_6.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConversacionTest {

    @Before
    public void setUp() throws Exception {
        Usuario receptor = new Usuario("receptor","prueba", "prb", "prb1@upm.es", "1234", 1);
        ArrayList<Mensaje> listaMensajes = new ArrayList<Mensaje>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mostrarMensajes() {
    }

    @Test
    public void anyadirMensaje() {
    }

    @Test
    public void borrarMensaje() {
    }

    @Test
    public void getIdConversacion() {
    }

    @Test
    public void setIdConversacion() {
    }

    @Test
    public void getListaMensajes() {
    }

    @Test
    public void setListaMensajes() {
    }

    @Test
    public void getReceptor() {
    }

    @Test
    public void setReceptor() {
    }

    @Test
    public void getEmisor() {
    }

    @Test
    public void setEmisor() {
    }
}