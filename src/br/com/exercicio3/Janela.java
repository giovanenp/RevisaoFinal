package br.com.exercicio3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.event.ActionEvent;

public class Janela extends JFrame implements ActionListener {
  private JButton btnOk;

  public void exibeJanela() {
    Container janela = getContentPane();
    setLayout(null);

    JLabel lbNome = new JLabel("Nome: ");
    JLabel lbEmail = new JLabel("Email: ");
    lbNome.setBounds(50, 40, 50, 20);
    lbEmail.setBounds(50, 80, 50, 20);

    JTextField txtNome = new JTextField();
    JTextField txtEmail = new JTextField();
    txtNome.setBounds(90, 40, 100, 20);
    txtEmail.setBounds(90, 80, 100, 20);

    btnOk = new JButton("Ok");
    btnOk.setBounds(90, 120, 50, 20);
    btnOk.addActionListener(this);

    janela.add(lbNome);
    janela.add(lbEmail);
    janela.add(txtNome);
    janela.add(txtEmail);
    janela.add(btnOk);
    setSize(800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showInternalMessageDialog(rootPane, "Cadastro realizado com sucesso!");
  }
}