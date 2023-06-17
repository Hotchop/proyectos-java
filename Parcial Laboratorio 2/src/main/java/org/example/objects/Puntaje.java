package org.example.objects;

import java.time.LocalDate;


public class Puntaje {
    private LocalDate fechaActual;
    private int aciertos;
    private int errores;

    public Puntaje() {
        this.fechaActual = LocalDate.now();
        this.aciertos = 0;
        this.errores = 0;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos += aciertos;
    }

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores += errores;
    }

    @Override
    public String toString() {
        return "Fecha: "+ fechaActual+" - Preguntas Acertadas: "+aciertos+" - Preguntas Erradas: "+errores;
    }
}
