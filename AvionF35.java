public class AvionF35 extends Avion{

    public AvionF35(int velocidad,int costo, int salud){
        super(velocidad,costo,salud);
    }

    @Override
    public void atacar(Avion a1){
        int sal = a1.getSalud()-2;
        a1.setSalud(sal);
    }
}