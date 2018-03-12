package Clases;

public class Metodos {
    //metodo para reconocer el punto
    public boolean punto(String punto){
        boolean resultado = false;
        for(int i=0; i<punto.length(); i++){
            if(punto.substring(i, i+1).equals(".")){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    //metodo para hacer los calculos
    public String HacerCalculo(String Temporal01, String Temporal02,String signo){
        String Solucion;
        Double Resultado=0.0;
        
        if(signo.equals("-")){
            Resultado = Double.parseDouble(Temporal01)-Double.parseDouble(Temporal02);
        }
        if(signo.equals("+")){
            Resultado = Double.parseDouble(Temporal01)+Double.parseDouble(Temporal02);
        }
        if(signo.equals("*")){
            Resultado = Double.parseDouble(Temporal01)*Double.parseDouble(Temporal02);
        }
        if(signo.equals("/")){
            Resultado = Double.parseDouble(Temporal01)/Double.parseDouble(Temporal02);
        }
        if(signo.equals("=")){
            Resultado = Double.parseDouble(Temporal01);
        }
        return  Solucion=Resultado.toString();
    }
}
