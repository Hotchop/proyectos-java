package web.hotchop.modelos;

public class Libro {
    private String titulo;
    private Float precio;
    private Integer stock;
    Autor autor1 = null;
    Autor autor2 = null;

    public Libro(String titulo, Float precio, Integer stock, Autor autor1, Autor autor2) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor1 = autor1;
        this.autor2 = autor2;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor1=" + autor1 +
                ", autor2=" + autor2 +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Autor getAutor1() {
        return autor1;
    }

    public void setAutor1(Autor autor1) {
        this.autor1 = autor1;
    }

    public Autor getAutor2() {
        return autor2;
    }

    public void setAutor2(Autor autor2) {
        this.autor2 = autor2;
    }

    public String mensaje(){
        if(autor2 == null){
            return "“El libro, "+titulo+" de "+autor1.getNombre()+" "+autor1.getApellido()+". Se vende a "+precio+" pesos.”";
        }
        return "“El libro, "+titulo+" de "+autor1.getNombre()+" "+autor1.getApellido()+" y "+autor2.getNombre()+" "+autor2.getApellido()+". Se vende a "+precio+" pesos.”";
    }
}
