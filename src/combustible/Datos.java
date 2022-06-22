/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combustible;

public class Datos {
    String placa;
    String Nombre;
    String Cedula; // por qué String y no int? porque no vamos a sumar cedulas :v 

    public Datos() {
        this.placa = "";
        this.Nombre = "";
        this.Cedula = "";
    }
    
   //metodos a usar
    
    public String datosConductor(){
        String cad="Nombre: "+getNombre()+"  Cédula:  "+getCedula()+"  Placa: "+getPlaca();
        return cad;
    }
    
    public int costoBalanceo(int balan){
        if(balan==0){
            return 0;
        }else{
            return 20000;
        }
    }
    
    public int costoLlenarTanque(int tipoC,int cant){
        if(tipoC==0){
            return cant*1000;
        }else{
            return cant*400;
        }
    }
    
    public int cambioA(int seCambia, boolean boton5cuartos){
        if(seCambia==0){
            return 0;
        }else{
            if(boton5cuartos){
                return 150000*5;
            }else{
                return 150000*6;
            }
        }
    }
    
    public int costoAditivos(int ad){ 
            return ad*10000;
    }
    
    public int costoLavado(int lavado){
        if(lavado==0){
            return 0;
        }else{
            return 10000;
        }
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
}
