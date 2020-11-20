public class AvionF22 extends Avion{
    
    public AvionF22(int velocidad,int costo, int salud){
        super(velocidad,costo,salud);
   }
    
    @Override
    public void atacar(Avion a1){
        int sal = a1.getSalud()-3;
        a1.setSalud(sal);
    }
}