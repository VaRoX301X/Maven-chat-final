package es.upm.fis2018.gm11_6.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AgendaTest {
	Agenda c,c2;
	Usuario contacto;
	ArrayList<Usuario> lista = new ArrayList<Usuario>();
	ArrayList<String> lista2= new ArrayList<String>();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new Agenda("prueba");
		c2 = new Agenda ("prueba",lista,lista2);
		contacto = new Usuario ("nombre1","apellido1","alias","correo","pass",1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgendaString() {
		
		assertEquals ("prueba", c.getNombre());
		
	}

	@Test
	public void testAgendaStringArrayListOfUsuarioArrayListOfString() {
		assertEquals ("prueba", c2.getNombre());
		assertEquals (lista, c2.getContactos());
		assertEquals (lista2, c2.getCategoria());
	}

	@Test
	public void testAddContacto() {
		lista.add(contacto);
		assertEquals (contacto, lista.get(0));
	}

	@Test
	public void testMostrarContactos() {
		for (int i = 0; i < lista.size(); i++) {
			assertEquals("0" + "\t" + "nombre1" + "\t" + "apellido1" + "\t" + "alias" + "\t"
				     + "correo",lista.get(i).mostrarDatos());
		}
	}

	@Test
	public void testMostrarCategorias() {
		if (lista2.isEmpty()){
			assertEquals ("Sin categoria/s",c2.mostrarCategorias());
		}
		else{
			assertEquals ("[Categoria 1 ]",c2.mostrarCategorias());
		}
	}

	@Test
	public void testBorrarCategoria() {
		if (!lista2.contains("Categoria 1")){
		assertEquals(false,c2.borrarCategoria("Categoria 1"));
		}
		else{
		assertEquals(true,c2.borrarCategoria("Categoria 1"));
		}
	}
	

	@Test
	public void testGetNombre() {
		assertEquals ("prueba",c2.getNombre());
	}

	@Test
	public void testSetNombre() {
		c2.setNombre("nombre2");
		assertEquals("nombre2",c2.getNombre());
	}

	@Test
	public void testGetCategoria() {
		assertEquals(lista2, c2.getCategoria());
	}

	@Test
	public void testSetCategoria() {
		ArrayList<String> listaalter= new ArrayList<String>();
		c2.setCategoria(listaalter);
		assertEquals(listaalter,c2.getCategoria());
	}

	@Test
	public void testGetContactos() {
		assertEquals (lista,c2.getContactos());
	}

	@Test
	public void testSetContactos() {
		ArrayList<Usuario> listaalter2= new ArrayList<Usuario>();
		c2.setContactos(listaalter2);
		assertEquals(listaalter2,c2.getContactos());
	}

}
