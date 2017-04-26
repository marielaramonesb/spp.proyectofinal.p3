/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyectofinal.p3;
import javax.swing.JOptionPane;
/*Equipo:
*Lisdy Rohmann A00513659
*Alejandro García A0161137
*Kevin Hinojosa A01411383
*Mariela Ramones A01441449
*Catalina Domínguez A01411583
*/

public class SppProyectofinalP3 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int op=JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menu de Opciones",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"Máximo común divisor", "Mínimo común múltiplo", "Salir"}, "Salir");
        int num1, num2;
        switch (op){
            case 0:
                num1=solicitarNum("Primer número");
                num2=solicitarNum("Segundo número");
                maxcDiv(num1,num2);
                cont();
                break;
            case 1:
                num1=solicitarNum("Primer número");
                num2=solicitarNum("Segundo número");
                mincMul(num1,num2);
                cont();
                break;
            case 2:
                System.exit(0);
        }
    }
    
    public static int solicitarNum(String men){
        boolean flag;
        int x=0;
        do{
            try{
             String res=JOptionPane.showInputDialog(null, "Escribe "+men); 
             x=Integer.parseInt(res);
             flag=true;
            }catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "ERROR, vuelva a intentarlo");
             flag=false;
            }
        }
        while(flag==false);
        return x;
    }
    
    public static void maxcDiv(int n1, int n2){
        int mcd;
        while(n1 != n2)
            if(n1 > n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        JOptionPane.showMessageDialog(null, "El máximo común divisor es: " + n1);
    }
    
    public static void mincMul(int n1, int n2){
        int mcm = 1;
        int x=2;
        while(x <= n1 || x <= n2)
        {
            if(n1 == 0 || n2%x == 0)
            {
            mcm=mcm*x;
            if(n1%x == 0) n1=n1/x;
            if(n2%x == 0) n2=n2/x;
            }
            else
                x=x+1;               
        }                        
        JOptionPane.showMessageDialog(null, "El mínimo común múltiplo es: " +mcm);            
    }
    
    public static void cont(){
        int res=JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Pregunta de Continuidad",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"Sí", "No"}, "Sí");
        switch (res){
            case 0:
                menu();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                System.exit(0);
        }
    }
    
}

