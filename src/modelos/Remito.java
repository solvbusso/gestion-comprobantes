package modelos;

public class Remito extends Comprobante{

    private int fechaDeEntrega;
    private boolean estaFirmado;

    public Remito(int sucursal, int codigo, String cliente, int fechaDeEntrega, boolean estaFirmado) {
        super(sucursal, codigo, cliente);
        this.fechaDeEntrega = fechaDeEntrega;
        this.estaFirmado = estaFirmado;
    }

    public int getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public boolean isEstaFirmado() {
        return estaFirmado;
    }

    public void setFechaDeEntrega(int fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public void setEstaFirmado(boolean estaFirmado) {
        this.estaFirmado = estaFirmado;
    }

    @Override
    public String toString() {
        return "Remito{" +
                ", sucursal=" + getSucursal() +
                ", codigo=" + getCodigo() +
                ", cliente='" + getCliente() + '\'' +
                ", fechaDeEntrega=" + fechaDeEntrega +
                ", estaFirmado=" + estaFirmado +
                '}';
    }
}
