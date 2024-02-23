/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scarsello;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
class alfiere {
    public String[][] scacchiera = new String[8][8];                                    //gestisco tutto cio che riguarda la scacchiera
    public void Alfiere(){
                scacchiera[2][0]="Bw";
                scacchiera[2][7]="Bb";
                scacchiera[7-2][0]="Bw";
                scacchiera[7-2][7]="Bb";
            
    
    }
    public char colorescacchiera(char[] mossa){
        
        int fila=mossa[1]-'a';
        int riga=mossa[2]-'0'-1;
        char[] casa=scacchiera[fila][riga].toCharArray();
        return casa[1];
    }
    
    
    
    
    public void turni(String tc){
    switch(tc){
        case "b":
            tc="w";
            break;
        
        case "w":
            tc="b";
            break;
    }
    input(tc);
    }
    
    
    
    
    
    
    public void input(String t){
    Scanner scan= new Scanner(System.in);
    String mossa=scan.nextLine();
    mossa+=t;
    char[] mossac=mossa.toCharArray();
    if(mossac.length>7){
        System.out.println("hai inserito male la mossa, reinseriscila");                //la mossa è piu lunga di 7 caratteri per forza ha sbagliato qualcosa    
        input(t);
    }
    if(controllol(mossac[1])){
        System.out.println("hai inserito male la mossa, reinseriscila");                //lutente sbaglia a mettere la lettera
        input(t);
    }
    if(controllon(mossac[2])){
        System.out.println("hai inserito male la mossa, reinseriscila");                //lutente sbaglia a mettere il numero
        input(t);    
    }
    if(controllol(mossac[4])){
        System.out.println("hai inserito male la mossa, reinseriscila");                //lutente sbaglia a mettere la lettera
        input(t);
    }
    if(controllon(mossac[5])){
        System.out.println("hai inserito male la mossa, reinseriscila");                //lutente sbaglia a mettere il numero
        input(t);
    }
    if(mossac[1]==mossac[4] && mossac[2]==mossac[5]){
        System.out.println("hai inserito male la mossa, reinseriscila");                //lutente mette casella di destinazione e di partenza uguali
        input(t);
    }
    if(controllop(mossac[0])){
        System.out.println("hai inserito male la mossa, reinseriscila");                //lutente ha inserito la pedina sbagliata puo inserire solo il bishop
        input(t);
    }
    if(controllomovimento(mossac)){
        System.out.println("hai inserito male la mossa, reinseriscila");                //lutente ha mosso in modo errato lalfiere
        input(t);
    }
    if(controllocolore(mossac)){
        System.out.println("quella non risulta essere la tua pedina");                //lutente ha scelto una pedina non su
        input(t); 
    }
    
    }
    //continuare con i controlli
    
    
    
    public boolean controllol(char lettera){
    boolean risultato=false;
    int asci=(int) lettera; 
    if(!(asci>96 && asci<105)){
    risultato=true;    
    }
    return risultato;    
    }
    
    public boolean controllon(char numeroc){
    boolean risultato=false;   
    int numero=numeroc - '0';   
    if(!(numero>0 && numero<9)){
        risultato=true;
    }
    
    return risultato;
    }
    
    public boolean controllop(char pedina){
    boolean risultato=false;
    if(pedina!='B'){
        risultato=true;
    }
        
    return risultato;    
    }
    
    public boolean controllomovimento(char[] mossa){
    boolean risultato=false;
    int li=(int) mossa[1];
    int lf=(int) mossa[4];
    int ni=mossa[2]-'0';
    int nf=mossa[5]-'0';
    int n=Math.abs(ni-nf);                      //valore assoluto
    int l=Math.abs(li-lf);
    if(n!=l){
        risultato=true;
    }
    return risultato;    
    }
    
    public boolean controllocolore(char[] mossa){
    boolean risultato=false;
    if(mossa[6]!=colorescacchiera(mossa)) {
    risultato=true;    
    }   
    return risultato;
                }
    }


