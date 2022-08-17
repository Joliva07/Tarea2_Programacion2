/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue
 */

import java.util.StringTokenizer;
public class AnalisisTexto {
    
    public String tamaño(String longitud){
        String resultado=Integer.toString(longitud.replace(" ", "").replace("\n", "").length());
        return resultado;
    }
    public String totalpalabras(String texto){
        String resultado;
        StringTokenizer Cant= new StringTokenizer(texto);
        int contador=Cant.countTokens();
        resultado=Integer.toString(contador);
        return resultado;
    }
    public String PrimeraP(String texto){
        String resultado;
        String [] Prp=texto.split("\\s");
        resultado=Prp[0];
        return resultado;
    }
    public String PalabraC(String texto){
        String resultado;
        String [] Prp=texto.split("\\s");
        int tam=Prp.length;
        if(tam%2==0){
            resultado=Prp[(tam/2)-1]+" y "+Prp[tam/2];
        }else{
            resultado=Prp[(tam/2)];
        }
        return resultado;
    }
    public String UltimaP(String texto){
        String resultado;
        String [] Prp=texto.split("\\s");
        int cant=Prp.length;
        resultado=Prp[cant-1];
        return resultado;
    }
    public String PrimeraL(String texto){
        String resultado;
        String textoc=texto.replace(" ", "");
        char[]Pl=textoc.toCharArray();
        resultado=String.valueOf(Pl[0]);
        return resultado;
    }
    public String UltimaL(String texto){
        String resultado;
        String textoc=texto.replace(" ", "");
        char[]Ul=textoc.toCharArray();
        int cant=Ul.length;
        resultado=String.valueOf(Ul[cant-1]);
        return resultado;
    }
    public String LetraCen(String texto){
        String resultado;
        String textoc=texto.replace(" ", "");
        char [] Lc=textoc.toCharArray();
        int cent=Lc.length;
        if(cent%2==0){
            resultado="'"+String.valueOf(Lc[(cent/2)-1])+"' y '"+String.valueOf(Lc[(cent/2)])+"'";
        }else{
            resultado=String.valueOf(Lc[(cent/2)]);
        }
        return resultado;
    }
    public String LetrasA(String texto){
        String resultado;
        char[] LetraA=texto.toCharArray();
        int res=0;
        for(int i=0;i<LetraA.length;i++){
            if(LetraA[i]=='a'||LetraA[i]=='A'||LetraA[i]=='á'){
                res++;
            }
        }
        resultado=Integer.toString(res);
        return resultado;
    }
    public String LetrasE(String texto){
        String resultado;
        char[] LetraA=texto.toCharArray();
        int res=0;
        for(int i=0;i<LetraA.length;i++){
            if(LetraA[i]=='e'||LetraA[i]=='E'||LetraA[i]=='é'){
                res++;
            }
        }
        resultado=Integer.toString(res);
        return resultado;
    }
    public String LetrasI(String texto){
        String resultado;
        char[] LetraA=texto.toCharArray();
        int res=0;
        for(int i=0;i<LetraA.length;i++){
            if(LetraA[i]=='i'||LetraA[i]=='I'||LetraA[i]=='í'){
                res++;
            }
        }
        resultado=Integer.toString(res);
        return resultado;
    }
    public String LetrasO(String texto){
        String resultado;
        char[] LetraA=texto.toCharArray();
        int res=0;
        for(int i=0;i<LetraA.length;i++){
            if(LetraA[i]=='o'||LetraA[i]=='O'||LetraA[i]=='ó'){
                res++;
            }
        }
        resultado=Integer.toString(res);
        return resultado;
    }
    public String LetrasU(String texto){
        String resultado;
        char[] LetraA=texto.toCharArray();
        int res=0;
        for(int i=0;i<LetraA.length;i++){
            if(LetraA[i]=='u'||LetraA[i]=='U'||LetraA[i]=='ú'){
                res++;
            }
        }
        resultado=Integer.toString(res);
        return resultado;
    }
    public String PalabrasPar(String texto){
        String resultado;
        int contador=0;
        String textoc=texto.replace("\n", " ");
        String [] Pp=textoc.split("\\s");
        for(int i=0;i<Pp.length;i++){
            int tam=Pp[i].length();
            if(tam%2==0 && tam!=1){
                contador++;
            }
        }
        resultado=Integer.toString(contador);
        return resultado;
    }
    public String PalabrasImpar(String texto){
        String resultado;
        int contador=0;
        String textoc=texto.replace("\n", "");
        String [] Pp=textoc.split("\\s");
        for(int i=0;i<Pp.length;i++){
            int tam=Pp[i].length();
            if(!(tam%2==0)||tam==1){
                contador++;
            }
        }
        resultado=Integer.toString(contador);
        return resultado;
    }
}
