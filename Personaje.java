public class Personaje
{
    private String nombre;
    private int salud;
    private int ataque;
    public Personaje(){
    }

    public Personaje(String nombre,int ataque, int salud){
        this.nombre= nombre;
        this.ataque=ataque;
        this.salud =salud;
    }

    public void setNombre(String n){
        this.nombre =n;
    }

    public String getNombre(){
        return nombre;
    }

    public void setAtaque(int a){
        this.ataque =a;
    }

    public int getAtaque(){
        return ataque;
    }

    public void setSalud(int s){
        this.salud =s;
    }

    public int getSalud(){
        return salud;
    }

    public String toString(){
        return "nombre: "+ this.nombre + " ataque: "+ this.ataque + " salud: "+ salud;
    }

    public static void mostrarPersonajes(Personaje[] personajes){
        for(int i = 0;i<personajes.length;i++){
            System.out.println("Personaje: " +i);
            System.out.println(personajes[i].toString());
        }
    }

    public void atacar(Personaje p1){
        int salud1=p1.getSalud();
        salud1= salud1-ataque;
        p1.setSalud(salud1);
    }
}