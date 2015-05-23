package Sebastiao;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.text.MaskFormatter;
import java.awt.Color;


public class telaCadastroFamilia extends JFrame {

	private JPanel contentPane;
	private JTextField codigotField;
	private JTextField esposoDataNascField;
	private JTextField esposoDataFalField;
	private JTextField DataMatriField;
	private JTextField esposoMaeField;
	private JTextField esposoPaiField;
	private JTextField esposoLocalNascField;
	private JTextField esposoNomeField;
	private JTextField nomeFamiliaField;
	private JTextField esposaNomeField;
	private JTextField esposaLocalNascField;
	private JTextField esposaDataNascField;
	private JTextField esposaDataFalField;
	private JTextField esposaPaiField;
	private JTextField esposaMaeField;
	private JFormattedTextField dataCasamentoCivil;
	private JTextField localCasamantoField;
	private JTextField nomeFilhoField;
	private JTextField batismoFilhoField;
	private JTextField confirFilhoField;
	private JTextField casamentoFilhoField;
	private JTextField falecimentoFilhoField;
	private JTextField setorField_5;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					telaCadastroFamilia frame = new telaCadastroFamilia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaCadastroFamilia() throws ParseException {
		
		MaskFormatter format = new MaskFormatter("  ##/ ##/ ####");
		setTitle(" FAM\u00CDLIAS");

		setBounds(90, 40, 1252, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigo.setBounds(19, 112, 46, 17);
		contentPane.add(lblCdigo);

		JLabel lblNome = new JLabel("Nome da Fam\u00EDlia:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(20, 141, 133, 14);
		contentPane.add(lblNome);

		codigotField = new JTextField();
		codigotField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		codigotField.setBounds(163, 99, 46, 31);
		contentPane.add(codigotField);
		codigotField.setColumns(10);

		JLabel lblFilhoDeEsposo = new JLabel("FILHO de:");
		lblFilhoDeEsposo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFilhoDeEsposo.setBounds(91, 450, 70, 14);
		contentPane.add(lblFilhoDeEsposo);

		JLabel lblDataFalecimentoEsposo = new JLabel("Data Falec.");
		lblDataFalecimentoEsposo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataFalecimentoEsposo.setBounds(143, 359, 100, 14);
		contentPane.add(lblDataFalecimentoEsposo);

		JLabel lbllocalNascimentoEsposo = new JLabel("Local Nascimento");
		lbllocalNascimentoEsposo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbllocalNascimentoEsposo.setBounds(19, 300, 134, 14);
		contentPane.add(lbllocalNascimentoEsposo);

		JLabel lblDataNascimentoEsposo = new JLabel("Data Nasc.");
		lblDataNascimentoEsposo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNascimentoEsposo.setBounds(19, 359, 128, 14);
		contentPane.add(lblDataNascimentoEsposo);

		esposoDataNascField = new JFormattedTextField(format);	
		esposoDataNascField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposoDataNascField.setBounds(19, 381, 105, 31);
		contentPane.add(esposoDataNascField);
		esposoDataNascField.setColumns(10);

		esposoDataFalField = new JFormattedTextField(format);
		esposoDataFalField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposoDataFalField.setColumns(10);
		esposoDataFalField.setBounds(142, 381, 105, 31);
		contentPane.add(esposoDataFalField);
		

		DataMatriField = new JFormattedTextField(format);		
		DataMatriField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		DataMatriField.setColumns(10);
		DataMatriField.setBounds(1056, 130, 150, 31);
		contentPane.add(DataMatriField);

		esposoMaeField = new JTextField();
		esposoMaeField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		esposoMaeField.setColumns(10);
		esposoMaeField.setBounds(19, 550, 229, 31);
		contentPane.add(esposoMaeField);

		esposoPaiField = new JTextField();
		esposoPaiField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposoPaiField.setColumns(10);
		esposoPaiField.setBounds(19, 496, 229, 31);
		contentPane.add(esposoPaiField);

		esposoLocalNascField = new JTextField();
		esposoLocalNascField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposoLocalNascField.setToolTipText("");
		esposoLocalNascField.setColumns(10);
		esposoLocalNascField.setBounds(19, 317, 229, 31);
		contentPane.add(esposoLocalNascField);

		esposoNomeField = new JTextField();
		esposoNomeField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposoNomeField.setColumns(10);
		esposoNomeField.setBounds(19, 265, 229, 31);
		contentPane.add(esposoNomeField);

		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBackground(new Color(144, 238, 144));
		btnSalvar.setBounds(947, 612, 122, 35);
		contentPane.add(btnSalvar);

		JButton btn_excluirFilho = new JButton("EXCLUIR");
		btn_excluirFilho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_excluirFilho.setToolTipText("Retirar Filho da Lista");
		btn_excluirFilho.setBackground(new Color(250, 128, 114));
		btn_excluirFilho.setBounds(1101, 395, 105, 23);
		contentPane.add(btn_excluirFilho);

		JButton btnSair = new JButton("SAIR");
		btnSair.setBackground(new Color(255, 182, 193));
		btnSair.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(1089, 612, 122, 35);
		contentPane.add(btnSair);

		JLabel lblNomeDoEsposo = new JLabel("Nome do Esposo:");
		lblNomeDoEsposo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeDoEsposo.setBounds(19, 244, 134, 17);
		contentPane.add(lblNomeDoEsposo);

		nomeFamiliaField = new JTextField();
		nomeFamiliaField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nomeFamiliaField.setBounds(163, 133, 210, 31);
		contentPane.add(nomeFamiliaField);
		nomeFamiliaField.setColumns(10);

		JLabel lblEsposo = new JLabel("ESPOSO");
		lblEsposo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEsposo.setBounds(19, 225, 100, 14);
		contentPane.add(lblEsposo);

		JLabel lblEsposa = new JLabel("ESPOSA");
		lblEsposa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEsposa.setBounds(295, 225, 100, 14);
		contentPane.add(lblEsposa);

		JLabel lblNomeDoEsposa = new JLabel("Nome do Esposa:");
		lblNomeDoEsposa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeDoEsposa.setBounds(295, 238, 108, 23);
		contentPane.add(lblNomeDoEsposa);

		esposaNomeField = new JTextField();
		esposaNomeField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposaNomeField.setForeground(UIManager.getColor("CheckBox.foreground"));
		esposaNomeField.setBackground(UIManager.getColor("Button.highlight"));
		esposaNomeField.setColumns(10);
		esposaNomeField.setBounds(295, 265, 229, 31);
		contentPane.add(esposaNomeField);

		JLabel lblLocalNascimentoEsposa = new JLabel("Local Nascimento");
		lblLocalNascimentoEsposa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLocalNascimentoEsposa.setBounds(295, 300, 108, 14);
		contentPane.add(lblLocalNascimentoEsposa);

		esposaLocalNascField = new JTextField();
		esposaLocalNascField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposaLocalNascField.setToolTipText("");
		esposaLocalNascField.setColumns(10);
		esposaLocalNascField.setBounds(295, 317, 229, 31);
		contentPane.add(esposaLocalNascField);

		JLabel lblDataNascEsposa = new JLabel("Data Nasc.");
		lblDataNascEsposa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNascEsposa.setBounds(295, 359, 100, 14);
		contentPane.add(lblDataNascEsposa);
		
		
		
		esposaDataNascField = new JFormattedTextField(format);		
		esposaDataNascField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposaDataNascField.setColumns(10);
		esposaDataNascField.setBounds(295, 381, 105, 31);
		contentPane.add(esposaDataNascField);

		JLabel lblDataFalecEsposa = new JLabel("Data Falec.");
		lblDataFalecEsposa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataFalecEsposa.setBounds(430, 359, 86, 14);
		contentPane.add(lblDataFalecEsposa);
		
		
		esposaDataFalField = new JFormattedTextField(format);		
		esposaDataFalField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposaDataFalField.setColumns(10);
		esposaDataFalField.setBounds(419, 381, 105, 31);
		contentPane.add(esposaDataFalField);

		JLabel lblFilhaDeEsposa = new JLabel("FILHA de:");
		lblFilhaDeEsposa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFilhaDeEsposa.setBounds(366, 450, 70, 14);
		contentPane.add(lblFilhaDeEsposa);

		esposaPaiField = new JTextField();
		esposaPaiField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposaPaiField.setColumns(10);
		esposaPaiField.setBounds(295, 494, 229, 31);
		contentPane.add(esposaPaiField);

		esposaMaeField = new JTextField();
		esposaMaeField.setFont(new Font("Dialog", Font.PLAIN, 16));
		esposaMaeField.setColumns(10);
		esposaMaeField.setBounds(295, 550, 229, 31);
		contentPane.add(esposaMaeField);

		JLabel lblCasamento = new JLabel("CASAMENTO:");
		lblCasamento.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCasamento.setBounds(802, 82, 128, 14);
		contentPane.add(lblCasamento);

		JLabel lblDataMatrimonio = new JLabel("Data Matrim\u00F4nio:");
		lblDataMatrimonio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataMatrimonio.setBounds(1056, 113, 150, 14);
		contentPane.add(lblDataMatrimonio);

		JLabel lblDataCasamentoCiv = new JLabel("Data Casamento Civil:");
		lblDataCasamentoCiv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataCasamentoCiv.setBounds(1056, 175, 149, 14);
		contentPane.add(lblDataCasamentoCiv);

		
		dataCasamentoCivil = new JFormattedTextField(format);
		dataCasamentoCivil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dataCasamentoCivil.setBounds(1056, 193, 149, 31);
		dataCasamentoCivil.setColumns(10);
		contentPane.add(dataCasamentoCivil);

		JLabel lblLocalDoCasamento = new JLabel("Local do Casamento:");
		lblLocalDoCasamento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLocalDoCasamento.setBounds(796, 175, 162, 14);
		contentPane.add(lblLocalDoCasamento);

		localCasamantoField = new JTextField();
		localCasamantoField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		localCasamantoField.setColumns(10);
		localCasamantoField.setBounds(795, 193, 236, 31);
		contentPane.add(localCasamantoField);

		JLabel lblComunidade = new JLabel("Comunidade:");
		lblComunidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComunidade.setBounds(796, 113, 112, 14);
		contentPane.add(lblComunidade);

		JLabel lblParquia = new JLabel("Par\u00F3quia:");
		lblParquia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParquia.setBounds(605, 165, 80, 24);
		contentPane.add(lblParquia);

		JLabel lblUnioParoquial = new JLabel("Uni\u00E3o Paroquial:");
		lblUnioParoquial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUnioParoquial.setBounds(605, 110, 122, 21);
		contentPane.add(lblUnioParoquial);

		JComboBox paroquiaCBox = new JComboBox();
		paroquiaCBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		paroquiaCBox.setBounds(605, 193, 158, 31);
		contentPane.add(paroquiaCBox);

		JComboBox uniaoParoquiaCBox = new JComboBox();
		uniaoParoquiaCBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		uniaoParoquiaCBox.setBounds(605, 130, 158, 31);
		contentPane.add(uniaoParoquiaCBox);

		JLabel lblFilhos = new JLabel("FILHOS");
		lblFilhos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFilhos.setBounds(886, 269, 100, 14);
		contentPane.add(lblFilhos);

		JLabel lblPai = new JLabel("Pai");
		lblPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPai.setBounds(19, 474, 46, 14);
		contentPane.add(lblPai);

		JLabel lblMaeEsposo = new JLabel("Mae");
		lblMaeEsposo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaeEsposo.setBounds(19, 536, 46, 14);
		contentPane.add(lblMaeEsposo);

		JLabel lblPaiEsposa = new JLabel("Pai");
		lblPaiEsposa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPaiEsposa.setBounds(295, 474, 46, 14);
		contentPane.add(lblPaiEsposa);

		JLabel lblMaeEsposa = new JLabel("Mae");
		lblMaeEsposa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaeEsposa.setBounds(295, 529, 46, 14);
		contentPane.add(lblMaeEsposa);

		final TextArea textAreaFilho = new TextArea();
		textAreaFilho.setFont(new Font("Dialog", Font.PLAIN, 16));
		textAreaFilho.setBounds(605, 443, 601, 130);
		contentPane.add(textAreaFilho);

		JLabel lblNomeFilho = new JLabel("Nome");
		lblNomeFilho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeFilho.setBounds(605, 326, 46, 14);
		contentPane.add(lblNomeFilho);

		nomeFilhoField = new JTextField();
		nomeFilhoField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nomeFilhoField.setBounds(605, 346, 136, 31);
		contentPane.add(nomeFilhoField);
		nomeFilhoField.setColumns(10);

		JLabel lblBatismoFilho = new JLabel("Batismo");
		lblBatismoFilho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBatismoFilho.setBounds(747, 326, 70, 14);
		contentPane.add(lblBatismoFilho);

		JLabel lblConfirmaoFilho = new JLabel("Confirma\u00E7\u00E3o");
		lblConfirmaoFilho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmaoFilho.setBounds(864, 319, 88, 21);
		contentPane.add(lblConfirmaoFilho);

		JLabel lblCasamentoFilho = new JLabel("Casamento");
		lblCasamentoFilho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCasamentoFilho.setBounds(980, 326, 86, 14);
		contentPane.add(lblCasamentoFilho);

		JLabel lblFalecimentoFilho = new JLabel("Falecimento");
		lblFalecimentoFilho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFalecimentoFilho.setBounds(1101, 326, 89, 14);
		contentPane.add(lblFalecimentoFilho);

		batismoFilhoField = new JFormattedTextField(format);
		batismoFilhoField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		batismoFilhoField.setBounds(747, 346, 105, 31);
		contentPane.add(batismoFilhoField);
		batismoFilhoField.setColumns(10);

		confirFilhoField = new JFormattedTextField(format);
		confirFilhoField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		confirFilhoField.setBounds(864, 346, 105, 31);
		contentPane.add(confirFilhoField);
		confirFilhoField.setColumns(10);

		casamentoFilhoField = new JFormattedTextField(format);
		casamentoFilhoField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		casamentoFilhoField.setBounds(980, 346, 105, 31);
		contentPane.add(casamentoFilhoField);
		casamentoFilhoField.setColumns(10);

		falecimentoFilhoField = new JFormattedTextField(format);
		falecimentoFilhoField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		falecimentoFilhoField.setBounds(1101, 346, 105, 31);
		contentPane.add(falecimentoFilhoField);
		falecimentoFilhoField.setColumns(10);
		
		JButton btn_AdicionarFilho = new JButton("ADICIONAR");
		btn_AdicionarFilho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textAreaFilho.setText(textAreaFilho.getText()+"Testandp!!!!!!\n");
			
			}
		});
		btn_AdicionarFilho.setToolTipText("Adicionar Filhoa Lista");
		btn_AdicionarFilho.setBackground(new Color(152, 251, 152));
		btn_AdicionarFilho.setBounds(990, 395, 105, 23);
		contentPane.add(btn_AdicionarFilho);
		
