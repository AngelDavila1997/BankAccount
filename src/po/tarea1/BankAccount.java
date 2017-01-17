/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po.tarea1;

/**
 *
 * @author PC
 */
public class BankAccount {
    //Declaración de atributos
    private String numeroCuenta;
    private String titularCuenta;
    private double saldo;
    private String estado;
    
    //Constructor
    public BankAccount(){
        numeroCuenta="";
        titularCuenta="";
        saldo=0;
        estado="";
    }
    
    public BankAccount(String numeroCuenta, String titularCuenta, double saldo, String estado, String clave){
        this.numeroCuenta=numeroCuenta;
        this.titularCuenta=titularCuenta;
        this.saldo=saldo;
        this.estado=estado;
    }
    
    //numeroCuenta get and set
    public String obtenNumeroCuenta(){
        return numeroCuenta;
    }
    public void ponNumeroCuenta(String numeroCuenta){
        //Si el usuario envia una cadena vacia o null, la
        //propiedad numeroCuenta tendrá el valor de "Sin numero de cuenta definido";
        //sino tomara el valor enviado en el mensaje.
        if((numeroCuenta == null)|| (numeroCuenta == "")){
            this.numeroCuenta="Sin numero de cuenta definido";
        }else{
            this.numeroCuenta=numeroCuenta;
        }
    }
    
    //titularCuenta get and set
    public String obtenTitularCuenta(){
        return titularCuenta;
    }
    public void ponTitularCuenta(String titularCuenta){
        //Si el usuario envia una cadena vacia o null, la
        //propiedad titularCuenta tendrá el valor de "Sin titular de cuenta definido";
        //sino tomara el valor enviado en el mensaje.
        if((titularCuenta == null) || (titularCuenta == "")){
           this.titularCuenta="Sin titular de cuenta definido";
        }else{
           this.titularCuenta=titularCuenta;
        }
    }
    
    //saldo get and set
    public double obtenSaldo(){
        return saldo;
    }
    public void ponSaldo(double saldo){
        //Si el usuario envia un saldo menor que 0, se
        //enviara un mensaje que indique "El saldo es menor a $0.00;
        //sino tomara el valor enviado en el mensaje.
        if(saldo<0){
            System.out.print("El saldo es menor a $0.00");
        }else{
           this.saldo=saldo;
        }
    }
    
    //estado get and set
    public String obtenEstado(){
        return estado;
    }
    public void ponEstado(String estado){
        //Si el usuario envia una cadena vacia o null, la
        //propiedad estado tendrá el valor de "Sin estado definido";
        //sino tomara el valor enviado en el mensaje.
        if((estado == null) || (estado == "")){
            this.estado="Sin estado definido";
        }else{
            this.estado=estado;
        }
    }
    
    //Metodos
    public void deposito(double cantidad){
        //Si la cantidad enviada es menor a 0, se enviara un mensaje
        //indicando "La cantidad no es aceptable"; sino se sumara
        //la cantidad al saldo existente
        if(cantidad<0){
            System.out.print("La cantidad no es aceptable");
        }else{
            this.saldo = saldo + cantidad;
        }
    }
    
    public void retiro(double cantidad){
        //Si el saldo es mayor a 0 y la cantidad es mayor a 0
        //la cantidad se restara al saldo, sino se imprimira
        //"La operacion no fue exitosa"
        if((saldo>0) && (cantidad>0)){
           this.saldo = saldo - cantidad;
        }else{
            System.out.print("La operación no fue exitosa");
        }
        
    }
    
    public void mostrarSaldo(){
        //Se mostrara un resumen de lo que contiene la cuenta
        System.out.print("Información de la cuenta bancaria");
        System.out.print("Numero de cuenta: " + this.numeroCuenta);
        System.out.print("Titular: " + this.titularCuenta);
        System.out.print("Saldo: $" + this.saldo);
    }
}

