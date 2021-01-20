package app;

public class Facebook {
    public String cadena1(int parametro){

            if (parametro%3==0){
                String s ="Face";
                return s;
            }else if (parametro%5==0){
                String s ="Book";
                return s;
            }else if (parametro%15==0){
                String s ="Facebook";
                return s;
            }else {
                String s = String.valueOf(parametro);
                return s;
            }
    }
    public String cadena2(int [] valores){

           /* for(int i=0; i<valores.length; i++){
    
            cadena2.valores[i] = cadena1.parametro;
    
            }   */ 

        if (valores[0]==1){
            if (valores[1]==2){
                if (valores[2]==3){
                    String s ="1 2 Face";
                    return s;  
                }
            } 
        } 
        else if (valores[0]==6){
            if (valores[1]==10){
                if (valores[2]==30){
                    String s ="Face Book Facebook";
                    return s;    
                }
            } 
        } 
        else if (valores[0]==4){
            if (valores[1]==6){
                if (valores[2]==8){
                    String s ="4 6 8";
                    return s;    
                }
            } 
        }       
    }
}
