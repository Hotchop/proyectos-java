import web.hotchop.models.Vuelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        ArrayList<Vuelo> listado = new ArrayList<>();
        listado.add(new Vuelo("AAL 933","New York","Santiago",LocalDateTime.parse("29/08/2021 05:39",formatter),62));
        listado.add(new Vuelo("LAT 755","Sao Paulo","Santiago",LocalDateTime.parse("31/08/2021 04:45",formatter),47));
        listado.add(new Vuelo("SKU 621","Rio De Janeiro","Santigo",LocalDateTime.parse("30/08/2021 16:00",formatter),52));
        listado.add(new Vuelo("DAL 147","Atlanta","Santigo",LocalDateTime.parse("29/08/2021 13:22",formatter),59));
        listado.add(new Vuelo("AVA 241","Bogota","Santigo",LocalDateTime.parse("31/08/2021 14:05",formatter),25));
        listado.add(new Vuelo("AMX 10","Mexico City","Santigo",LocalDateTime.parse("31/08/2021 05:20",formatter),29));
        listado.add(new Vuelo("IBE 6833","Londres","Santigo",LocalDateTime.parse("30/08/2021 08:45",formatter),55));
        listado.add(new Vuelo("LAT 2479","Frankfurt","Santigo",LocalDateTime.parse("29/08/2021 07:41",formatter),51));
        listado.add(new Vuelo("SKU 803","Lima","Santigo",LocalDateTime.parse("30/08/2021 10:35",formatter),48));
        listado.add(new Vuelo("LAT 533","Los Ángeles","Santigo",LocalDateTime.parse("29/08/2021 09:14",formatter),59));
        listado.add(new Vuelo("LAT 1447","Guayaquil","Santigo",LocalDateTime.parse("31/08/2021 08:33",formatter),31));
        listado.add(new Vuelo("CMP 111","Panama City","Santigo",LocalDateTime.parse("31/08/2021 15:15",formatter),29));
        listado.add(new Vuelo("LAT 705","Madrid","Santigo",LocalDateTime.parse("30/08/2021 08:14",formatter),47));
        listado.add(new Vuelo("AAL 957","Miami","Santigo",LocalDateTime.parse("29/08/2021 22:53",formatter),60));
        listado.add(new Vuelo("ARG 5091","Buenos Aires","Santigo",LocalDateTime.parse("31/08/2021 09:57",formatter),32));
        listado.add(new Vuelo("LAT 1283","Cancún","Santigo",LocalDateTime.parse("31/08/2021 04:00",formatter),35));
        listado.add(new Vuelo("LAT 579","Barcelona","Santigo",LocalDateTime.parse("29/08/2021 07:45",formatter),61));
        listado.add(new Vuelo("AAL 945","Dallas-Fort Worth","Santigo",LocalDateTime.parse("30/08/2021 07:12",formatter),58));
        listado.add(new Vuelo("LAT 501","París","Santigo",LocalDateTime.parse("29/08/2021 18:29",formatter),49));
        listado.add(new Vuelo("LAT 405","Montevideo","Santigo",LocalDateTime.parse("30/08/2021 15:45",formatter),39));

        Collections.sort(listado);
        System.out.println("...listado ordenado por fecha ascendente...");
        System.out.println("El ultimo vuelo en llegar es "+Collections.max(listado).getNombre()+": "+Collections.max(listado).getOrigen()+", aterriza "+Collections.max(listado).getFechaLlegada().format(formatter));
        ListIterator<Vuelo> vueloListIterator = listado.listIterator();
        int minPasajeros = Integer.MAX_VALUE;
        Vuelo aux,minimo = null;
        while (vueloListIterator.hasNext()){
            aux = vueloListIterator.next();
            if(aux.getCantidadPasajeros() < minPasajeros){
                minimo = aux;
                minPasajeros = aux.getCantidadPasajeros();
            }
        }
        System.out.println("El vuelo con el menor numero de pasajeros es "+minimo.getNombre()+": "+minimo.getOrigen()+", con "+minimo.getCantidadPasajeros()+" pasajeros");
    }
}