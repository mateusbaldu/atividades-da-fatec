package domain;

import DAO.LeitorDAO;
import services.Cpf;
import services.Endereco;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeitorGUI extends JFrame{
    private JTextArea CadastrarLeitor;
    private JButton registrarButton;
    private JTextField textNome;
    private JTextField textEmail;
    private JFormattedTextField textTelefone;
    private JFormattedTextField textCPF;
    private JPasswordField textSenha;
    private JComboBox textTipoCategoria;
    private JTextField textLogradouro;
    private JTextField textCidade;
    private JTextField textCEP;
    private JTextField textCodigoCategoria;
    private JPanel panelCadastrarLeitor;
    private JLabel lblMensagem;
    private JButton carregarButton;
    private JTextField textDiasCategoria;
    Leitor objeto = new Leitor();

    public LeitorGUI() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panelCadastrarLeitor);
        setTitle("Cadastro Leitor");
        setSize(800,600);

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    objeto.setNome(textNome.getText());
                    objeto.setEmail(textEmail.getText());
                    objeto.setTelefone(textTelefone.getText().replaceAll("[^0-9]", ""));
                    objeto.setSenha(new String(textSenha.getPassword()));

                    CategoriaLeitor categoriaLeitor = new CategoriaLeitor(textTipoCategoria.getSelectedItem().toString());
                    objeto.setCategoriaLeitor(categoriaLeitor);
                    preencherCamposCategoria(categoriaLeitor);

                    objeto.setEndereco(new Endereco(textLogradouro.getText(),
                            textCidade.getText(), textCEP.getText()));
                    objeto.setCpf(new Cpf(textCPF.getText()));
                    lblMensagem.setText("Leitor cadastrado com sucesso!");

                    LeitorDAO leitorDAO = new LeitorDAO();
                    leitorDAO.inserir(objeto);
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
                textCodigoCategoria.setText(Integer.toString(objeto.getCategoriaLeitor().getCodigo()));
                preencherCamposCategoria(objeto.getCategoriaLeitor());

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
        textTipoCategoria.setSelectedIndex(0);
        textCPF.setText("");
        textSenha.setText("");
        textDiasCategoria.setText("");
        textCodigoCategoria.setText("");
    }

    public void preencherCamposCategoria(CategoriaLeitor categoriaLeitor) {
        switch (categoriaLeitor.getCodigo()) {
            case 1:
                textCodigoCategoria.setText(Integer.toString(categoriaLeitor.getCodigo()));
                textDiasCategoria.setText("3");
                break;

            case 2:
                textCodigoCategoria.setText(Integer.toString(categoriaLeitor.getCodigo()));
                textDiasCategoria.setText("4");
                break;

            case 3:
                textCodigoCategoria.setText(Integer.toString(categoriaLeitor.getCodigo()));
                textDiasCategoria.setText("5");
                break;
        }
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

