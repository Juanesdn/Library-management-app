/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;


/**
 *
 * @author Juanes
 */
public class variables {
    
    // Variables usuario
    public static String[] nomUsuario = new String[100];
    public static String[] apellidoUsuario = new String[100];
    public static String[] codUsuario = new String[100];
    public static String[] tipoUsuario = new String[100];
    public static int cont_usuarios = 0;
    
    
    
    // Variables Texto
    public static String[] nombre_texto = new String[100];
    public static Double[] precio_texto = new Double[100];
    public static String[] tipo_texto = new String[100];
    public static String[] editorial = new String[100];
    public static String[] autor = new String[100];
    public static String[] estado = new String[100];
    public static int[] edad_texto = new int[100];
    public static String[] tipo_transaccion = new String[100];
    public static String[] traslado = new String[100];
    public static String[] codigo_libro = new String[100];
    public static String[] codigo_grupo = new String[100];
    public static String[] codigo_isbn = new String[100];
    public static int[] pos_textoBaja = new int[100];
    public static int cont_bajas = 0;
    public static int cont_editorial = 0;
    public static int cont_autores = 0;
    public static int cant_libros = 0;
    public static int cant_revistas = 0;
    public static int cant_monografias = 0;
    public static int cont_texto = 0;
    
    
    // Variables Editorial y Autor
    public static String[] nombre_editorial = new String[100];
    public static String[] codigo_editorial = new String[100];
    public static String[] nombre_autor = new String[100];
    public static String[] codigo_autor = new String[100];
    
    
    // Variables texto de baja 
    public static String[] nombre_texto_baja = new String[100];
    public static Double[] precio_texto_baja = new Double[100];
    public static String[] tipo_texto_baja = new String[100];
    public static String[] editorial_baja = new String[100];
    public static String[] autor_baja = new String[100];
    public static String[] estado_baja = new String[100];
    public static String[] codigo_isbn_baja = new String[100];
    public static int[] edad_baja = new int[100];
    
    //variables prestamos
    public static int[] librodisponible = new int[100];
    public static String[] nomLibro_prestamo = new String[100];
    public static String[] nomUsuario_prestamo = new String[100];
    public static String[] tipoUsuario_prestamo = new String[100];
    public static String[] tipoTexto_prestamo = new String[100];
    public static int[] prestamos = new int[100]; 
    public static int cont_prestamos = 0;
}
