import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConversacionTest {

    Conversacion conversacion;
    ArrayList<Mensaje> listaMensajes = new ArrayList<Mensaje>();
    Usuario receptor;
    Usuario emisor;
    Mensaje mensaje;

    @Before
    public void setUp(){
        receptor = new Usuario ("nombre1","apellido1","alias","correo","pass",1);
        emisor = new Usuario ("nombre2","apellido2","alias2","correo2","pass2",2);
        conversacion = new Conversacion(1,emisor,receptor);
        mensaje = new Mensaje("Prueba",emisor);
        listaMensajes.add(mensaje);
        conversacion.setListaMensajes(listaMensajes);

    }
    @Test
    public void testMostrarMensajes() throws Exception {
        for (int i = 0; i < this.listaMensajes.size(); i++) {
            assertEquals("[0]" + "(" + this.listaMensajes.get(i).getCreationDate().toString() + ") NOMBRE2: 'Prueba'" ,
                    "[" + i + "]" + "(" + this.listaMensajes.get(i).getCreationDate().toString() + ") " + this.listaMensajes.get(i).getEmisor().getNombre().toUpperCase() + ": '" + this.listaMensajes.get(i).getContenido() + "'" );
        }
    }

    @Test
    public void testAnyadirMensaje() throws Exception {
        conversacion.anyadirMensaje("Prueba2",emisor);
        assertEquals("Prueba2",""+this.listaMensajes.get(1).getContenido()+"");
    }

    @Test
    public void testBorrarMensaje() throws Exception {
        if(conversacion.getListaMensajes().contains(mensaje)){
            assertEquals(true, conversacion.borrarMensaje(0,emisor));
        }else assertEquals(false,conversacion.borrarMensaje(0,emisor));
    }

    @Test
    public void testGetIdConversacion() throws Exception {
        assertEquals(1,conversacion.getIdConversacion());
    }

    @Test
    public void testSetIdConversacion() throws Exception {
        conversacion.setIdConversacion(22);
        assertEquals(22,conversacion.getIdConversacion());
    }

    @Test
    public void testgetListaMensajes() throws Exception {
        assertEquals(listaMensajes,conversacion.getListaMensajes());
    }

    @Test
    public void testSetListaMensajes() throws Exception {
        ArrayList<Mensaje> listaMensajes2 = new ArrayList<Mensaje>();
        conversacion.setListaMensajes(listaMensajes2);
        assertEquals(listaMensajes2,conversacion.getListaMensajes());
    }

    @Test
    public void testGetReceptor() throws Exception {
        assertEquals(receptor,conversacion.getReceptor());
    }

    @Test
    public void testSetReceptor() throws Exception {
        Usuario receptor2 = new Usuario ("nombre3","apellido3","alias3","correo3","pass3",3);;
        conversacion.setReceptor(receptor2);
        assertEquals(receptor2,conversacion.getReceptor());
    }

    @Test
    public void testGetEmisor() throws Exception {
        assertEquals(emisor,conversacion.getEmisor());
    }

    @Test
    public void testSetEmisor() throws Exception {
        Usuario emisor2 = new Usuario ("nombre3","apellido3","alias3","correo3","pass3",3);;
        conversacion.setEmisor(emisor2);
        assertEquals(emisor2,conversacion.getEmisor());
    }

}