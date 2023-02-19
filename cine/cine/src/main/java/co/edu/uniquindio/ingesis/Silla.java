package co.edu.uniquindio.ingesis;

public class Silla {
    private final TipoSilla tipo;
    private EstadoSilla estado;
    private final String posicion;

    private String cliente;

    public Silla( TipoSilla tipoInicial , String posicionInicial ){
        tipo = tipoInicial;
        posicion = posicionInicial;
        estado = EstadoSilla.DISPONIBLE;
    }

    // Notas:
     //throws Exception en el metodo
    // throw new Exception("error");
    /*public Silla(TipoSilla tipoInicial , String posicionInicial ){
    tipo = tipoInicial;
    posicion = posicionInicial;
   estado = EstadoSilla.DISPONIBLE;

   char letra=posicionInicial.charAt(0);
   //investigar expresiones regulares, coleccion de datos
   private Collection<Silla> sillas;
   private final String nombre; constructor
   }

   //contenido del cine(conjunto de sillas)

     */
    public TipoSilla getTipo() {
        return tipo;
    }
}
