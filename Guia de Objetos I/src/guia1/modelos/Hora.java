package guia1.modelos;

public class Hora {
    private Integer hh;
    private Integer mm;
    private Integer ss;

    public Hora(Integer hh, Integer mm, Integer ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    public Integer getHh() {
        return hh;
    }

    public void setHh(Integer hs) {
        this.hh = hs;
    }

    public Integer getMm() {
        return mm;
    }

    public void setMm(Integer mm) {
        this.mm = mm;
    }

    public Integer getSs() {
        return ss;
    }

    public void setSs(Integer ss) {
        this.ss = ss;
    }

    public void muestraHora(){
        if((hh<0)||(hh>23)||(mm<0)||(mm>59)||(ss<0)||(ss>59)){
            System.out.println("La hora es erronea");
        }
        else{
            if ((hh < 10)) {
                System.out.print("0" + hh);
            } else {
                System.out.print(hh);
            }
            System.out.print(':');
            if ((mm < 10)) {
                System.out.print("0" + mm);
            } else {
                System.out.print(mm);
            }
            System.out.print(':');
            if ((ss < 10)) {
                System.out.println("0" + ss);
            } else {
                System.out.println(ss);
            }
        }
    }

    public void avanza(){
        ss++;
        if(ss>59){
            ss = 0;
            mm++;
            if(mm>59){
                mm=0;
                hh++;
                if(hh>23){
                    hh=0;
                }
            }
        }
        muestraHora();
    }
    public void retraza(){
        ss--;
        if(ss<0){
            ss = 59;
            mm--;
            if(mm<0){
                mm=59;
                hh--;
                if(hh<0){
                    hh=23;
                }
            }
        }
        muestraHora();
    }
}
