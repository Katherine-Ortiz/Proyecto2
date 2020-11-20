public class Avion{

    private int velocidad;
    private int costo;
    private int salud = 10;
    private int ataque;

    public Avion(){
    }

    public Avion(int velocidad,int costo, int salud){
        this.velocidad = velocidad;
        this.costo = costo;
        this.salud = salud;
    }

    public void setVelocidad(int V){
        this.velocidad = V;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setCosto(int C){
        this.costo = C;
    }

    public int getCosto(){
        return costo;
    }

    public void setSalud(int S){
        this.salud = S;
    }

    public int getSalud(){
        return salud;
    }

    public String toString(){
        return "Velocidad: "+ this.velocidad + " Costo: "+ this.costo + " Salud: "+ this.salud;
    }

    public static void mostrarAviones(Avion[] aviones){
        for(int i = 0;i<aviones.length;i++){
            System.out.println(aviones[i].toString());
        }
    }

    public static void comparar(Avion avi1, Avion avi2){
        if(avi1.getVelocidad()< avi2.getVelocidad()){
            System.out.println("El avión más veloz es: " +avi2.toString());
        }else{
            System.out.println("El avión más veloz es: " +avi1.toString());
        }
    }

    public static void avionesVelocidadmayor(Avion[] aviones){
        for(int i = 0;i<aviones.length;i++){
            if(aviones[i].getVelocidad()>2000){
                System.out.println(aviones[i].toString());
            }
        }
    }

    public void atacar(Avion a1){
        int sal = a1.getSalud();
        sal= sal-ataque;
        a1.setSalud(sal);
    }
}