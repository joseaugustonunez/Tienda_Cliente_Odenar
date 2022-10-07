package Tarea;

public class Tienda {
    private String nombre;
    private String direccion;
    private Cliente cliente[];
    private int contadorCliente;

    public Tienda() {
        this.cliente = new Cliente[9];

        this.contadorCliente = 0;
    }
    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;

        this.direccion = direccion;
    }
    public void agregarCliente(Cliente cliente){
        this.cliente[contadorCliente++] = cliente;
    }
    public Cliente[] getCliente(){
        return this.cliente;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void ordenarCodigo(){

        Cliente aux;
      
        for(int i=0; i<9-1; i++){
        for (int j=i+1; j<9; j++) {
				if (cliente[i].getCodigo() > cliente[j].getCodigo()) {
					aux = cliente[i];
					cliente[i] = cliente[j];
					cliente[j] = aux;
				}
        }
    } 
    System.out.println("--------ORDENADO POR CODIGO-------");
    for(int i=0;i<9;i++){
            System.out.println(" " + cliente[i].getNombre() + "," + cliente[i].getApellido() + ", " + cliente[i].getCodigo());
    }
}
    
}
