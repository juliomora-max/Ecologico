
public class ImpactaEcologico {

import  java.util.ArrayList; 
public class Main { 
public static void main(String [] args) {
 ArrayList<ImpactoEcologico> objetos = new 
 ArrayList<ImpactoEcologico>(); 

Edificio edificio = new Edificio(10, 5, "01/01/2000"); 
objetos.add(edificio); 

Auto auto = new Auto("Toyota", "Corolla", 2021, "Gasolina"); 
objetos.add(auto); 

Bicicleta bicicleta = new Bicicleta("Trek", "X-Caliber", "De montaña"); 
objetos.add(bicicleta); 

for (ImpactoEcologico objeto : objetos) { 
System.out.println("Objeto: " + objeto.getClass().getSimpleName()); 
System.out.println("Impacto ecológico del carbono: " + objeto.obtenerImpactoEcologico()); 
System.out.println(); 
  } 
 } 
}  