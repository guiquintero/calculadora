package Calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Interface extends JFrame{

    private JTextField txtVisor;
    private JTextField txtNumero;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnSoma;
    private JButton btnSubtracao;
    private JButton btnMultiplicacao;
    private JButton btnDivisao;
    private JButton btnIgual;
    private JButton btnLimpar;
    private JButton btnPonto;
    private JButton btnBS;
    private JButton btnMS;
    private JButton btnMR;
    private JButton btnMC;
    private JButton btnExpandir;
    private JButton btnRaiz;
    private JButton btnP10;
    private JButton btnPotencia;
    private JButton btnPorcentagem;
    private JButton btnModulo;
    private JButton btnTeto;
    private JButton btnPiso;
    private JButton btnLog;
    private JButton btnLn;
    private JButton btnPi;
    private JButton btnInverterSinal;
    private JButton btnInverte;
    private JButton btnSomatorial;
    private JButton btnFatorial;
    private JButton btnE; 
    private JButton btnMod;
    private JButton btnParentesesAbre;
    private JButton btnParentesesFecha;
    private JButton btnBranco1;
    private JButton btnBranco2;
    private JButton btnBranco3;
    private JPanel pnlVisor;
    private JPanel pnlCentral;
    private boolean cientifica = false;

    public Interface(){

        this.initComponents();
    }
    
    private void initComponents() {
    	
    	this.txtVisor = new JTextField();
        this.txtVisor.setText("");
        this.txtVisor.setFont(new java.awt.Font("Tahoma", 1, 20));
        this.txtVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        this.txtVisor.setEnabled(false);
        this.txtNumero = new JTextField();
        this.txtNumero.setText("");
        this.txtNumero.setFont(new java.awt.Font("Tahoma", 1, 30));
        this.txtNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        this.txtNumero.setEnabled(false);

        this.pnlVisor = new JPanel(new GridLayout(2,1,5,5));
        this.pnlVisor.add(txtVisor);
        this.pnlVisor.add(txtNumero); 
        
        this.add(pnlVisor, BorderLayout.NORTH);

        this.btn0 = new JButton("0");
        this.btn0.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn1 = new JButton("1");
        this.btn1.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn2 = new JButton("2");
        this.btn2.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn3 = new JButton("3");
        this.btn3.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn4 = new JButton("4");
        this.btn4.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn5 = new JButton("5");
        this.btn5.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn6 = new JButton("6");
        this.btn6.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn7 = new JButton("7");
        this.btn7.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn8 = new JButton("8");
        this.btn8.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btn9 = new JButton("9");
        this.btn9.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnSoma = new JButton("+");
        this.btnSoma.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnSubtracao = new JButton("-");
        this.btnSubtracao.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnMultiplicacao = new JButton("*");
        this.btnMultiplicacao.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnDivisao = new JButton("/");
        this.btnDivisao.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnIgual = new JButton("="); 
        this.btnIgual.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnLimpar = new JButton("C");
        this.btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        
        this.btnPonto = new JButton(".");
        this.btnPonto.setFont(new java.awt.Font("Tahoma", 0, 24));
 
        this.btnMS = new JButton("MS");
        this.btnMS.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnMR = new JButton("MR");
        this.btnMR.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnMC = new JButton("MC");
        this.btnMC.setFont(new java.awt.Font("Tahoma", 0, 24));

        Icon expandir = new ImageIcon("src\\aula13\\expandir.png");
        this.btnExpandir = new JButton(expandir);
        this.btnExpandir.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnRaiz = new JButton("√x");
        this.btnRaiz.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnPotencia = new JButton("x²");
        this.btnPotencia.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnPorcentagem = new JButton("%");
        this.btnPorcentagem.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnModulo = new JButton("|x|");
        this.btnModulo.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnTeto = new JButton("⌈x⌉");
        this.btnTeto.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnPiso = new JButton("⌊x⌋");
        this.btnPiso.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnLog = new JButton("Log");
        this.btnLog.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnLn = new JButton("Ln");
        this.btnLn.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnPi = new JButton("π");
        this.btnPi.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnE = new JButton("e");
        this.btnE.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnFatorial = new JButton("n!");
        this.btnFatorial.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnSomatorial = new JButton("n?");
        this.btnSomatorial.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnBS = new JButton("←");
        this.btnBS.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnP10 = new JButton("10x");
        this.btnP10.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnMod = new JButton("Mod");
        this.btnMod.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnInverterSinal = new JButton("-/+");
        this.btnInverterSinal.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnInverte = new JButton("1/x");
        this.btnInverte.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnParentesesAbre = new JButton("(");
        this.btnParentesesAbre.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnParentesesFecha = new JButton(")");
        this.btnParentesesFecha.setFont(new java.awt.Font("Tahoma", 0, 24));  

        this.btnBranco1 = new JButton("");
        this.btnBranco1.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnBranco2 = new JButton("");
        this.btnBranco2.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnBranco3 = new JButton("");
        this.btnBranco3.setFont(new java.awt.Font("Tahoma", 0, 24));
         
        this.pnlCentral = new JPanel(new GridLayout(6,3,5,5));
         
        
        
        this.btnLimpar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	limpaVisores();
            }
        });
        this.btn1.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("1");
			}
        });
        
        this.btn2.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("2");
			}
        });
        this.btn3.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("3");
			}
        });
        this.btn4.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("4");
			}
        });
        this.btn5.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("5");
			}
        });
        this.btn6.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("6");
			}
        });
        this.btn7.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("7");
			}
        });
        this.btn8.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("8");
			}
        });
        this.btn9.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("9");
			}
        });
        this.btn0.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
				btnNumeroActionPerformed("0");
			}
        });
        this.btnSoma.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnOperador('+');
            }
        });
        this.btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
            	btnOperador('-');
            	
            }
        });
        this.btnMultiplicacao.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	btnOperador('*');
            }
        });
        this.btnDivisao.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	btnOperador('/');
            }
        });
        this.btnExpandir.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	btnExpandirActionPerformed();
            }
        });
        this.btnIgual.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	btnIgualActionPerformed();
            }
        });
        this.btnLog.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	btnLogActionPerformed();
            }
        });
        
        this.pnlCentral.add(btnLimpar);
        this.pnlCentral.add(btnSoma);
        this.pnlCentral.add(btnIgual);
        this.pnlCentral.add(btnDivisao);
        this.pnlCentral.add(btnMultiplicacao);
        this.pnlCentral.add(btnSubtracao);
        this.pnlCentral.add(btn7);
        this.pnlCentral.add(btn8);
        this.pnlCentral.add(btn9);
        this.pnlCentral.add(btn4);
        this.pnlCentral.add(btn5);
        this.pnlCentral.add(btn6);
        this.pnlCentral.add(btn1);
        this.pnlCentral.add(btn2);
        this.pnlCentral.add(btn3);
        this.pnlCentral.add(btnPonto);   
        this.pnlCentral.add(btn0);  
        this.pnlCentral.add(btnExpandir);


        this.add(pnlCentral, BorderLayout.SOUTH);

        this.setTitle("Calculadora");
        this.setSize(260, 380);
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
    }
    
    private void btnNumeroActionPerformed(String numero) {
        if(!txtVisor.getText().equals("")){  
            char ultimoCaracter = txtVisor.getText().charAt(txtVisor.getText().length()-1);    
            if(String.valueOf(ultimoCaracter).matches("[+\\-*/]")){
                txtNumero.setText("");
            } 
        }
        	txtNumero.setText(txtNumero.getText() + numero);
    }

    private void btnOperador(char operador) {
        if(!txtNumero.getText().equals("")){
            txtVisor.setText(txtVisor.getText() + txtNumero.getText() + operador);
            txtNumero.setText("");
        }else{
            if(!txtVisor.getText().equals("")){
                char ultimoCaracter = txtVisor.getText().charAt(txtVisor.getText().length()-1);    
                if(String.valueOf(ultimoCaracter).matches("[+\\-*/]")){
                    txtVisor.setText(txtVisor.getText().substring(0, txtVisor.getText().length()-1) + operador);
                } 
            }else{
                txtVisor.setText("0" + operador);}
        }
    }

    private void limpaVisores() {
        txtVisor.setText(""); 
        txtNumero.setText("");
    }

    private void btnIgualActionPerformed() throws ArithmeticException{
        
            if(!txtNumero.getText().equals("")){
                txtVisor.setText(txtVisor.getText() + txtNumero.getText());
                txtNumero.setText(Logica.calcularConta(txtVisor.getText()));
                txtVisor.setText(""); 
            }
  
    }  

    private void btnLogActionPerformed(){
        if(!txtNumero.getText().equals("")){
            txtNumero.setText(Logica.calcularLog(txtNumero.getText()));
        }
    }



    private void btnExpandirActionPerformed() {
    	if(cientifica==false){
    		this.setSize(260, 380);
    		cientifica=true;
            this.pnlCentral.remove(btnLimpar);
            this.pnlCentral.remove(btnSoma);
            this.pnlCentral.remove(btnIgual); 
            this.pnlCentral.remove(btnDivisao);
            this.pnlCentral.remove(btnMultiplicacao);
            this.pnlCentral.remove(btnSubtracao);
            this.pnlCentral.remove(btn7);
            this.pnlCentral.remove(btn8);
            this.pnlCentral.remove(btn9);
            this.pnlCentral.remove(btn4);
            this.pnlCentral.remove(btn5);
            this.pnlCentral.remove(btn6);
            this.pnlCentral.remove(btn1);
            this.pnlCentral.remove(btn2);
            this.pnlCentral.remove(btn3);
            this.pnlCentral.remove(btnPonto);
            this.pnlCentral.remove(btn0);
            this.pnlCentral.remove(btnExpandir);
            this.pnlCentral.remove(btnRaiz);
            this.pnlCentral.remove(btnPotencia);
            this.pnlCentral.remove(btnPorcentagem);
            this.pnlCentral.remove(btnInverterSinal);
            this.pnlCentral.remove(btnMS);
            this.pnlCentral.remove(btnMR);
            this.pnlCentral.remove(btnMC);
            this.pnlCentral.remove(btnPiso);
            this.pnlCentral.remove(btnTeto);
            this.pnlCentral.remove(btnFatorial);
            this.pnlCentral.remove(btnLog);
            this.pnlCentral.remove(btnLn); 
            this.pnlCentral.remove(btnPi);
            this.pnlCentral.remove(btnE);
            this.pnlCentral.remove(btnBS);
            this.pnlCentral.remove(btnP10);
            this.pnlCentral.remove(btnModulo);
            this.pnlCentral.remove(btnMod);
            this.pnlCentral.remove(btnSomatorial);
            this.pnlCentral.remove(btnBranco1);
            this.pnlCentral.remove(btnBranco2);
            this.pnlCentral.remove(btnInverte);
            this.pnlCentral.remove(btnParentesesAbre);
            this.pnlCentral.remove(btnParentesesFecha);
            
            this.pnlCentral.add(btnLimpar);
            this.pnlCentral.add(btnSoma);
            this.pnlCentral.add(btnIgual);
            this.pnlCentral.add(btnDivisao);
            this.pnlCentral.add(btnMultiplicacao);
            this.pnlCentral.add(btnSubtracao);
            this.pnlCentral.add(btn7);
            this.pnlCentral.add(btn8);
            this.pnlCentral.add(btn9);
            this.pnlCentral.add(btn4);
            this.pnlCentral.add(btn5);
            this.pnlCentral.add(btn6);
            this.pnlCentral.add(btn1);
            this.pnlCentral.add(btn2);
            this.pnlCentral.add(btn3);
            this.pnlCentral.add(btnPonto);   
            this.pnlCentral.add(btn0); 
            this.pnlCentral.add(btnExpandir);
            this.add(pnlCentral, BorderLayout.CENTER);

    	}else{
    		 this.setSize(710, 380); 
    		cientifica=false;
            this.pnlCentral.remove(btnLimpar);
            this.pnlCentral.remove(btnSoma);
            this.pnlCentral.remove(btnIgual);
            this.pnlCentral.remove(btnDivisao);
            this.pnlCentral.remove(btnMultiplicacao);
            this.pnlCentral.remove(btnSubtracao);
            this.pnlCentral.remove(btn7);
            this.pnlCentral.remove(btn8);
            this.pnlCentral.remove(btn9);
            this.pnlCentral.remove(btn4);
            this.pnlCentral.remove(btn5);
            this.pnlCentral.remove(btn6);
            this.pnlCentral.remove(btn1);
            this.pnlCentral.remove(btn2);
            this.pnlCentral.remove(btn3);
            this.pnlCentral.remove(btnPonto);
            this.pnlCentral.remove(btn0);
            this.pnlCentral.remove(btnExpandir);
            
            this.pnlCentral.add(btnLimpar);
            this.pnlCentral.add(btnMS);
            this.pnlCentral.add(btnMR);
            this.pnlCentral.add(btnMC);
            this.pnlCentral.add(btnE);
            this.pnlCentral.add(btnIgual);
            this.pnlCentral.add(btnInverterSinal);

            this.pnlCentral.add(btnSoma);
            this.pnlCentral.add(btnSubtracao);
            this.pnlCentral.add(btnMultiplicacao);
            this.pnlCentral.add(btnDivisao);
            this.pnlCentral.add(btnPorcentagem);
            this.pnlCentral.add(btnParentesesAbre);
            this.pnlCentral.add(btnParentesesFecha);
 

            this.pnlCentral.add(btn7);
            this.pnlCentral.add(btn8);
            this.pnlCentral.add(btn9);
            this.pnlCentral.add(btnPotencia);
            this.pnlCentral.add(btnP10);
            this.pnlCentral.add(btnRaiz);
            this.pnlCentral.add(btnInverte);

            this.pnlCentral.add(btn4);
            this.pnlCentral.add(btn5);
            this.pnlCentral.add(btn6);
            this.pnlCentral.add(btnPiso);
            this.pnlCentral.add(btnTeto);
            this.pnlCentral.add(btnModulo);
            this.pnlCentral.add(btnPi);
             
            this.pnlCentral.add(btn1);
            this.pnlCentral.add(btn2);
            this.pnlCentral.add(btn3);
            this.pnlCentral.add(btnFatorial);
            this.pnlCentral.add(btnSomatorial);
            this.pnlCentral.add(btnBranco1);
            this.pnlCentral.add(btnBranco2);
            
            this.pnlCentral.add(btnPonto);
            this.pnlCentral.add(btn0);
            this.pnlCentral.add(btnBS);
            this.pnlCentral.add(btnLn); 
            this.pnlCentral.add(btnLog);
            this.pnlCentral.add(btnMod);
            this.pnlCentral.add(btnExpandir);

    	}
    }
    
    public static void main(String[] args) {
    	new Interface().setVisible(true);
	}

    
}
