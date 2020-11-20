public class PrincipalReto{
    
        public static void guerra(Personaje[]personajes){
        personajes[0].atacar(personajes[2]);
        personajes[2].atacar(personajes[0]);
    }
    
    public static void main(String[]args){
        Personaje [] personajes = new Personaje [3];
        Elfo e1 = new Elfo("Elfo1",10,10);
        Elfo e2 = new Elfo("Elfo2",20,20);
        Hada h1 = new Hada("Hadita2",20,20);
        personajes[0]= e1;
        personajes[1]= e2;
        personajes[2]= h1;
        
        System.out.println("---Antes de la guerra---");
        Personaje.mostrarPersonajes(personajes);
        
        
        System.out.println("---Después de la guerra---");
        PrincipalReto.guerra(personajes);
        Personaje.mostrarPersonajes(personajes);

    }
}