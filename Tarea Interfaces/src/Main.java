import web.hotchop.models.Comics;
import web.hotchop.models.IPhone;
import web.hotchop.models.Libro;
import web.hotchop.models.TvLcd;
import web.hotchop.models.interfaces.IProducto;
import web.hotchop.models.tda.Producto;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[6];
        productos[0]= new IPhone(16000,"Apple","Midnight Black","15");
        productos[1]= new Comics(2800, Date.valueOf("2023-04-13"),"Jonhson","Inmortal Protector","Marvel","Protector");
        productos[2]= new Libro(1500,Date.valueOf("1993-05-24"),"Martin","Sherlock","Mysterium");
        productos[3]= new TvLcd(40000,"LG",42);
        productos[4]= new Comics(2100,Date.valueOf("2013-06-07"),"Isayama","Attack on Titan","Panini","Eren");
        productos[5]= new IPhone(15000,"Apple","Space Silver","Watch 8");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i].toString());
            System.out.println("\n");
        }
    }
}