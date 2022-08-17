/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue
 */
public class traduccion {
    String []letras={"a","á","b","c","d","e","é","f","g","h","i","í","j","k","l","m","n","ñ","o","ó","p","q","r","s","t","u","ú","v","w","x","y","z"," ","\n",",","."};
    String []codigo={"7","7","b","3","d","5","5","f","8","h","4","4","j","k","6","0","n","ñ","9","9","p","q","2","s","t","1","1","v","w","x","y","z"," ","\n",",","."};
    
    public String traducir(String texto){
        String trad="", textom, letra;
        
        textom = texto.toLowerCase();
        
        for(int i=1; i<=texto.length();i++){
            letra=textom.substring(i-1, i);
            for(int j=0; j<letras.length;j++){
                if(letra.equals(letras[j])){
                    trad=trad+codigo[j];
                }
            }
        }
        return trad;
    }
    
}
