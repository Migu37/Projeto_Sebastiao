package BuscasComboBox;


import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



import DAO.ConexoesDAO;
import ENTITY.Cidade;
import ENTITY.Comunidade;
import ENTITY.Estado;
import ENTITY.EstadoCivil;
import ENTITY.InstrucaoEsc;
import ENTITY.Paroquia;
import ENTITY.Profissao;
import ENTITY.Setor;

public class BGeral {
	//public static  Connection Connection = new Conexao().abrirConexao();
	static ConexoesDAO conex = new ConexoesDAO();
	public void buscaParoquia(JComboBox<String> paroquiaCBox){	
			
	       // ConsultaParoquiaDAO paro = new ConsultaParoquiaDAO(); 		          
	        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
	        ArrayList<Paroquia> lista;  
	        try {  
	            //lista = 	paro.selectParoquia(Connection);
	            lista = 	conex.selectParoquia();
	            for ( Paroquia p : lista ) {
	            
	               modelo.addElement( p.getNomParoquia());    
	            }    
	            paroquiaCBox.setModel( modelo );    
	              
	        }  catch (Exception ex) {  
	            JOptionPane.showMessageDialog(null, "ERRO 1");  
	        }  
	     
	}
	public void buscaInstrucao(JComboBox<String> instrucaoCBox){	
       // ConsultaInstrucaoDAO inst = new ConsultaInstrucaoDAO(); 		          
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
        ArrayList<InstrucaoEsc> lista;  
        try {  
            lista = conex.selectInstrucao();
            
            for ( InstrucaoEsc p : lista ) {
            
               modelo.addElement( p.getNomInstrucao());    
            }    
           instrucaoCBox.setModel( modelo );    
              
        }  catch (Exception ex) {  
            JOptionPane.showMessageDialog(null, "ERRO 2");  
        }  
     
}
	public void buscaCidade(JComboBox<String> cidadeCBox){	
       // ConsultaCidadeDAO cid = new ConsultaCidadeDAO(); 		          
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
        ArrayList<Cidade> lista;  
        try {  
            lista = 	conex.selectCidade();
            
            for ( Cidade p : lista ) {
            
               modelo.addElement( p.getNomCidade());    
            }    
           cidadeCBox.setModel( modelo );    
              
        }  catch (Exception ex) {  
            JOptionPane.showMessageDialog(null, "ERRO 3");  
        }  
     
}
	
	public void buscaProfissao(JComboBox<String> profissaoCBox){	
		        //ConsultaProfissaoDAO prof = new ConsultaProfissaoDAO(); 		          
		        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
		        ArrayList<Profissao> lista;  
		        try {  
		            lista = 	conex.selectProfissao();
		            
		            for ( Profissao p : lista ) {
		            
		               modelo.addElement( p.getNomProfissao());    
		            }    
		           profissaoCBox.setModel( modelo );    
		              
		        }  catch (Exception ex) {  
		            JOptionPane.showMessageDialog(null, "ERRO 4");  
		        }  
		     
	}
	public void buscaUF(JComboBox<String> ufCBox){
		
		  //ConsultaEstadoDAO prof = new ConsultaEstadoDAO(); 		          
	        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
	        ArrayList<Estado> lista;  
	        try {  
	            lista = 	conex.selectEstado();
	            
	            for ( Estado p : lista ) {
	            
	               modelo.addElement( p.getNom_Estado());    
	            }    
	           ufCBox.setModel( modelo );    
	              
	        }  catch (Exception ex) {  
	            JOptionPane.showMessageDialog(null, "ERRO 5");  
	        }  
	        //JOptionPane.showMessageDialog(null, "Conectou");
		
		
	}
	public void buscaSetor(JComboBox<String> setorCBox){
		
		//  ConsultaSetorDAO prof = new ConsultaSetorDAO(); 		          
	        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
	        ArrayList<Setor> lista;  
	        try {  
	            lista = 	conex.selectSetor();
	            
	            for ( Setor p : lista ) {
	            
	               modelo.addElement( p.getNomSetor());    
	            }    
	           setorCBox.setModel( modelo );    
	              
	        }  catch (Exception ex) {  
	            JOptionPane.showMessageDialog(null, "ERRO 6");  
	        }  
	       // JOptionPane.showMessageDialog(null, "Conectou");
		
		
	}
	public void buscaComunidade(JComboBox<String> comunidadeCBox){
		
		 // ConsultaComunidadeDAO com = new ConsultaComunidadeDAO(); 		          
	        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
	        ArrayList<Comunidade> lista;  
	        try {  
	            lista = conex.selectComunidade();
	            
	            for ( Comunidade p : lista ) {
	            
	               modelo.addElement( p.getNomComunidade());    
	            }    
	           comunidadeCBox.setModel( modelo );    
	              
	        }  catch (Exception ex) {  
	            JOptionPane.showMessageDialog(null, "ERRO 7");  
	        }  
	      //  JOptionPane.showMessageDialog(null, "Conectou");
		
		
	}
	public void buscaEstadoCivil(JComboBox<String> estadoCivilCBox){
		
		  		          
	        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();    
	        ArrayList<EstadoCivil> lista;  
	        try {  
	            lista = conex.selectEstadoCivil();
	            
	            for ( EstadoCivil p : lista ) {
	            
	               modelo.addElement( p.getNom_EstadoCivil());    
	            }    
	            estadoCivilCBox.setModel( modelo );    
	              
	        }  catch (Exception ex) {  
	            JOptionPane.showMessageDialog(null, "ERRO 8");  
	        }  
	      //  JOptionPane.showMessageDialog(null, "Conectou");
		
		
	}
}

