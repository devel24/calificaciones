import java.util.Random;

/**
 * Write a description of class Calificaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calificaciones
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Calificaciones
     */
    public Calificaciones()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static String[] ObtenerAlumnos()
    {
        String[] nombres = {
            "Luis", "Sofía", "Juan", "Valentina", "Carlos",
            "Mariana", "Alejandro", "Fernanda", "José", "Ana",
            "Miguel", "Isabella", "Jesús", "Camila", "Javier",
            "Ximena", "Diego", "Lucía", "Ricardo", "Paula",
            "Roberto", "Adriana", "Manuel", "María", "Felipe",
            "Patricia", "Pedro", "Valeria", "Gabriel", "Fátima"
        };
        
        return nombres;
    }
    
    public static double[] ObtenerCalificaciones()
    {
        double[] calificaciones = new double[30];
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            double numero = 5 + (random.nextDouble() * (10 - 5));
            calificaciones[i] = Math.round(numero * 100.0) / 100.0;
        }
        
        return calificaciones;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void CalcularPromedios()
    {
        String[] alumnos = ObtenerAlumnos();
        double[] matematicas = ObtenerCalificaciones();
        double[] espanol = ObtenerCalificaciones();
        double[] geografia = ObtenerCalificaciones();
        double[] ciencias = ObtenerCalificaciones();
        double[] educacionFisica = ObtenerCalificaciones();
        
        for (int i = 0; i < 30; i++) {
            String alumno = alumnos[i];
            double calificacionMatematicas = matematicas[i];
            double calificacionEspanol = espanol[i];
            double calificacionGeografia = geografia[i];
            double calificacionCiencias = ciencias[i];
            double calificacionEducacionFisica = educacionFisica[i];
            double promedio = (calificacionMatematicas+calificacionEspanol+calificacionGeografia+calificacionCiencias+calificacionEducacionFisica)/5;
            String status;
            if(promedio>=7)
            {
                status = "Aprobado";
            }
            else
            {
                status = "Reprobado";
            }
            
            System.out.println("El promedio de " + alumno + " es " + promedio + " por lo tanto esta " + status);
        }
    }
}
