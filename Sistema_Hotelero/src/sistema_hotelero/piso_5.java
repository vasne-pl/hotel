package sistema_hotelero;

public class piso_5 extends Sistema_Hotelero{
    
        public void setPiso_5(int piso_5){
        
        if (piso_5 == 501){
            
            System.out.println("Ocupado");
        
        } else {
            
            System.out.println("La habitacion no existe.");
            
        }
    
    }
    
    @Override
    public void Valor_de_noche(){
        System.out.println("El valor por noche es de $2.000.000");
    }    
        
    @Override
    public void Tipo_de_habitacion(){
        System.out.println("habitacion suite presidencial");
    }    
        
    @Override
    public void equipamento(){
        System.out.println("El quipamento es:");
        System.out.println("Una cama para dos, aire acondicionado, un televisor, un baño, un balcon, un mini bar, ventanas termoacusticas, sala de estar, un comedoruna caja fuerte, zona de ropero,un espejo, un jacuzzi.");
    }
}
