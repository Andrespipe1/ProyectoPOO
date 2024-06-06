class ClaseA {
    private void metodoPrivado() {
        System.out.println("Este es un método privado de ClaseA");
    }

    public void llamarMetodoPrivadoDesdeThis() {
        this.metodoPrivado(); // Accediendo al método privado usando 'this'
    }
}

public class Main {
    public static void main(String[] args) {
        ClaseA objetoA = new ClaseA();
        // No se puede acceder directamente al método privado desde fuera de la clase
        // objetoA.metodoPrivado(); // Esto causaría un error de compilación

        // Pero sí se puede acceder al método privado usando un método público que lo invoque
        objetoA.llamarMetodoPrivadoDesdeThis();
    }
}
