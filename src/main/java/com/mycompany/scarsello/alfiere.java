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
    public void Scacchiera(){
        System.out.println("Ecco un tutorial su come muovere un alfiere all'interno della scacchiera:\n" +
"\n" +
"**La scacchiera:**\n" +
"\n" +
"La scacchiera è composta da 64 caselle, divise in una griglia 8x8 di caselle quadrate alternativamente bianche e nere. Le colonne sono etichettate dalle lettere \"a\" a \"h\" da sinistra a destra, mentre le righe sono numerate da \"1\" a \"8\" dall'alto verso il basso. Questo sistema di etichettatura fornisce un modo conveniente per individuare ciascuna casella sulla scacchiera. Ad esempio, la casella in basso a sinistra è \"a1\", mentre quella in alto a destra è \"h8\".\n" +
"\n" +
"**Muovere l'alfiere:**\n" +
"\n" +
"L'alfiere può muoversi lungo le diagonali della scacchiera. Ogni mossa dell'alfiere deve avanzare lungo una diagonale, quindi può muoversi solo su caselle dello stesso colore in cui si trova inizialmente. Ci sono due alfieri per ciascun giocatore, uno sulla casella bianca e l'altro sulla casella nera. Quindi, inizialmente, ogni giocatore ha un alfiere che si muove solo su caselle bianche e un altro che si muove solo su caselle nere.\n" +
"\n" +
"**Regole per muovere l'alfiere:**\n" +
"\n" +
"1. L'alfiere può muoversi in qualsiasi direzione lungo una diagonale libera, senza limiti di distanza.\n" +
"\n" +
"2. Quando muovi un alfiere, devi rispettare il principio che l'alfiere rimane sempre sulla casella dello stesso colore. Ad esempio, se l'alfiere si trova su una casella bianca, può muoversi solo su altre caselle bianche lungo le diagonali.\n" +
"\n" +
"3. L'alfiere può saltare sopra altre pedine sulla scacchiera, ma non può saltare sopra pedine dello stesso colore.\n" +
"\n" +
"**Esempi di mosse valide per l'alfiere:**\n" +
"\n" +
"1. L'alfiere situato in c1 può muoversi sulla diagonale c1-h6, passando per le caselle d2, e6 e g3, ad esempio, in qualsiasi ordine.\n" +
"\n" +
"2. L'alfiere situato in e4 può muoversi sulla diagonale e4-b1, passando per le caselle d3 e c2, ad esempio, in qualsiasi ordine.\n" +
"\n" +
"**Esempi di mosse non valide per l'alfiere:**\n" +
"\n" +
"1. L'alfiere situato in f3 non può muoversi sulla diagonale f3-f6, poiché questa non è una diagonale valida per un alfiere.\n" +
"\n" +
"2. L'alfiere situato in a8 non può muoversi sulla diagonale a8-h2, poiché non rispetta il principio che l'alfiere deve restare sullo stesso colore di casella.\n" +
"\n" +
"3. L'alfiere situato in c5 non può muoversi sulla diagonale c5-g7, poiché questa mossa attraverserebbe una casella di colore diverso da quella di partenza.\n" +
"\n" +
"Ricorda che le mosse degli alfieri sono fondamentali per creare strategie vincenti in una partita di scacchi. Pratica questi movimenti e presto diventerai più sicuro nell'utilizzo di questo potente pezzo! Buon divertimento!");    
        String[][] scacchiera = new String[8][8];                                    
                scacchiera[2][0]="Bw";
                scacchiera[2][7]="Bb";
                scacchiera[7-2][0]="Bw";
                scacchiera[7-2][7]="Bb";
                input(scacchiera);
            
    
    }
    public void mossa(char[] mossa, String[][] scacchiera){
    int Ri=(int) mossa[1]-96;
    int Ci=mossa[2]-'0';    
    int Rf=(int) mossa[4]-96;
    int Cf=mossa[5]-'0';
    
    String pedina=scacchiera[Ri][Ci];
    scacchiera[Ri][Ci]=null;
    scacchiera[Rf][Cf]=pedina;
        System.out.println("pedina mossa in "+ mossa[4]+mossa[5]);
        input(scacchiera);
    }
    
    
    
    
    public void input(String[][] scacchiera){
        System.out.println("inserire la mossa");
    Scanner scan= new Scanner(System.in);
    String mossa=scan.nextLine();
    char[] mossac=mossa.toCharArray();
    if(mossac.length>6){
        System.out.println("hai inserito male la mossa, reinseriscila");                //la mossa è piu lunga di 7 caratteri per forza ha sbagliato qualcosa    
        input(scacchiera);
    }
    System.out.println("llll");
    if(controllol(mossac[1])){
        System.out.println("hai inserito male la lettera, reinseriscila");                //lutente sbaglia a mettere la lettera
        input( scacchiera);
    }System.out.println("llll");
    if(controllon(mossac[2])){
        System.out.println("hai inserito male il numero, reinseriscila");                //lutente sbaglia a mettere il numero
        input( scacchiera);    
    }System.out.println("llll");
    if(controllol(mossac[4])){
        System.out.println("hai inserito male la lettera, reinseriscila");                //lutente sbaglia a mettere la lettera
        input( scacchiera);
    }System.out.println("llll");
    if(controllon(mossac[5])){
        System.out.println("hai inserito male la lettera, reinseriscila");                //lutente sbaglia a mettere il numero
        input( scacchiera);
    }System.out.println("llll");
    if(mossac[1]==mossac[4] && mossac[2]==mossac[5]){
        System.out.println("così la pedina non si muove, reinseriscila");                //lutente mette casella di destinazione e di partenza uguali
        input( scacchiera);
    }System.out.println("llll");
    if(controllop(mossac[0])){
        System.out.println("puoi muovere solo il bishop, reinseriscila");                //lutente ha inserito la pedina sbagliata puo inserire solo il bishop
        input( scacchiera);
    }System.out.println("llll");
    
    if(controllopedina(mossac, scacchiera)){
        System.out.println("qui non c'è nulla");                  //lutente ha scelto un posto dove non c'è nulla
        input(scacchiera); 
    }System.out.println("llll");
    Alfiere(mossac, scacchiera);
    }
    
    
    
    
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
    public boolean controllopedina(char[] mossa, String[][] scacchiera ){
        boolean risultato=false; 
        int ri=(int) mossa[1]-97;
         int co=mossa[2]-'0'-1;
         if(scacchiera[ri][co]==null){
         risultato=true;    
         }
        return risultato;
    }
    
    public void Alfiere(char[] mossac, String[][] scacchiera){
    if(controllomovimento(mossac)){
        System.out.println("l'alfiere non si muove così, reinseriscila");                //lutente ha mosso in modo errato lalfiere
        input(scacchiera);
    }System.out.println("llll");     
    int nm = 0;
    int[] cicli=new int[4];
    int c=0;
    int larray = 0;
    int ri=(int) mossac[1]-96;
    int co=mossac[2]-'0';
    boolean verifica=false;
        System.out.println(ri +" "+co);
    
    if(8-co<8-ri){
    nm+=(8-co);    
    }else{                                                          //tutti questi if calcolano qnuante mosse puo fare lalfiere, mi serve anche per capire come fare a prevedere tutte le altre mosse
    nm+=(8-ri);     
    }
    
    if(8-co<ri-1){
    nm+=(8-co);    
    }else{
    nm+=(ri-1);
    }
    
    if(co-1<8-ri){
    nm+=(co-1);        
    }else{
    nm+=(8-ri);        
    }
    
    if(co-1<ri-1){
    nm+=(co-1);    
    }else{
    nm+=(ri-1);    
    }
        System.out.println(nm);
        
        
    
    
    mossa(mossac, scacchiera);
    }


}


