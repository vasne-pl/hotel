package sistema_hotelero;

public class piso_4 extends Sistema_Hotelero{
    
        public void setPiso_4(int piso_4){
        
        if (piso_4 == 401){
            
            System.out.println("Ocupado");
        
        } else if(piso_4 == 402){
            
            System.out.println("Disponible");
            
        } else {
            
            System.out.println("La habitacion no existe.");
            
        }
    }
    
    @Override
    public void Valor_de_noche(){
        System.out.println("El valor por noche es de $700.000");
    }
    
    @Override
    public void Tipo_de_habitacion(){
        System.out.println("habitacion suite clase media");
    }
    
    @Override
    public void equipamento(){
        System.out.println("El quipamento es:");
        System.out.println("Una cama para dos, aire acondicionado, un televisor, un baño, una nevera, un balcon.");
    }
}
