package presentation;


import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faire un tableau de personne trié, qui n'accepte pas de doublon
		
		//alorithme de trie (fonction interne)
		//déclaration de la collection
		SortedSet<Personne> set = new TreeSet<Personne>(
				new Comparator<Personne>() {

					/*
					public int compare(Personne arg0, Personne arg1) {
						 TODO Auto-generated method stub
						
						if (arg0.getNom().equals(arg1.getNom()))
						
						{
							return -(arg0.getPrenom().compareTo(arg1.getPrenom()));
						}
						else
						{
							return -(arg0.getNom().compareTo(arg1.getNom()));
						} 
						
						*/
					
						@Override
						public int compare(Personne arg0, Personne arg1) {
							
							
						return  arg0.getId().compareTo(arg1.getId());
					
						} 
				});
		
		//creation des objets
		Personne p1 = new Personne(1234, "nom", "prenom");
		Personne p2 = new Personne(2345, "toto", "tit");
		Personne p3 = new Personne(1658, "espuche","Marine");
		Personne p4 = new Personne(6853,"toto","jojo");
		Personne p5 = new Personne(2568,"Abc", "Def");
		
		
		//ajout des personnes à la collection
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p4);
		set.add(p5);
		
		
		//parcourir la collection
		for (Personne p:set)
		{
			System.out.println(p);
		}
		
	}

}
