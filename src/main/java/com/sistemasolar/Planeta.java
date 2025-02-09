package com.sistemasolar;

public class Planeta {

    String nombre = null;
    int cantidadSatelites = 0;
    double volumenKm = 0;
    int diametro = 0;
    int distanciaMediaSol = 0;
    boolean observableSimpleVista = false;
    enum tipoPlaneta {GASEOSOS, TERRESTRE, ENANO}
    tipoPlaneta tipo;

    public Planeta(String nombre, int cantidadSatelites, double volumenKm, int diametro, int distanciaMediaSol,
            boolean observableSimpleVista, tipoPlaneta tipo) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.volumenKm = volumenKm;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.observableSimpleVista = observableSimpleVista;
        this.tipo = tipo;
    }

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCantidadSatelites() {
        return cantidadSatelites;
    }



    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }



    public double getVolumenKm() {
        return volumenKm;
    }



    public void setVolumenKm(double volumenKm) {
        this.volumenKm = volumenKm;
    }



    public int getDiametro() {
        return diametro;
    }



    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }



    public int getDistanciaMediaSol() {
        return distanciaMediaSol;
    }



    public void setDistanciaMediaSol(int distanciaMediaSol) {
        this.distanciaMediaSol = distanciaMediaSol;
    }



    public boolean isObservableSimpleVista() {
        return observableSimpleVista;
    }



    public void setObservableSimpleVista(boolean observableSimpleVista) {
        this.observableSimpleVista = observableSimpleVista;
    }



    public tipoPlaneta getTipo() {
        return tipo;
    }



    public void setTipo(tipoPlaneta tipo) {
        this.tipo = tipo;
    }



    public void imprimirPantalla(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidadSatelites + " satelites");
        System.out.println("Volumen: " + volumenKm + " Km^3");
        System.out.println("Diametro en Km: " + diametro + " Km");
        System.out.println("Distancia media del Sol: " + distanciaMediaSol + " millones de Km");
        System.out.println("Observable a simple vista: " + observableSimpleVista);
        System.out.println("Tipo de planeta:  " + tipo);

    } 

    public double densidadPlaneta(double masaPlaneta){
        
        return masaPlaneta / volumenKm;
    }
    
    // public String tipoPlaneta(int tipo){
      
    //     return planetaTipo;
    // }

    public boolean planetaExterior(int distanciaMediaSol){
        boolean planetaExterior;
        double UA = 149597870;
        if(distanciaMediaSol >= (2.1*UA) && distanciaMediaSol <=(3.4*UA)){
            planetaExterior=true;
        }
        else{
            planetaExterior=false;
        }
        return planetaExterior;
    }

    
}
