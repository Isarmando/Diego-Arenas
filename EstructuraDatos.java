import java.util.Scanner;

class EstructuraDatos{

 

    public static void main(String[] args){

        
        Scanner entrada = new Scanner(System.in);

        int opcion,dato1,dato2,dato3;
        
        int i=1;
        
        char letra;

        double resultado,radianes;

    do{
        System.out.println("3IV8_Arenas_Trejo_Diego_Israel");
        System.out.println("Eliga la opcion mas deseda:");
        System.out.println("Escriba 1 para hacer una suma");
        System.out.println("Escriba 2 para hacer una resta");
        System.out.println("Escriba 3 para hacer una multiplicacion");
        System.out.println("Escriba 4 para hacer una división");
        System.out.println("Escriba 5 para elevera un numero al cuadrado");
        System.out.println("Escriba 6 para hacer una raiz cuadratica");
        System.out.println("Escriba 7 para elever un numero al cubo");
        System.out.println("Escriba 8 rapara hacer la raiz cubica");
        System.out.println("Escriba 9 para sacar la sen de un angulo");
        System.out.println("Escriba 10 para sacar la cos de un angulo");
        System.out.println("Escriba 11 para sacar la tangente de un angulo");
        System.out.println("Escriba 12 para repetir UwU las veces que quieras");
        System.out.println("Escriba 13 para repeir UnU las veecs que quieras");
        System.out.println("Escriba 14 para salir del menu");
        

        opcion = entrada.nextInt();

        

        switch (opcion) {
           
            case 1: //Suma 
            System.out.println("Ingresa el primer valor a sumar ");
            dato1 = entrada.nextInt();
            System.out.println("Ingresa el seguno valor a sumar");
            dato2 = entrada.nextInt();

            resultado = dato1+dato2;

            System.out.println("El resultado de "+dato1+"+"+dato2+" es de "+resultado);
            
            break;

            case 2: //resta
                System.out.println("Ingresa el primer valor ");
                dato1= entrada.nextInt();
                System.out.println("Ingresa el segundo valora restar");
                dato2=entrada.nextInt();

                resultado=dato1-dato2;
                System.out.println("El resultado de " +dato1+"-"+dato2+ " es de "+ resultado);

            break;

            case 3: //mutiplicación
                System.out.println("Ingresa el primer valor ");
                dato1=entrada.nextInt();
                System.out.println("Ingresa el segundo valor a multiplicar");
                dato2=entrada.nextInt();
                resultado=dato1*dato2;
                System.out.println("El resultado de "+dato1+"*"+dato2+ " es de "+ resultado);
            break;

            case 4://división 
                System.out.println("Ingresa el primer valor que va a ser dividido ");
                dato1=entrada.nextInt();
                System.out.println("Ingresa el segundo valor el cual va a dividir");
                dato2=entrada.nextInt();
                resultado=dato1/dato2;
                System.out.println("El resultado de "+dato1+"/"+dato2+ " es de "+ resultado);
            break;
            
            case 5://Numero al cuadrado
                System.out.println("Ingresa el numero que quieras elevar");
                dato1=entrada.nextInt();
                resultado= dato1*dato1;
                System.out.println("El resultado de "+dato1+"^2 es de "+ resultado);
            break;

            case 6: //Raiz de un numero 
                System.out.println("Ingresa el numero al cual quieras sacarle raiz ");
                dato1=entrada.nextInt();
                resultado=Math.sqrt(dato1);
                System.out.println("El resultado de la raiz √"+dato1+" es de "+ resultado);    
            break;

            case 7: //Elevar un numero al cubo
                System.out.println("Ingresa el numero que quiereas elevar al cubo");
                dato1=entrada.nextInt();
                resultado=dato1*dato1*dato1;
                System.out.println("El resultado de "+dato1+"^3 es de "+ resultado);
            break;

            case 8://Sacar raiz cubica 
                System.out.println("Ingresa el numero que quieras sacarle raiz cubica");
                dato1=entrada.nextInt();
                resultado=Math.cbrt(dato1);
                System.out.println("El resultado de 3√"+dato1+" es de "+resultado);
            break;

            case 9://sen de un grado
                System.out.println("Ingresa el valor que quieras sacar con el sen");
                dato3=entrada.nextInt();
                radianes=Math.toRadians(dato3);
                resultado=Math.sin(radianes);
                System.out.println("El resultado es de "+resultado);
            break;

            case 10:    
            System.out.println("Ingresa el valor que quieras sacar con el cos");
            dato3=entrada.nextInt();
            radianes=Math.toRadians(dato3);
            resultado=Math.cos(radianes);
            System.out.println("El resultado es de "+resultado);
            break;

            case 11:
            System.out.println("Ingresa el valor que quieras sacar con el tan");
                dato3=entrada.nextInt();
                radianes=Math.toRadians(dato3);
                resultado=Math.tan(radianes);
                System.out.println("El resultado es de "+resultado);
            break;

            case 12: //repetir la palabra UwU
            System.out.println("Ingresa las veces que quieres que quieres que se repita la palabra.");
            dato1=entrada.nextInt();
                 
                while (i<= dato1){
                System.out.println("UwU");
                i++;
                }
            break;
            
            case 13:
            System.out.println("Ingresa las veces que quieres que quieres que se repita la palabra.");
            dato1=entrada.nextInt();
                 
                while (i<= dato1){
                System.out.println("UnU");
                i++;
                }
            break;

            default:
            
                System.out.println("Gracias por participar I love u UwU ");
                
            
            
                
                
        }
        
        System.out.println("¿Deseas repetir el programa?, si lo desea escriba si");
        letra = entrada.next().charAt(0);

        

    }while(letra == 's');
        
        
        
    }
}