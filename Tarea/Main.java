package Tarea;


public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.setNombre("Tienda Don Juan");
        tienda.setDireccion("Jr.Huánuco");
        tienda.agregarCliente(new Cliente("Jose","Nunez Vicente",20000000));
        tienda.agregarCliente(new Cliente("Juan","Mamani Quispe",10000000));
        tienda.agregarCliente(new Cliente("Maria","Gonzales Murga",50000000));
        tienda.agregarCliente(new Cliente("Ivan","Martel Gimenes",90000000));
        tienda.agregarCliente(new Cliente("Antonio","Vicente Rojas",40000000));
        tienda.agregarCliente(new Cliente("Joel","Quontero Meza",60000000));
        tienda.agregarCliente(new Cliente("Marta","Gonzales Marin",30000000));
        tienda.agregarCliente(new Cliente("Ivana","Gusman Portral",80000000));
        tienda.agregarCliente(new Cliente("Ariana","Grande Perez",70000000));          
        System.out.println("Nombre de tienda: " + tienda.getNombre() + ", Direccion: " + tienda.getDireccion());

        for (Cliente clien: tienda.getCliente()){
            System.out.println(" " + clien.getNombre() + "," + clien.getApellido() + ", " + clien.getCodigo());
        }
        tienda.ordenarCodigo();
    }
}
