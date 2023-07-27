import javax.swing.*;

public class conversorMoedas {

        public boolean check(String input){
            try {
                double x = Double.parseDouble(input);
                if(x >= 0 || x < 0);
                return true;
            }catch (NumberFormatException e){
                return false;
            }
        }
        public void RealparaReal(double Minput) {
        double Real = Minput * 0.19;
        JOptionPane.showMessageDialog(null, " $ " + Real + " Reais ");
    }

    public void RealparaEuro(double Minput) {
        double euro = Minput * 0.18;
        JOptionPane.showMessageDialog(null, " € " + euro + " EUROS ");
    }
}


