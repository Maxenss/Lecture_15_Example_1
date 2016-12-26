package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField tfA;
    @FXML
    private TextField tfB;
    @FXML
    private TextField tfC;
    @FXML
    private TextField tfRes;
    @FXML
    private Button buttonSolve;

    private void Solve(double a, double b, double c) {
        double X1 = 0;
        double X2 = 0;
        double D = 0;
        String solution;
        D = b * b - 4 * a * c;
        if (D > 0) {
            X1 = (-b + Math.sqrt(D)) / 2 * a;
            X2 = (-b - Math.sqrt(D)) / 2 * a;
            solution = "X1 = " + X1 + " ; X2 = " + X2;
        } else if (D == 0)
            solution = "X1 = X2 = " + (-b) / 2 * a;
        else
            solution = "Корни только комплексные";

        tfRes.setText(solution);

    }

    @FXML
    public void ClickSolve() {
        double a = 0;
        double b = 0;
        double c = 0;

        try {
            a = Double.parseDouble(tfA.getText());
            b = Double.parseDouble(tfB.getText());
            c = Double.parseDouble(tfC.getText());
        } catch (Exception e) {
            tfRes.setText("Ошибка ввода");
            return;
        }

        Solve(a, b, c);
    }
}
