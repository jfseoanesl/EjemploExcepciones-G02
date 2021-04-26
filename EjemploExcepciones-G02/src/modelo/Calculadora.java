package modelo;

public class Calculadora {
    
    public static int dividir(int n, int d) throws ExcepcionPropia {
       
        if(d==0)
            throw new ExcepcionPropia("NO se puede dividir por cero");
        
        return  n/d;
       
    }
    
    public static double raiz(int n)throws ExcepcionPropia{
        if(n<0)
            throw new ExcepcionPropia("No se puede calcular raiz de numero negativo");
        
        return Math.sqrt(n);
    }
}
