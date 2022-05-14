package hust.soict.hedspi.lab01;

import javax.swing.JOptionPane;

public class LinearEquation{
    public static void main(String[] args) {
        String stra11,stra12,strb1,stra21,stra22,strb2;
        stra11 = JOptionPane.showInputDialog(null, "Nhap he so a11: ");
        stra12 = JOptionPane.showInputDialog(null, "Nhap he so a12: ");
        strb1 = JOptionPane.showInputDialog(null, "Nhap ket qua 1 b1: ");
        stra21 = JOptionPane.showInputDialog(null, "Nhap he so a21: ");
        stra22 = JOptionPane.showInputDialog(null, "Nhap he so a22: ");
        strb2 = JOptionPane.showInputDialog(null, "Nhap ket qua 2 b2: ");
        double a11 = Double.parseDouble(stra11);
        double a12 = Double.parseDouble(stra12);
        double b1 = Double.parseDouble(strb1);
        double a21 = Double.parseDouble(stra21);
        double a22 = Double.parseDouble(stra22);
        double b2 = Double.parseDouble(strb2);
        double d = a11*a22 - a21 * a12;
        double d1 = b1*a22 - b2*a12;
        double d2 = b2*a11 - b1*a21;
        if (d != 0) {
            JOptionPane.showMessageDialog(null, "(x1,x2) = ("+d1/d+","+d2/d+")", "Result is: ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (d1 == 0 && d2 == 0) {
                JOptionPane.showMessageDialog(null, "Linear system has infinitely many solutions", "Result is: ", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Linear system has no solution", "Result is: ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
