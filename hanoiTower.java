/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TowerOfHanoi;

/**
 *
 * @author BAT SHOP
 */
public class hanoiTower {
     public static void solve(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solve(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, 'A', 'B', 'C');
    }
}
