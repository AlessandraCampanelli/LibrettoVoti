package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
private List <Voto >voti; 
public Libretto() {
	this.voti= new ArrayList<Voto>();
}
public void add(Voto v) {
	this.voti.add(v); 
   }
public void StampaVotiUguali(int punteggio) {
	
	System.out.println();
}
public String votiUguali(int punteggio ) {
	return null; 
}

public List <Voto>listVotiUguali(int punteggio){
	List<Voto> risultato= new ArrayList <>();
	for(Voto v:this.voti)
		if(v.getVoto()==punteggio)
			risultato.add(v);
	return risultato; 
}
/*public Libretto votiUguali(int punteggio) {
	
}*/
public String toString() {
	String s= "";
	for(Voto v:this.voti)
		s=s+v.toString()+"\n"; 
	return s;
}
}
