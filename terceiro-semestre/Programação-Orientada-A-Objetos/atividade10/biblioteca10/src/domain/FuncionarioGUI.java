package domain;

import DAO.FuncionarioDAO;
import services.Cpf;
import services.Endereco;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuncionarioGUI extends JFrame{
    private JTextArea CadastrarFuncionario;
    private JButton registrarButton;
    private JTextField textNome;
    private JTextField textEmail;
    private JFormattedTextField textTelefone;
    private JFormattedTextField textCPF;
    private JTextField textLogradouro;
    private JTextField textCidade;
    private JTextField textCEP;
    private JTextField textCargo;
    private JPasswordField textSenha;
    private JLabel Nome;
    private JLabel Email;
    private JLabel Telefone;
    private JLabel Logradouro;
    private JLabel CPF;
    private JLabel Categoria;
    private JLabel Senha;
    private JLabel Endereço;
    private JLabel Cidade;
    private JLabel CEP;
    private JPanel panelCadastroFuncionario;
    private JLabel lblMensagem;
    private JButton carregarButton;
    CategoriaObra.Funcionario objeto = new CategoriaObra.Funcionario();



    public FuncionarioGUI() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panelCadastroFuncionario);
        setTitle("Cadastro Funcionario");
        setSize(800,600);


        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    objeto.setNome(textNome.getText());
                    objeto.setEmail(textEmail.getText());
                    objeto.setTelefone(textTelefone.getText().replaceAll("[^0-9]", ""));
                    objeto.setCargo(textCargo.getText());
                    Cpf cpf = new Cpf(textCPF.getText());
                    objeto.setCpf(cpf);
                    Endereco objetoEndereco = new Endereco(textLogradouro.getText(),
                            textCidade.getText(), textCEP.getText());
                    objeto.setEndereco(objetoEndereco);
                    objeto.setSenha(textSenha.getText());
                    lblMensagem.setText("Leitor cadastrado com sucesso!");

                    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
                    funcionarioDAO.inserir(objeto);
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    limpar();
                }
            }
        });
        carregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNome.setText(objeto.getNome());
                textEmail.setText(objeto.getEmail());
                textTelefone.setText(objeto.getTelefone());
                textCPF.setText(objeto.getCpf().getValue());
                textLogradouro.setText(objeto.getEndereco().getLogradouro());
                textCidade.setText(objeto.getEndereco().getCidade());
                textCEP.setText(objeto.getEndereco().getCep());
                textCargo.setText(objeto.getCargo());

                lblMensagem.setText("");
            }
        });
    }

    public void limpar() {
        textNome.setText("");
        textEmail.setText("");
        textTelefone.setText("");
        textLogradouro.setText("");
        textCidade.setText("");
        textCEP.setText("");
        textCargo.setText("");
        textSenha.setText("");
        textCPF.setText("");
    }


    private void createUIComponents() {
        try {
            MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
            cpfMask.setPlaceholderCharacter('_');
            textCPF = new JFormattedTextField(cpfMask);

            MaskFormatter telefoneMask = new MaskFormatter("(##) #####-####");
            telefoneMask.setPlaceholderCharacter('_');
            textTelefone = new JFormattedTextField(telefoneMask);

            MaskFormatter cepMask = new MaskFormatter("#####-###");
            cepMask.setPlaceholderCharacter('_');
            textCEP = new JFormattedTextField(cepMask);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
