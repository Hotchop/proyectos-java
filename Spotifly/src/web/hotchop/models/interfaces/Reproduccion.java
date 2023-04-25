package web.hotchop.models.interfaces;

import web.hotchop.models.Cancion;

public interface Reproduccion {
    void reproducir();
    void agregarCancion(Cancion nueva);
    void eliminarCancion();
    void cambiarCancion();
    void verMiLista();

}
