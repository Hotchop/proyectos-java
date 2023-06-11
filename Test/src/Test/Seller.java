package Test;

import java.util.ArrayList;
import java.util.List;

// No agrego el la interface porque al heredar de employee ya lo hereda tambien.
public class Seller extends Employee {

    private List<CellPhone> cellPhones;
    private float commissionForSale;

    public Seller(int dni, String name, String surName, String email, int phone, List<CellPhone> cellPhoneList, float commissionForSale) {
        super(dni, name, surName, email, phone);
        this.cellPhones = cellPhoneList != null ? cellPhoneList : new ArrayList<>();
        setCommissionForSale(commissionForSale);
    }

    public List<CellPhone> getCellPhones() {
        return this.cellPhones;
    }

    public float getCommissionForSale() {
        return this.commissionForSale;
    }

    public void setCommissionForSale(float commissionForSale) {
        this.commissionForSale = commissionForSale;
    }

    //Methods
    public String toString(){
        String baseToString = super.toString();
        String messageFormat = "\n=> Datos Vendedor: [ Porcentaje Comision: %.2f ]";

        return baseToString.concat(String.format(messageFormat, getCommissionForSale()));
    }

    public void showCellPhones()
    {
        if (!this.getCellPhones().isEmpty()){
            System.out.println("==> Contiene " + getCellPhones().size() + " Celulares");
            for (CellPhone cellPhone : getCellPhones())
                System.out.println(cellPhone.toString());
        }
    }
}
