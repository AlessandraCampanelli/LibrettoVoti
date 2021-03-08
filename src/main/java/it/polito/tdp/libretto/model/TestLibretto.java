package it.polito.tdp.libretto.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	public static void main (String[] args) {
		System.out.println("test metodi di Librtto");
Libretto libretto= new Libretto();
Voto voto1 = new Voto("Analisi 1 ",30,LocalDate.of(2019, 2, 15));
libretto.add(voto1);
libretto.add(new Voto("Fisica 1",28,LocalDate.of(2019, 7, 10)));
libretto.add(new Voto("Informativa",28,LocalDate.of(2019, 9, 10)));
System.out.println(libretto);
List<Voto> venticinque=libretto.listVotiUguali(28); 
System.out.println(venticinque);
}
	
}