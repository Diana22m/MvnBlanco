paquete  uv.mx.sistemasweb ;

importar  chispa estática.Spark . * ;
/ **
 * ¡Hola Mundo!
 *
 * /
 aplicación de clase  pública 
{
    public  static  void  main ( String [] args )
    {
        get ( " / aprobado " , (req, res) - > {
            res . redireccionar ( " /miCalificacion.html " );
            volver res;
        });
    }
}
