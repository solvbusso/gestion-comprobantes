package modelos;

import java.util.List;

public class Factura extends Comprobante {

    private char tipo;
    private int monto;
    private String vendedor;
    private boolean tieneRemito;

    public Factura(int sucursal, int codigo, String cliente, char tipo, int monto, String vendedor, boolean tieneRemito) {
        super(sucursal, codigo, cliente);
        this.tipo = tipo;
        this.monto = monto;
        this.vendedor = vendedor;
        this.tieneRemito = tieneRemito;
    }

    public char getTipo() {
        return tipo;
    }

    public double getMonto() {

        double IVA = 0;
        if (monto < 1000) {
            IVA = 0.10;
        } else {
            IVA = 0.21;
        }

        double montoTotal = monto + IVA * monto;
        return montoTotal;
    }

    public String getVendedor() {
        return vendedor;
    }

    public boolean isTieneRemito() {
        return tieneRemito;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setTieneRemito(boolean tieneRemito) {
        this.tieneRemito = tieneRemito;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "sucursal=" + getSucursal() +
                ", codigo=" + getCodigo() +
                ", cliente='" + getCliente() + '\'' +
                ", tipo=" + tipo +
                ", monto=" + getMonto() +
                ", vendedor='" + vendedor + '\'' +
                ", tieneRemito=" + tieneRemito +
                '}';
    }
}
