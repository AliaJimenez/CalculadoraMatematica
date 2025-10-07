/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alian
 */
public class CalculadoraMatematica {
    //Atributos prividos
    private double num1; 
    private double num2;
        
    //Constructor por defecto que inicializa los numeros a 0
    public CalculadoraMatematica() {
    this.num1 = 0;
    this.num2 = 0;
    }
    
    /**
    @param num1 primer numero
    @param num2 segundo numero
    */
        
    public void EstablecerNumeros(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;       
    }
  
    /**
     * Realiza la suma de los numeros
     * @return resultado de la suma
     */
    
    public double sumar() {
     return num1 + num2;
        
    }
    
    /**
     * Realiza la resta de los numeros
     * @return resultado de la resta
     */
    
    public double restar() {
     return num1 - num2;
        
    }
    
    /**
     * Realiza la multiplicacion de los numeros
     * @return resultado de la multiplicacion
     */
    
    public double multiplicar() {
     return num1 * num2;
        
    }
    
    /**
     * Realiza la division de los numeros
     * @return resultado de la division
     * @throws ArithmeticException si el divisor es cero
     */
    
    public double dividir() throws ArithmeticException {
    if (num2 == 0) {
        //Validar que no se divida entre 0
        throw new ArithmeticException("Error: No se puede dividir entre cero.");
    }
    return num1 / num2;
    }
    
        /**
         * Metodo principal que ejecuta el menu interactivo de la calculadora
         * Menu hecho con switch y bucles
     * @param args
         */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        
        int opcion;
        
        do{
            System.out.println("\n````Menu Calculadora````");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("-Seleccione una opción: ");
            
            //Validar entrada del usuario
            while (!entrada.hasNextInt())
                
            {
                System.out.println("Error. Debes ingresar una opcion vallida.");
                entrada.next(); //limpiar entrada incorrecta
                
                System.out.println("Seleccione una opción");
            }
            
            opcion = entrada.nextInt();
            
            //usar un switch para recorrer el menu
            switch (opcion){
                case 1:
                    //Ingresar numeros
                    try{
                        System.out.println("Ingrese el primer numero: ");
                        double n1 = entrada.nextDouble();
                        
                        System.out.println("Ingrese el segundo numero: ");
                        double n2 = entrada.nextDouble();
                        
                        calculadora.EstablecerNumeros(n1, n2);
                        System.out.println("Numeros Establecidos correctamente");
                    } catch (InputMismatchException e){
                        System.out.println("Error. Debe ingresar valores numericos.");
                        entrada.nextLine(); //limpiar el buffer
                    }
                    break;
                            
                case 2:
                    System.out.println("Resultado de la suma: " + calculadora.sumar());
                    break;
                    
                case 3:
                    System.out.println("Resultado de la resta: " + calculadora.restar());
                    break;
                   
                case 4:
                    System.out.println("Resultado de la multiplicacion: " + calculadora.multiplicar());
                    break;
                    
                case 5:
                    System.out.println("Resultado de la division: " + calculadora.sumar());
                    break;
                   
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                  
                default:
                    System.out.println("Opción no valida. Intente nuevamente");
                    break;
            }
        } while (opcion != 0);
        
        entrada.close();
    }

    
}
