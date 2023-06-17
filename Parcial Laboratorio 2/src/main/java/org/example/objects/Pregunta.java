package org.example.objects;

public abstract class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;

    public Pregunta(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public abstract boolean verificarRespuesta(String respuesta);

    @Override
    public String toString() {
        return "Pregunta{" +
                "enunciado='" + enunciado + '\'' +
                ", respuestaCorrecta='" + respuestaCorrecta + '\'' +
                '}';
    }
}