		JComboBox comunidadeCBox = new JComboBox();
		comunidadeCBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comunidadeCBox.setBounds(795, 130, 236, 31);
		contentPane.add(comunidadeCBox);
		
		JLabel lblListaDosFilhos = new JLabel("Lista dos Filhos:");
		lblListaDosFilhos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblListaDosFilhos.setBounds(605, 407, 107, 30);
		contentPane.add(lblListaDosFilhos);
		
		JLabel lblNewLabel_1 = new JLabel(" FAMILIAS DA PAR\u00D3QUIA DE S\u00C3O SEBASTI\u00C3O");
		lblNewLabel_1.setFont(new Font("Rockwell", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(471, 6, 560, 47);
		contentPane.add(lblNewLabel_1);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBackground(new Color(224, 255, 255));
		btnConsultar.setBounds(669, 612, 122, 35);
		contentPane.add(btnConsultar);
		
		JButton btnAtualizar = new JButton("ATUALIZAR");
		btnAtualizar.setBackground(new Color(240, 230, 140));
		btnAtualizar.setBounds(809, 612, 122, 35);
		contentPane.add(btnAtualizar);
		
		JButton btnNovo = new JButton("NOVO");
		btnNovo.setBackground(new Color(135, 206, 235));
		btnNovo.setBounds(528, 612, 122, 35);
		contentPane.add(btnNovo);
		
		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblSetor.setBounds(19, 172, 55, 16);
		contentPane.add(lblSetor);
		
		JButton btn_novoFilho = new JButton("NOVO");
		btn_novoFilho.setBackground(new Color(135, 206, 250));
		btn_novoFilho.setBounds(874, 395, 101, 23);
		contentPane.add(btn_novoFilho);
		
		setorField_5 = new JTextField();
		setorField_5.setBounds(163, 167, 210, 31);
		contentPane.add(setorField_5);
		setorField_5.setColumns(10);

	}

	@SuppressWarnings("unused")
	private static String format(String pattern, Object value) {
		MaskFormatter mask;
		try {
			mask = new MaskFormatter(pattern);
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(value);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

	}
}
