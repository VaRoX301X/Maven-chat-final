package es.upm.fis2018.gm11_6.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class MensajeTest {
    Usuario emisor = new Usuario("emisor","prueba", "prb", "prb0@upm.es", "1234", 0);
    Date date = new Date ();
    String mensaje = "hola";
    Mensaje msg = new Mensaje(mensaje, emisor);
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCreationDate() {
        assertEquals(msg.getCreationDate(), date );
    }

    @Test
    public void getIdMensaje() {
        assertEquals(0, msg.getIdMensaje());
    }

    @Test
    public void setIdMensaje() {

    }

    @Test
    public void getContenido() {
        assertEquals(mensaje, msg.getContenido());
    }

    @Test
    public void setContenido() {

    }

    @Test
    public void getEmisor() {
        assertEquals(emisor, msg.getEmisor());

    }

    @Test
    public void setEmisor() {
    }
}