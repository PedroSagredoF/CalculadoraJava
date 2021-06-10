import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Elige la Operación");
        System.out.println("1 Para Suma");
        System.out.println("2 Para Resta");
        System.out.println("3 Para Multiplicación");
        System.out.println("4 Para División");

        int choose = scan.nextInt();
        System.out.println("Ingresa 2 Números");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (choose >4){
            System.out.println("El rango a elegir debe ser entre 1 y 4");
        }else{
            switch (choose)
            {
                case 1: System.out.println("La respuesta es: "+ add(x,y));
                    break;

                case 2: System.out.println("La respuesta es: "+ res(x,y));
                    break;

                case 3: System.out.println("La respuesta es: "+ mul(x,y));
                    break;

                case 4:
                    System.out.println("La respuesta es: "+ div(x,y));
                    break;
            }


        }


    }

    public static int add (int x, int y){
        int res=x+y;
        return res;
    }

    public static int res (int x, int y){
        int res=x-y;
        return res;
    }

    public static int mul (int x, int y){
        int res=x*y;
        return res;
    }

    public static int div (int x, int y){
        int res=x/y;
        return res;
    }

}
