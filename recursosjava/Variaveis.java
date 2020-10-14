package recursosjava;

public class Variaveis { // Classe
    
    public static void main(String[] args) { //Método Main
        //Declaração e Atribuição de Variáveis
        //Java tem Variáveis Primitivas e Variáveis Classe
        
        //Variáveis Tipo Classe - Objetos /Familias que contem diversas Operações e Metodos de Cada Estrutura Java
        String    str01 = new String("Hello World!"); 
        String    str02; 
        str02 =   str01;
        Byte      byte01 = new Byte("1");
        Short     shr01  = new Short("2");
        Integer   int01  = new Integer(10); 
        Double    db01   = new Double(10.00);
        Float     fl01   = new Float(30.00);
        Long      lg01   = new Long((long) 50.000);
        Character ch01   = new Character('M');
        Boolean   bool01 = new Boolean(true);
        
        System.out.println("IMPRIMINDO VARIÁVEIS TIPO CLASSE");
        System.out.println("String    - " + str01);
        System.out.println("String    - " + str02);
        System.out.println("String    - " + str01 + " " + str02);
        System.out.println("Byte      - " + byte01);
        System.out.println("Short     - " + shr01);
        System.out.println("Integer   - " + int01);
        System.out.println("Double    - " + db01);
        System.out.println("Float     - " + fl01);
        System.out.println("Long      - " + lg01);
        System.out.println("Character - " + ch01);
        System.out.println("Boolean   - " + bool01);
        
        System.out.println("IMPRIMINDO O MIN E MAX VALUE DOS TIPOS CLASSE");
        System.out.println("Byte    MIN VALUE : " + Byte.MIN_VALUE + " MAX VALUE : " + Byte.MAX_VALUE);
        System.out.println("Short   MIN VALUE : " + Short.MIN_VALUE + " MAX VALUE : " + Short.MAX_VALUE);
        System.out.println("Integer MIN VALUE : " + Integer.MIN_VALUE + " MAX VALUE : " + Integer.MAX_VALUE);
        System.out.println("Double  MIN VALUE : " + Double.MIN_VALUE + " MAX VALUE : " + Double.MAX_VALUE);
        System.out.println("Float   MIN VALUE : " + Float.MIN_VALUE + " MAX VALUE : " + Float.MAX_VALUE);
        System.out.println("Long    MIN VALUE : " + Long.MIN_VALUE + " MAX VALUE : " + Float.MAX_VALUE);
        System.out.println("Character MIN VALUE : " + Character.MIN_VALUE + " MAX VALUE : " + Character.MAX_VALUE);
        
        //Declarando Variáveis do Tipo Primitivo
        byte    byte02 = 1;
        short   shr02  = 2; 
        int     int02  = 20;
        double  db02   = 20.00;
        float   fl02   = 40.00F;
        long    lg02   = (long) 60.000;          
        char    ch02   = 'F';
        char    ch03 = '\u0041'; // Usando caractere Unicode
        boolean bool02 = false;
        
        System.out.println("IMPRIMINDO VARIÁVEIS DE TIPOS PRIMITIVOS");
        System.out.println("byte    - " + byte02);
        System.out.println("short   - " + shr02);
        System.out.println("Int     - " + int02 );
        System.out.println("double  - " + db02);
        System.out.println("float   - " + fl02);
        System.out.println("long    - " + lg02);
        System.out.println("char    - " + ch02);
        System.out.println("char    - " + ch03);
        System.out.println("boolean - " + bool02);
        
    }
}