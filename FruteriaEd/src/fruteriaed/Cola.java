package fruteriaed;

public class Cola {

    Cliente cola[] = new Cliente[200];
    int nclientes;
    Cliente despachados[] = new Cliente[200];
    int despacho = 0;
    int adelantos=0;

    public Cola(int n) {
        this.nclientes = n;
        for (int i = 0; i < this.nclientes; i++) {
            int edadA = (int) Math.round((Math.random() * 50) + 10);
            this.cola[i] = new Cliente(i + 1, edadA);
        }
    }

    public void aniadirCliente() {
        this.nclientes++;
        int edadA = (int) Math.round((Math.random() * 50) + 10);
        this.cola[nclientes] = new Cliente(nclientes + 1, edadA);
    }

    public void mostrar() {
        System.out.print("En la cola estan los clientes: \n");
        for (int i = 0; i < nclientes; i++) {
            System.out.print(this.cola[i]);
        }
    }

    public void despachar() {
        this.despachados[despacho] = this.cola[0];
        despacho++;
        this.cola[0] = null;
        this.adelantar();
        nclientes--;
    }

    public void adelantar() {
        this.cola[0]=null;
        this.adelantos++;
        for (int i = 1; i < nclientes; i++) {
            if(this.adelantos>this.nclientes){
                System.out.println("No se puede adelantar mas");
            }else{
                this.cola[i] = this.cola[i - 1];
            }
            
        }
    }

    public void retrasar() {
        for (int i = 1; i < nclientes; i++) {
            if (this.nclientes == this.cola.length) {
                System.out.println("La cola esta llena");
            } else {
                this.cola[i] = this.cola[i + 1];
            }
        }
        nclientes++;
    }

    public void mostrarDespachados() {
        System.out.print("\n ---------------------- \n");
        System.out.println("Clientes Despachados:");
        System.out.println(this.despacho);
        for (int i = 0; i < despacho; i++) {
            System.out.print(this.despachados[i]);
        }
        System.out.println("----------------------");
    }

    /*
    @Override
    public String toString() {
        String res;
        res="En la cola esta los clientes: \n";
        for (int i = 0; i < cola.length; i++) {
            res+=this.cola[i];
        }
         return res;         
    }
     */
}
