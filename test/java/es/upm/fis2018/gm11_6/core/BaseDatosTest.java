import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BaseDatosTest {
    @Test
    public void testregistrarUsuario() {
        Usuario u0 = new Usuario("Jai","ape","Jai","jai@upm.es","1234",0);
        BaseDatos bd1 = new BaseDatos();
        bd1.registrarUsuario(u0);
        assertTrue(true, bd1.registrarUsuario("Jai","ape","Jai","jai@upm.es",1234));
    }
    @Test
    public void testregistrarUsuario1()  {
        BaseDatos bd1 = new BaseDatos();
        Usuario u000 = new Usuario("Jai","ape","Jai","jai@upm.es","1234",0);
        bd1.registrarUsuario(u000);
        assertTrue(true, bd1.registrarUsuario(u000));
    }

    @Test
    public void testbuscarUsuarioPorCorreo() {
        BaseDatos bd1 = new BaseDatos();
        Usuario u0 = new Usuario("Jai","ape","Jai","jai@upm.es","1234",0);
        bd1.registrarUsuario(u0);
        assertTrue(true, bd1.buscarUsuarioPorCorreo("jai@upm.es"));
    }

    @Test
    public void testexisteCorreoUPM() {
        BaseDatos bd1 = new BaseDatos();
        Usuario u0 = new Usuario("Jai","ape","Jai","jai@upm.es","1234",0);
        BaseDatos bd1 = new BaseDatos();
        bd1.registrarUsuario(u0);
        assertTrue(true, bd1.getCorreosUPMLibres().add("correolibre1@upm.es"));
    }

    @Test
    public void testregistrarCorreo() {
        BaseDatos bd1 = new BaseDatos();
        Usuario u000 = new Usuario("Jai","ape","Jai","jai@upm.es","1234",0);
        bd1.registrarUsuario(u000);
        assertTrue(true, bd1.registrarCorreo("jai@upm.es"));

    }

    @Test
    public void testlistarBaseDatos()  {
        private ArrayList<Usuario> usuarioss = new ArrayList<Usuario>();
        BaseDatos bd1 = new BaseDatos();
        Usuario u00 = new Usuario("Jai","ape","Jai","jai@upm.es","1234",0);
        Usuario u10 = new Usuario("Ra","apell","Ru","rau@upm.es","1234",1);
        BaseDatos bd1 = new BaseDatos();
        Conversacion c0 = new Conversacion(0 ,u00, u10);
        bd1.registrarUsuario(u00);
        bd1.registrarUsuario(u10);
        assertTrue(true, usuarioss.listarBaseDatos(bd1));
    }

    @Test
    public Conversacion testencontrarConversacion(int id){
        BaseDatos bd1 = new BaseDatos();
        Usuario u12 = new Usuario("Ddraka","Noname","Dd","jaju@upm.es","1234",4);
        Usuario u13 = new Usuario("Diustdraker","Yename","DD","raru@upm.es","1234",1);
        BaseDatos bd22 = new BaseDatos();
        Conversacion c001 = new Conversacion(4 ,u12, u13);
        c001.anyadirMensaje("Que", u12);
        c001.anyadirMensaje("Qué nota en AL?", u13);
        c001.anyadirMensaje("Buah, un 1", u12);
        bd22.registrarUsuario(u00);
        assertTrue(true, bd22.4.c001);

    }


    @Test
    public void testborrarConversacion()  {
        Usuario u00 = new Usuario("Jai","ape","Jai","jai@upm.es","1234",0);
        Usuario u10 = new Usuario("Ra","apell","Ru","rau@upm.es","1234",1);
        BaseDatos bd1 = new BaseDatos();
        Conversacion c00 = new Conversacion(0 ,u00, u10);
        c00.anyadirMensaje("Que pasaaaa ", u00);
        c00.anyadirMensaje("Qué nota en FIS?", u10);
        c00.anyadirMensaje("Buah", u00);
        c00.anyadirMensaje("He sacado un 4 raspao", u10);
        c00.anyadirMensaje("cerquita cerquita!", u00);
        bd1.anyadirConversacion(c00);
        assertTrue(true, bd1.borrarConversacion(c00));
    }

    @Test
    public void testgetNumeroConversaciones() throws Exception {
    }

    @Test
    public void testsetNumeroConversaciones() throws Exception {
    }

    @Test
    public void testgetConversaciones() throws Exception {
    }

    @Test
    public void testsetConversaciones() throws Exception {
    }

    @Test
    public void testgetUsuarios() throws Exception {
    }

    @Test
    public void testsetUsuarios()  {
    }

    @Test
    public void testgetNumeroUsuarios()  {
        int numeroUsuarios=0;
        assertTrue (numeroUsuarios== 1);
    }

    @Test
    public void testsetNumeroUsuarios() {
        int numeroUsuarios=0;
        assertTrue (numeroUsuarios== 1);
    }

    @Test
    public void testgetCorreosUPM()  {
        String correo = new String;
        assertTrue (correo== "hola@upm.es");
    }

    @Test
    public void testsetCorreosUPM()  {
        String correo = new String;
        assertTrue (correo== "hola@upm.es");
    }

    @Test
    public void testgetCorreosUPMLibres() {
        String correo = new String;
        assertTrue (correo== "hola@upm.es");
    }

    @Test
    public void testsetCorreosUPMLibres()  {
        String correo = new String;
        assertTrue (correo== "hola@upm.es");
    }

}