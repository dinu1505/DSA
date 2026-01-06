/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabbitproblem;

/**
 *
 * @author BAT SHOP
 */
public class RabbitProblem {

    /**
     * @param args the command line arguments
     */
     public static int rabbitPairs(int month) {
        if (month == 0 || month == 1) {
            return 1;
        }
        return rabbitPairs(month - 1) + rabbitPairs(month - 2);
    }
    public static void main(String[] args) {
         int month = 6;
        System.out.println("Rabbit pairs after " + month + " months: "
                + rabbitPairs(month));
    }
    
}
