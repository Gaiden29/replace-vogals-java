/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptofrase;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CriptoFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase = new String();
        frase = JOptionPane.showInputDialog("Digite uma frase:");
       
        String vogal[] = {"a","e","i","o","u","A","E","I","O","U"};
        for(int i = 0;i < vogal.length;i++){
            
      
            if (frase.contains(vogal[i])==true){
            
               frase = frase.replaceAll(vogal[i], "*");
            
            }
            
        }
        JOptionPane.showMessageDialog(null, frase);
    
    }
}
