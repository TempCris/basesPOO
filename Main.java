public class Main{
    
    public static void main(String[] args){
    //creacon de un nuevo objeto
    Pokemon pokemon1= new Pokemon();
        //Imprimo texto
        System.out.println();
        pokemon1.getTexto();
        System.out.println(pokemon1.getTexto());
        //Imprimo el dato ya inicializado en el construtor
        System.out.println(pokemon1.getNombre());
        //nulls
        //Ingreso datos 
        pokemon1.setGenero("MACHO");
        //Imprimo con el dato ya llenado 
        System.out.println(pokemon1.getGenero());
        //se dan valores al ataque
        pokemon1.setAtaque(60.0);
        System.out.println(pokemon1.getAtaque());        
        //Hago operaciones con el ataque 
        //Suma
        pokemon1.setSuma(50.0);
        System.out.println(pokemon1.getSuma());
        //Multiplicacion
        pokemon1.setMult(3.0);
        System.out.println(pokemon1.getMult());
    //nuevo objeto (pokemon2)
    Pokemon pokemon2= new Pokemon();
        //Ingreo el nuevo Pokemon
        pokemon2.setNuevo("Charmander");
        //Imprimo el texto
        pokemon2.getTexto();
        System.out.println(pokemon2.getTexto());
        //Imprimo su nombre
        System.out.println(pokemon2.getNombre());
        //le doy Valores a sus Atributos
        pokemon2.setGenero("HEMBRA");
        System.out.println(pokemon2.getGenero());
        pokemon2.setAtaque(35.0);
        System.out.println(pokemon2.getAtaque());;        
        //Hago operaciones con el ataque 
        //Suma
        pokemon2.setSuma(40.0);
        System.out.println(pokemon2.getSuma());
        //Multiplicacion
        pokemon2.setMult(2.0);
        System.out.println(pokemon2.getMult());
    
    }
}
