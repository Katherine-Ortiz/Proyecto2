public class Hada extends Personaje
{
    public Hada(String nombre, int ataque,int salud){
        super(nombre,ataque,salud);
    }

    @Override
    public void atacar(Personaje p1){
        int salud1 = p1.getSalud()-this.getAtaque()*2;
        p1.setSalud(salud1);
    }
}