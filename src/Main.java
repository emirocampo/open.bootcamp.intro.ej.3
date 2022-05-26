public class Main {
    public static void main(String[] args) {
        System.out.println("ejercicio tema 3");
        System.out.println("punto a. funcion suma");
        int sumados = suma(3,7,2);
        System.out.println("3+7+2="+sumados);
        System.out.println("punto b. objeto");
        Coche miCoche = new Coche();
        miCoche.aumentarNumPuertas();
        System.out.println("puertas: "+miCoche.numPuertas);
        miCoche.aumentarNumPuertas();
        miCoche.aumentarNumPuertas();
        miCoche.aumentarNumPuertas();
        System.out.println("puertas: "+miCoche.numPuertas);
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    static class Coche {
        private int numPuertas=0;

        public void aumentarNumPuertas() {
            this.numPuertas ++;
        }
    }
}

