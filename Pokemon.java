public class Pokemon {
    //Atributos 
    private String nombre;
    private String genero;
    private Double ataque;
    //Metodos
    public String getTexto(){
        return "Yo te elijo " + nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getGenero(){
        return this.genero;
    }
    public Double getAtaque(){
        return this.ataque;
    }
    //cambiar o ingresar datos
    //Genero
    public void setGenero(String MH){
        this.genero=MH;
    }
    //Ataque
    public void setAtaque(Double atk){
        this.ataque=atk;
    }
    //Hago operaciones con el ataque
    //Suma
    public void setSuma(Double daño){
        this.ataque= (this.ataque + daño);
    }
    public Double getSuma(){
        return this.ataque;
    }
    //multiplicacion
    public void setMult(Double bonus){
        this.ataque=(ataque * bonus);
    }
    public Double getMult(){
        return this.ataque;
    }
    //--------------------Pokemon2
    //Registrar nuevo pokemon
    public void setNuevo(String nuevoNombre){
        this.nombre=nuevoNombre;
    }
    public String getNuevo(){
        return this.nombre;
    }
    //Constructor
    public Pokemon(){
        this.nombre="bulbasaur";
}
}