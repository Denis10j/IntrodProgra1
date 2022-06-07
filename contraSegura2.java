package poojava;

public class contraSegura2
{
    private String cadena;
    private int contDig;
    private int contMay;
    private int contMin;
    private int contEsp;
    private String mens1;
    private String mens2;
    private String mens3;
    private String mens4;
    private String mens5;
    
    public contraSegura2(String cadena){
    this.cadena=cadena;
    this.contDig=0;
    this.contMay=0;
    this.contMin=0;
    this.contEsp=0;
    }
    public String contraseniaSeg(){
     String res="The Password is Debil";
    
    for(int i=0;i<cadena.length();i++){
     char c=cadena.charAt(i);
        if(esDigito(c))   contDig++;
          if(esMayuscula(c)) contMay++;
            if(esMinuscula(c)) contMin++;
              if(esCaracterEspecial(c)); contEsp++;
            }

      if(cadena.length()<12)System.out.println("porfavor ingrese una al menos Dos Caracteres");
            else if(contDig<2) System.out.println("porfavor ingrese una al menos Dos Digitos");
              else  if(contMin<3)  System.out.println("porfavor ingrese una al menos Tres minusculas");
                 else if(contMay<3) System.out.println("porfavor ingrese una al menos Tres Mayusculas");
                  else if(contEsp<2) System.out.println("porfavor ingrese una al menos Dos Caracteres Especiales");
                else {
         System.out.println("La contrasenia es strong");
        }
                return res;
            }   
        
    private boolean esDigito(char d){
       return ('0'<=d&&d<='9');
    }
    private boolean esMinuscula(char c){
       return ('a'<=c&&c<='z');
    }
     private boolean esMayuscula(char c){
       return ('A'<=c&&c<='Z');
    }
    private boolean esCaracterEspecial(char c){
      return ('!'<=c&&c<='/');
    }
    }
    

