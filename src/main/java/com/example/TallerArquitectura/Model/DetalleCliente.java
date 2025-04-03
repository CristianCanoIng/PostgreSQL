package com.example.TallerArquitectura.Model;

import jakarta.persistence.*;

@Entity
public class DetalleCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String direccion;
    private String telefono;
    private String documento;

    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false, unique = true)
    private Cliente cliente;

    public DetalleCliente() {
    }

    public DetalleCliente(int id, String direccion, String telefono, String documento, Cliente cliente) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.documento = documento;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "DetalleCliente{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", documento='" + documento + '\'' +
                ", cliente=" + cliente.getNombre() +
                '}';
    }
}
