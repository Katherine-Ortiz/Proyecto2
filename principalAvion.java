public class principalAvion{
    
    public static void ataque(Avion[]aviones){
        aviones[0].atacar(aviones[1]);
        aviones[3].atacar(aviones[0]);
    }
   
    public static void main(String[]args){
        Avion [] aviones = new Avion [4];
        AvionF22 av1 = new AvionF22(2340, 250, 20);
        AvionF35 av2 = new AvionF35(1230, 130, 15);;
        AvionF22 av3 = new AvionF22(3120, 200, 25);
        AvionF35 av4 = new AvionF35(1900, 180, 10);;
        aviones[0]= av1;
        aviones[1]= av2;
        aviones[2]= av3;
        aviones[3]= av4;
        System.out.println("Información aviones: ");
        Avion.mostrarAviones(aviones);
        System.out.println("Información aviones con mayor velocidad: ");
        Avion.avionesVelocidadmayor(aviones);
        
        principalAvion.ataque(aviones);
        System.out.println("Información aviones después de ataque: ");
        Avion.mostrarAviones(aviones);

    }
    
}