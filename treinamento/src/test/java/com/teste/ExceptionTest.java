package com.teste;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

	/* @Test (expected = IndexOutOfBoundsException.class)
	public void empty() {
		List<String> lista = new ArrayList<String>();
		lista.add("Talita");
		lista.get(0);
	
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void shouldTestExpectedMensage() throws IndexOutOfBoundsException {
		List<Object> lista = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");
		lista.get(0);
	}
	 */

	@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperando que IndexOutOfBoundsException seja lan�ado");
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));		
		
		   
		}
	}
}
