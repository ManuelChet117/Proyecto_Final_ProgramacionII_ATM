/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

public class login {
   private int idcuenta;
   private String cuenta;
   private String nombre; 
   private String pass;
   private double saldo;

    public login() {
    }

    public login(int idcuenta, String cuenta, String nombre, String pass, double saldo) {
        this.idcuenta = idcuenta;
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.pass = pass;
        this.saldo = saldo;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
   
   
}
