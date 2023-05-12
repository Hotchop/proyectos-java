package nicolasmiranda.punto2;

import nicolasmiranda.punto2.objects.*;

import java.util.*;

/**DNI: 39836196
 * Miranda, Nicolas Martin
 * Comision 4
 */
public class Main {     ///Main del punto 2: Videojuego
    public static void main(String[] args) {
        /**Instancias de Objetos**/
        Player player1 = new Player("Nicolas","Azul",100,0d,0d,"Espadas",5,1,100);
        Zombie zombie1 = new Zombie("Zombie Debil","Verde",50,20d,30d,"Dientes",1,1,5);
        Zombie zombie2 = new Zombie("Zombie Fuerte","Rojo",75,30d,40d,"Dientes",3,2,15);
        Bestia bestia1 = new Bestia("Buitre","Marron",50,10d,5d,"Pico",2,1,10);
        Bestia bestia2 = new Bestia("Dragon","Dorado",100,50d,50d,"Fuego",10,3,15);

        /**Guardado en HashMap**/
        Map<String,Personaje> map = new HashMap<>();
        map.put(player1.getNombre(), player1);
        map.put(zombie1.getNombre(),zombie1);
        map.put(zombie2.getNombre(), zombie2);
        map.put(bestia1.getNombre(),bestia1);
        map.put(bestia2.getNombre(),bestia2);

        /**Ordenamiento**/  ///Pasaje de HashMap a un ArrayList para utlizar el sistema de ordenamiento Collections.sort
        //Collection<Personaje> collection = map.values();
        List<Personaje> list = new ArrayList<>(map.values());   /**Agregado map.values() para solucionar uso extra de Collection**/
        //list.addAll(collection);
        Collections.sort(list);

        /**Posteo de Datos**/
        for(Personaje i: list){
            if(i instanceof Enemigo){
                System.out.println(i.toString());
            }
        }
    }
}
