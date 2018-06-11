package es.upm.fis2018.gm11_6.core;

import org.junit.Test;
import static org.junit.Assert.*;
public class PerfilTest {

    @Test
    public void testmodificarPerfil() {
        Perfil perfil = new Perfil();
        perfil.modificarPerfil("nuevo","es un perfil","101.jpg");

    }

    @Test
    public void testgetEstado() {
        Perfil perfil = new Perfil();
        assertTrue (perfil.getEstado()=="estado");
    }


    @Test
    public void testsetEstado() {
        Perfil perfil = new Perfil();
        perfil.setEstado("disponible");
        assertTrue (perfil.getEstado()=="disponible");
    }

    @Test
    public void testgetDescripcion() {
        Perfil perfil = new Perfil();
        assertTrue (perfil.getDescripcion() == "descripcion");
    }

    @Test
    public void testsetDescripcion() {
        Perfil perfil = new Perfil();
        perfil.setDescripcion("soy yo");
        assertTrue (perfil.getDescripcion() == "soy yo");
    }

    @Test
    public void testgetImagen() {
        Perfil perfil = new Perfil();
        assertTrue (perfil.getImagen() == "#");
    }

    @Test
    public void testsetImagen() {
        Perfil perfil = new Perfil();
        perfil.setImagen("1.jpg");
        assertTrue (perfil.getImagen() == "1.jpg");
    }
}