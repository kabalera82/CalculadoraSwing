package dogster;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Calculadora extends JFrame {

    public Calculadora(){
        super("Calculator");
        setSize(340,460);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.BLACK);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel.setBackground(Color.BLACK);

        JTextField salida = new JTextField();
        salida.setEditable(false);
        salida.setPreferredSize(new Dimension(360, 180));
        salida.setHorizontalAlignment(SwingConstants.RIGHT);
        salida.setFont(new Font("Consolas", Font.BOLD, 32));
        salida.setBackground(Color.BLACK);
        salida.setForeground(Color.GREEN);
        salida.setCaretColor(Color.GREEN);

        panel.add(salida);

        JPanel panelBonotes = new JPanel();
        panelBonotes.setLayout(new GridLayout(5, 4, 5, 5));
        panelBonotes.setBackground(Color.BLACK);

        JButton btnPct  = new JButton("%");
        JButton btnDiv  = new JButton("/");
        JButton btnCE   = new JButton("CE");
        JButton btnC    = new JButton("C");

        JButton btn7    = new JButton("7");
        JButton btn8    = new JButton("8");
        JButton btn9    = new JButton("9");
        JButton btnMul  = new JButton("x");

        JButton btn4    = new JButton("4");
        JButton btn5    = new JButton("5");
        JButton btn6    = new JButton("6");
        JButton btnSub  = new JButton("-");

        JButton btn1    = new JButton("1");
        JButton btn2    = new JButton("2");
        JButton btn3    = new JButton("3");
        JButton btnAdd  = new JButton("+");

        JButton btnSign = new JButton("+/-");
        JButton btn0    = new JButton("0");
        JButton btnDot  = new JButton(",");
        JButton btnEq   = new JButton("=");

        List<JButton> botones = List.of(
                btnPct, btnDiv, btnCE, btnC,
                btn7, btn8, btn9, btnMul,
                btn4, btn5, btn6, btnSub,
                btn1, btn2, btn3, btnAdd,
                btnSign, btn0, btnDot, btnEq
        );

        for (JButton b : botones) {
            b.setFont(new Font("Consolas", Font.BOLD, 26));
            b.setBackground(new Color(0, 255, 0));
            b.setForeground(Color.BLACK);
            b.setOpaque(true);
            b.setContentAreaFilled(true);

            panelBonotes.add(b);
        }

        panel.add(panelBonotes);
        add(panel, BorderLayout.CENTER);
    }
}
