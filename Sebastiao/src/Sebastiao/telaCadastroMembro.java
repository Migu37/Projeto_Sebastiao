package Sebastiao;

import iINTERFACE.Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

/*import BuscasComboBOX.BGeral;
import ConexaoBD.Conexao;
import ENTITY.Endereco;
import ENTITY.Membro;
import ENTITY.Pessoa;
import ENTITY.Profissao;
import ENTITY.Util;
//import iINTERFACE.Interface;
import DAO.ConsultaCidadeDAO;
 import DAO.ConsultaComunidadeDAO;
 import DAO.ConsultaEstadoDAO;
 import DAO.ConsultaInstrucaoDAO;
 import DAO.ConsultaParoquiaDAO;
 import DAO.ConsultaProfissaoDAO;
 import DAO.ConsultaSetorDAO;*/

public class telaCadastroMembro extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final JCheckBox chckbxFeminino;
	final JComboBox<String> profissaoCBox;
	final JComboBox<String> ufCBox;
	final JComboBox<String> cidadeCBox;
	final JComboBox<String> paroquiaCBox;
	final JComboBox<String> comunidadeCBox;
	final JComboBox<String> InstrucaoEscCBox;
	final JComboBox<String> setorCBox;
	final JComboBox <String>estadoCivilCBox;
	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField sobreNomeField;
	private JTextField paiField;
	private JTextField maeField;
	private JTextField dataNascField;
	private JTextField dataBatismoField;
	private JTextField dataCasamentoField;
	private JButton btnSalvar;
	private JButton btnDesfazer;
	private JButton btnSair;
	private JTextField dataConfirmacaoField;
	private JTextField cpfField;
	private JTextField rgField;
	private JTextField ruaField;
	private JTextField bairroField;
	private JTextField cepField;
	private JTextField codigoField;
	private JTextField idadeField;
	private JTextField numeroField;
	private String sex = "";
	private JTextField telefoneField;

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {

					telaCadastroMembro frame = new telaCadastroMembro();
					frame.setVisible(true);

				} catch (Exception ex) {
					ex.printStackTrace();

				}

			}
		});
	}

	public telaCadastroMembro() throws ParseException {
		MaskFormatter MaskData = new MaskFormatter("  ##/ ##/ ####");
		MaskFormatter MaskCpf = new MaskFormatter("  ###.###.###-##");
		MaskFormatter MaskRg = new MaskFormatter("  #.###.###");
		MaskFormatter MaskCep = new MaskFormatter("  #####-###");
		//MembroAcessoDados pessoa = new MembroAcessoDados();
	    //BGeral buscar = new BGeral();
		//java.sql.Connection c = new Conexao().abrirConexao();
		setTitle("MEMBROS");
		setBounds(90, 40, 1203, 732);

		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCdigo.setBounds(30, 71, 46, 25);
		contentPane.add(lblCdigo);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNome.setBounds(86, 71, 46, 25);
		contentPane.add(lblNome);

		JLabel lblSobreNome = new JLabel("Sobre Nome");
		lblSobreNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSobreNome.setBounds(30, 131, 81, 14);
		contentPane.add(lblSobreNome);

		JLabel lblPai = new JLabel("Pai");
		lblPai.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblPai.setBounds(30, 177, 46, 14);
		contentPane.add(lblPai);

		JLabel lblMae = new JLabel("Mae");
		lblMae.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblMae.setBounds(30, 228, 46, 14);
		contentPane.add(lblMae);

		JLabel lblDataNascimento = new JLabel("Data Nascimento");
		lblDataNascimento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDataNascimento.setBounds(460, 130, 132, 14);
		contentPane.add(lblDataNascimento);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblIdade.setBounds(462, 182, 46, 14);
		contentPane.add(lblIdade);

		JLabel lblDatabBatismo = new JLabel("Data de Batismo");
		lblDatabBatismo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDatabBatismo.setBounds(679, 357, 114, 14);
		contentPane.add(lblDatabBatismo);

		nomeField = new JTextField();
		nomeField.setFont(new Font("Dialog", Font.PLAIN, 16));
		nomeField.setBounds(86, 97, 237, 31);
		contentPane.add(nomeField);
		nomeField.setColumns(10);

		sobreNomeField = new JTextField();
		sobreNomeField.setFont(new Font("Dialog", Font.PLAIN, 16));
		sobreNomeField.setBounds(29, 147, 293, 31);
		contentPane.add(sobreNomeField);
		sobreNomeField.setColumns(10);

		paiField = new JTextField();
		paiField.setFont(new Font("Dialog", Font.PLAIN, 16));
		paiField.setBounds(29, 193, 293, 31);
		contentPane.add(paiField);
		paiField.setColumns(10);

		maeField = new JTextField();
		maeField.setFont(new Font("Dialog", Font.PLAIN, 16));
		maeField.setBounds(29, 247, 293, 31);
		contentPane.add(maeField);
		maeField.setColumns(10);

		dataNascField = new JFormattedTextField(MaskData);
		dataNascField.setFont(new Font("Dialog", Font.PLAIN, 16));
		dataNascField.setBounds(458, 148, 179, 31);
		contentPane.add(dataNascField);
		dataNascField.setColumns(10);

		dataBatismoField = new JFormattedTextField(MaskData);
		dataBatismoField.setFont(new Font("Dialog", Font.PLAIN, 16));
		dataBatismoField.setBounds(679, 377, 179, 31);
		contentPane.add(dataBatismoField);
		dataBatismoField.setColumns(10);

		dataCasamentoField = new JFormattedTextField(MaskData);
		dataCasamentoField.setFont(new Font("Dialog", Font.PLAIN, 16));
		dataCasamentoField.setBounds(679, 493, 179, 31);
		contentPane.add(dataCasamentoField);
		dataCasamentoField.setColumns(10);

		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(885, 629, 127, 31);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				if (evento.getSource() == btnSalvar) {				 

				}

			}
		});
		btnSalvar.setBackground(new Color(102, 204, 255));
		contentPane.add(btnSalvar);

		btnDesfazer = new JButton("DESFAZER");
		btnDesfazer.setBackground(new Color(204, 255, 153));
		btnDesfazer.setBounds(487, 629, 127, 31);
		btnDesfazer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnDesfazer);

		JButton btnPrximo = new JButton("PR\u00D3XIMO >>");
		btnPrximo.setBackground(new Color(102, 204, 51));
		btnPrximo.setBounds(751, 629, 127, 31);
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		contentPane.add(btnPrximo);

		JButton btnAnterior = new JButton("<< ANTERIOR");
		btnAnterior.setBackground(new Color(51, 153, 153));
		btnAnterior.setBounds(618, 629, 127, 31);
		contentPane.add(btnAnterior);

		btnSair = new JButton("SAIR");
		btnSair.setBackground(new Color(255, 153, 102));
		btnSair.setBounds(1017, 629, 127, 31);
		btnSair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				}
		});
		contentPane.add(btnSair);

		JLabel lblConfirmacao = new JLabel("Data Confirmacao");
		lblConfirmacao.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblConfirmacao.setBounds(679, 417, 123, 14);
		contentPane.add(lblConfirmacao);

		JLabel lblCasamantoData = new JLabel("Data Casamento");
		lblCasamantoData.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCasamantoData.setBounds(679, 475, 117, 14);
		contentPane.add(lblCasamantoData);

		JLabel lblSetor = new JLabel("Setor ");
		lblSetor.setBounds(460, 476, 117, 13);
		lblSetor.setFont(new Font("Dialog", Font.PLAIN, 14));
		contentPane.add(lblSetor);

		JLabel lblComunidade = new JLabel("Comunidade");
		lblComunidade.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblComunidade.setBounds(460, 423, 101, 14);
		contentPane.add(lblComunidade);

		JLabel lblProfissao = new JLabel("Profissao");
		lblProfissao.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblProfissao.setBounds(679, 130, 67, 14);
		contentPane.add(lblProfissao);

		JLabel lblCadastroDeMembros = new JLabel("DADOS PESSOAIS");
		lblCadastroDeMembros.setBounds(129, 50, 179, 28);
		lblCadastroDeMembros.setFont(new Font("Arial Unicode MS", Font.PLAIN,
				17));
		contentPane.add(lblCadastroDeMembros);

		chckbxFeminino = new JCheckBox("Feminino");
		final JCheckBox chckbxMasculino = new JCheckBox("Masculino");
		chckbxMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxFeminino.setSelected(false);

				sex = "Masculino";

			}
		});

		chckbxMasculino.setBounds(460, 260, 91, 18);
		contentPane.add(chckbxMasculino);

		chckbxFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxMasculino.setSelected(false);
				sex = "Feminio";

			}
		});
		chckbxFeminino.setBounds(549, 260, 104, 18);
		contentPane.add(chckbxFeminino);

		dataConfirmacaoField = new JFormattedTextField(MaskData);
		dataConfirmacaoField.setFont(new Font("Dialog", Font.PLAIN, 16));
		dataConfirmacaoField.setBounds(679, 439, 179, 31);
		contentPane.add(dataConfirmacaoField);
		dataConfirmacaoField.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSexo.setBounds(462, 243, 46, 14);
		contentPane.add(lblSexo);

		JLabel lblDocumentos = new JLabel("DOCUMENTOS");
		lblDocumentos.setBounds(533, 50, 166, 28);
		lblDocumentos.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		contentPane.add(lblDocumentos);

		JLabel lblDadosNaParoquia = new JLabel("DADOS na PAR\u00D3QUIA");
		lblDadosNaParoquia.setBounds(530, 317, 224, 25);
		lblDadosNaParoquia.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		contentPane.add(lblDadosNaParoquia);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCpf.setBounds(459, 82, 46, 14);
		contentPane.add(lblCpf);

		cpfField = new JFormattedTextField(MaskCpf);
		cpfField.setFont(new Font("Dialog", Font.PLAIN, 16));
		cpfField.setBounds(458, 97, 179, 31);
		contentPane.add(cpfField);
		cpfField.setColumns(10);

		JLabel lblRg = new JLabel("RG");
		lblRg.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblRg.setBounds(680, 82, 46, 14);
		contentPane.add(lblRg);

		rgField = new JFormattedTextField(MaskRg);
		rgField.setFont(new Font("Dialog", Font.PLAIN, 16));
		rgField.setBounds(679, 97, 237, 31);
		contentPane.add(rgField);
		rgField.setColumns(10);

		JLabel lblParquia = new JLabel("Par\u00F3quia");
		lblParquia.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblParquia.setBounds(460, 356, 77, 25);
		contentPane.add(lblParquia);

		ruaField = new JTextField();
		ruaField.setFont(new Font("Dialog", Font.PLAIN, 16));
		ruaField.setText("");
		ruaField.setBounds(30, 469, 293, 31);
		contentPane.add(ruaField);
		ruaField.setColumns(10);

		JLabel lblEndereco = new JLabel("ENDERE\u00C7O");
		lblEndereco.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		lblEndereco.setBounds(107, 318, 166, 28);
		contentPane.add(lblEndereco);

		JLabel lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblRua.setBounds(30, 453, 46, 14);
		contentPane.add(lblRua);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblBairro.setBounds(30, 407, 46, 14);
		contentPane.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCidade.setBounds(99, 357, 46, 14);
		contentPane.add(lblCidade);

		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblUf.setBounds(30, 357, 29, 14);
		contentPane.add(lblUf);

		bairroField = new JTextField();
		bairroField.setFont(new Font("Dialog", Font.PLAIN, 16));
		bairroField.setBounds(30, 423, 293, 31);
		contentPane.add(bairroField);
		bairroField.setColumns(10);

		profissaoCBox = new JComboBox<String>();
		//buscar.buscaProfissao(profissaoCBox);
		profissaoCBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		profissaoCBox.setBounds(679, 147, 237, 31);
		contentPane.add(profissaoCBox);

		ufCBox = new JComboBox<String>();
		//buscar.buscaUF(ufCBox);
		ufCBox.setFont(ufCBox.getFont().deriveFont(ufCBox.getFont().getSize() + 4f));
		ufCBox.setBounds(30, 372, 67, 31);
		contentPane.add(ufCBox);

		setorCBox = new JComboBox<String>();
		//buscar.buscaSetor(setorCBox);
		setorCBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		setorCBox.setBounds(460, 493, 179, 31);
		contentPane.add(setorCBox);

		comunidadeCBox = new JComboBox<String>();
		//buscar.buscaComunidade(comunidadeCBox);
		comunidadeCBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		comunidadeCBox.setBounds(460, 441, 179, 31);
		contentPane.add(comunidadeCBox);
		
		cidadeCBox = new JComboBox<String>();
		//buscar.buscaCidade(cidadeCBox);
		cidadeCBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		cidadeCBox.setBounds(99, 372, 224, 31);
		contentPane.add(cidadeCBox);

		InstrucaoEscCBox = new JComboBox<String>();
		InstrucaoEscCBox.setMaximumRowCount(10);
		//buscar.buscaInstrucao(InstrucaoEscCBox);
		InstrucaoEscCBox.setFont(new Font("Dialog", Font.PLAIN, 12));
		InstrucaoEscCBox.setBounds(679, 201, 237, 31);
		contentPane.add(InstrucaoEscCBox);

		paroquiaCBox = new JComboBox<String>();
		//buscar.buscaParoquia(paroquiaCBox);
		paroquiaCBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		paroquiaCBox.setBounds(460, 377, 179, 31);
		contentPane.add(paroquiaCBox);
		
		estadoCivilCBox = new JComboBox<String>();
		//buscar.buscaEstadoCivil(estadoCivilCBox);
		estadoCivilCBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		estadoCivilCBox.setBounds(460, 544, 179, 31);
		contentPane.add(estadoCivilCBox);

		JTextPane fotoTextPane = new JTextPane();
		fotoTextPane.setBounds(976, 97, 150, 150);
		contentPane.add(fotoTextPane);

		JLabel lblFoto = new JLabel("FOTO");
		lblFoto.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFoto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFoto.setBounds(1027, 55, 81, 23);
		contentPane.add(lblFoto);

		JLabel lblInstrucaoEscolar = new JLabel("Instru\u00E7\u00E3o Escolar");
		lblInstrucaoEscolar.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblInstrucaoEscolar.setBounds(679, 184, 109, 14);
		contentPane.add(lblInstrucaoEscolar);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCep.setBounds(30, 501, 55, 16);
		contentPane.add(lblCep);

		cepField = new JFormattedTextField(MaskCep);
		cepField.setFont(new Font("Dialog", Font.PLAIN, 16));
		cepField.setBounds(30, 518, 122, 31);
		contentPane.add(cepField);
		cepField.setColumns(10);

		codigoField = new JTextField();
		codigoField.setFont(new Font("Dialog", Font.PLAIN, 16));
		codigoField.setColumns(10);
		codigoField.setBounds(29, 97, 46, 31);
		contentPane.add(codigoField);

		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblComplemento.setBounds(30, 551, 102, 16);
		contentPane.add(lblComplemento);

		idadeField = new JTextField();
		idadeField.setFont(new Font("Dialog", Font.PLAIN, 16));
		idadeField.setBounds(460, 201, 179, 31);
		contentPane.add(idadeField);
		idadeField.setColumns(10);

		JLabel lblDataDeCadastro = new JLabel("Data de Cadastro");
		lblDataDeCadastro.setBounds(8, 6, 144, 16);
		contentPane.add(lblDataDeCadastro);

		TextArea complementoArea = new TextArea();
		complementoArea.setForeground(new Color(0, 0, 0));
		complementoArea.setBounds(30, 570, 293, 90);
		contentPane.add(complementoArea);

		JLabel lblNumero = new JLabel("N\u00BA");
		lblNumero.setBounds(164, 501, 55, 16);
		contentPane.add(lblNumero);

		numeroField = new JTextField();
		numeroField.setBounds(164, 518, 159, 31);
		contentPane.add(numeroField);
		numeroField.setColumns(10);
		
		
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblEstadoCivil.setBounds(460, 526, 108, 16);
		contentPane.add(lblEstadoCivil);
		
		telefoneField = new JTextField();
		telefoneField.setBounds(679, 547, 179, 31);
		contentPane.add(telefoneField);
		telefoneField.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone Fixo:");
		lblTelefone.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblTelefone.setBounds(680, 533, 122, 16);
		contentPane.add(lblTelefone);
		
	}
	
	
}
	  
	


