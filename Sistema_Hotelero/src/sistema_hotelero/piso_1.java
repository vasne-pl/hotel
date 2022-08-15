package sistema_hotelero;

public class piso_1 extends Sistema_Hotelero{
    private String hab_101, hab_102;

    
    
    @Override
    public void Valor_de_noche(){
        System.out.println("El valor por noche es de $120.000");
    }
        
    @Override
    public void Tipo_de_habitacion(){
        System.out.println("habitacion sencilla");
    }
    
    @Override
    public void equipamento(){
        System.out.println("El quipamento es:");
        System.out.println("Una cama, un baño, un avanico, y una lampara de cama.");
    }
    
    
}
