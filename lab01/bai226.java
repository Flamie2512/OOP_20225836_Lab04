import javax.swing.JOptionPane;

public class bai226 {
    public static void main(String[] args) {
        String stra, strb;
        stra = JOptionPane.showInputDialog(null,
                "Nhap a: ", "Phuong trinh bac nhat 1 an",
                JOptionPane.INFORMATION_MESSAGE);
        strb = JOptionPane.showInputDialog(null,
                "Nhap b: ", "Phuong trinh bac nhat 1 an",
                JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        String x = "";

        if (a == 0) {
            if (b == 0) {
                x = "Phuong trinh co vo so nghiem";
            } else {
                x = "Phuong trinh vo nghiem";
            }
        } else {
            x = "Phuong trinh co nghiem x = " + String.valueOf(-b / a);
        }

        JOptionPane.showMessageDialog(null, x);

        String stra11, stra12, strb1, stra21, stra22, strb2;
        stra11 = JOptionPane.showInputDialog(null,
                "Nhap a11: ", "Phuong trinh bac nhat 2 an",
                JOptionPane.INFORMATION_MESSAGE);
        stra12 = JOptionPane.showInputDialog(null,
                "Nhap a12: ", "Phuong trinh bac nhat 2 an",
                JOptionPane.INFORMATION_MESSAGE);
        strb1 = JOptionPane.showInputDialog(null,
                "Nhap b1: ", "Phuong trinh bac nhat 2 an",
                JOptionPane.INFORMATION_MESSAGE);
        stra21 = JOptionPane.showInputDialog(null,
                "Nhap a21: ", "Phuong trinh bac nhat 2 an",
                JOptionPane.INFORMATION_MESSAGE);
        stra22 = JOptionPane.showInputDialog(null,
                "Nhap a22: ", "Phuong trinh bac nhat 2 an",
                JOptionPane.INFORMATION_MESSAGE);
        strb2 = JOptionPane.showInputDialog(null,
                "Nhap b2: ", "Phuong trinh bac nhat 2 an",
                JOptionPane.INFORMATION_MESSAGE);

        double a11 = Double.parseDouble(stra11);
        double a12 = Double.parseDouble(stra12);
        double b1 = Double.parseDouble(strb1);
        double a21 = Double.parseDouble(stra21);
        double a22 = Double.parseDouble(stra22);
        double b2 = Double.parseDouble(strb2);

        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "He phuong trinh co nghiem duy nhat: x1 = " + x1 + " va x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "He phuong trinh co vo so nghiem");
            } else {
                JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem");
            }
        }

        String stra3, strb3, strc3;
        stra3 = JOptionPane.showInputDialog(null,
                "Nhap a3: ", "Phuong trinh bac 2",
                JOptionPane.INFORMATION_MESSAGE);
        strb3 = JOptionPane.showInputDialog(null,
                "Nhap b3: ", "Phuong trinh bac 2",
                JOptionPane.INFORMATION_MESSAGE);
        strc3 = JOptionPane.showInputDialog(null,
                "Nhap c3: ", "Phuong trinh bac 2",
                JOptionPane.INFORMATION_MESSAGE);

        double a3 = Double.parseDouble(stra3);
        double b3 = Double.parseDouble(strb3);
        double c3 = Double.parseDouble(strc3);

        double Delta = b3 * b3 - 4 * a3 * c3;
        if (Delta > 0) {
            double x31 = (-b3 + Math.sqrt(Delta)) / (2 * a3);
            double x32 = (-b3 - Math.sqrt(Delta)) / (2 * a3);
            JOptionPane.showMessageDialog(null, "Phuong trinh co hai nghiem phan biet: x1 = " + x31 + ", x2 = " + x32);
        } else if (Delta == 0) {
            double x3 = -b3 / (2 * a3);
            JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep: x = " + x3);
        } else {
            JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
        }
    }
}
