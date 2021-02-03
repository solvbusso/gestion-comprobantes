package modelos;

public class Comprobante {

    private int sucursal;
    private int codigo;
    private String cliente;

    public Comprobante(int sucursal, int codigo, String cliente) {
        this.sucursal = sucursal;
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Comprobante{" +
                "sucursal=" + sucursal +
                ", codigo=" + codigo +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
