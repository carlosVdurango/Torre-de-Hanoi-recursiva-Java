public class Hanoi {
    static void main() {
        int n=4;
        move(n,'A','C','B');
    }

    static void move(int n, char origen, char destino, char auxiliar) {
        if (n==1) {
            System.out.println("Mover disco "+n+" desde "+origen+" hacia "+destino);
        } else {
            move(n-1, origen, destino, auxiliar);
            System.out.println("Mover disco "+n+" desde "+origen+" hacia "+destino);
            move(n-1, origen, auxiliar, destino);
        }
    }

}
