package poojava;


/**
 * Write a description of class AnaGramaV2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnaGramaV2
{
   //{"laajsotf","jalasof","jasoftla","lopito","pedro"}
    //"jalasoft"
   public String [] anagramaJalita(String [] array,String palabra){
       int j=0;
       String [] respuesta= new String[array.length];
       int contPal=0;
       for(int i=0;i<array.length;i++){
           String actual=array[i];
           if(esAnagrama(actual,palabra)){
                   respuesta[j]=actual;
                   j++;
            }
        }
    return respuesta;
    }
public boolean esAnagrama(String palabrita, String patron ){
    boolean res=false;
    if(palabrita.length()==patron.length()){
        char[] StringtoChar = palabrita.toCharArray();
            int i=0;int j=0;
            while(i<patron.length()){
             while(j<StringtoChar.length){ 
           if(patron.charAt(i)==StringtoChar[j]){
              char temp= StringtoChar[j];
              StringtoChar[j]=StringtoChar[i];
              StringtoChar[i]= temp;
              i++;
              j=i;
            }else{
            j++;}
        }
    } //String devolver =StringtoChar.toString();
        String devolver=String.valueOf(StringtoChar);//
        if(devolver.compareTo(patron)==0) res=true;
    } 
    return res;
}
}
