package br.com.exercicio3;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {
    Main field = new Main();
    field.testaJFormattedTextField();
  }

  private void testaJFormattedTextField() {
    Container janela = getContentPane();
    setLayout(null);

    JLabel lbNome = new JLabel("Nome: ");
    JLabel lbEmail = new JLabel("Email: ");
    lbNome.setBounds(50, 40, 50, 20);
    lbEmail.setBounds(50, 80, 50, 20);

    JFormattedTextField txtNome = new JFormattedTextField();
    JFormattedTextField txtEmail = new JFormattedTextField();
    txtNome.setBounds(90, 40, 100, 20);
    txtEmail.setBounds(90, 80, 100, 20);

    JButton btnOk = new JButton("Ok");
    btnOk.setBounds(90, 120, 100, 20);

    janela.add(lbNome);
    janela.add(lbEmail);
    janela.add(txtNome);
    janela.add(txtEmail);
    janela.add(btnOk);
    setSize(400, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}