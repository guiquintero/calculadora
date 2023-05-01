package Calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Stack;

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
    private boolean limpa1 = false;
    private boolean limpa2 = false;

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

        Icon expandir = new ImageIcon("src\\Calculadora\\expandir.png");
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

        Icon teto = new ImageIcon("src\\Calculadora\\teto.png");
        this.btnTeto = new JButton(teto);
        this.btnTeto.setFont(new java.awt.Font("Tahoma", 0, 24));

        Icon piso = new ImageIcon("src\\Calculadora\\piso.png");
        this.btnPiso = new JButton(piso);
        this.btnPiso.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnLog = new JButton("Log");
        this.btnLog.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnLn = new JButton("Ln");
        this.btnLn.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnPi = new JButton("π");
        this.btnPi.setFont(new java.awt.Font("Tahoma", 0, 24)); 

        this.btnE = new JButton("e");
        this.btnE.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnFatorial = new JButton("x!");
        this.btnFatorial.setFont(new java.awt.Font("Tahoma", 0, 24));

        this.btnSomatorial = new JButton("x?");
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
                verificaErro();
				btnNumeroActionPerformed("1");
			}
        });
        
        this.btn2.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("2");
			}
        });

        this.btn3.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("3");
			}
        });

        this.btn4.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("4");
			}
        });

        this.btn5.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("5");
			}
        });

        this.btn6.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("6");
			}
        });

        this.btn7.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("7");
			}
        });

        this.btn8.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("8");
			}
        });

        this.btn9.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("9");
			}
        });

        this.btn0.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                verificaErro();
				btnNumeroActionPerformed("0");
			}
        });

        this.btnSoma.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
                btnOperador('+');
            }
        });

        this.btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnOperador('-');
            	
            }
        });

        this.btnMultiplicacao.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnOperador('*');
            }
        });

        this.btnDivisao.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnOperador('/');
            }
        });

        this.btnExpandir.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnExpandirActionPerformed();
            }
        });

        this.btnIgual.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnIgualActionPerformed();
            }
        });

        this.btnLog.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("log");
            }
        });

        this.btnLn.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("ln");
            }
        });

        this.btnRaiz.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("raiz");
            }
        });
        
        this.btnPotencia.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("potencia");
            }
        });

        this.btnInverterSinal.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("inverterSinal");
            }
        });
        
        this.btnPorcentagem.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("porcentagem");
            }
        });

        this.btnFatorial.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("fatorial");
            }
        });

        this.btnSomatorial.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("somatorial");
            }
        });

        this.btnPi.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("pi");
            }
        });

        this.btnE.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("euler");
            }
        });

        this.btnP10.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("10potencia");
            } 
        });

        this.btnInverte.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("inverte");
            }
        });

        this.btnModulo.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("modulo");
            }
        });

        this.btnTeto.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("teto");
            }
        });

        this.btnPiso.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("piso");
            }
        });

        this.btnModulo.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	calcCien("modulo");
            }
        });

        this.btnPonto.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnPontoActionPerformed();
            }
        });

        this.btnParentesesAbre.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnParentesesActionPerformed("(");
            }
        });

        this.btnParentesesFecha.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent evt){
                verificaErro();
            	btnParentesesActionPerformed(")");
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
        if(limpa1) { 
        	limpa1 =false;
        	txtNumero.setText("");
        	txtVisor.setText(""); 
        }
        if(limpa2) {
        	limpa2 =false; 
        	txtNumero.setText("");

        }
        	txtNumero.setText(txtNumero.getText() + numero);
    } 
 
    private void btnPontoActionPerformed() {
        if(!txtNumero.getText().contains(".")){
            if(txtNumero.getText().equals("")){
                txtNumero.setText("0");
            }
            txtNumero.setText(txtNumero.getText() + ".");
        }
    } 

    private void btnOperador(char operador) {
        if(!txtNumero.getText().equals("")){
            if(txtNumero.getText().charAt(txtNumero.getText().length()-1)=='.'){
                txtNumero.setText(txtNumero.getText()+"0");
            }
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

    private void btnParentesesActionPerformed(String AF) {
        int contAbre = 0;
        int contFecha = 0;
        for(int i = 0; i < txtVisor.getText().length(); i++){
            if(txtVisor.getText().charAt(i) == '('){
                contAbre++;
            }
            if(txtVisor.getText().charAt(i) == ')'){
                contFecha++;
            }
        }
        if(AF.equals("(")){
        	if(!txtNumero.getText().equals("")) {
        		txtVisor.setText(txtVisor.getText() + txtNumero.getText() + "(");
                txtNumero.setText("");
        	}else {
            	txtVisor.setText(txtVisor.getText() + "(");
            }
            
        }else{
            if(!txtNumero.getText().equals("")){
                if(contAbre > contFecha){
                    txtVisor.setText(txtVisor.getText() + txtNumero.getText() + ")");
                    txtNumero.setText("");
	            }else{
	                if(!txtVisor.getText().equals("")){
	                    char ultimoCaracter = txtVisor.getText().charAt(txtVisor.getText().length()-1);    
	                    if(String.valueOf(ultimoCaracter).matches("[+\\-*/]")){
	                        txtVisor.setText(txtVisor.getText().substring(0, txtVisor.getText().length()-1) + ")");
	                    } 
	                }else{
	                    txtVisor.setText("0" + ")");
	                }
	            }
            }
        }
    } 

    private void btnIgualActionPerformed() {
    	limpa1=true;
        int contAbre = 0;
        int contFecha = 0;
        for(int i = 0; i < txtVisor.getText().length(); i++){
            if(txtVisor.getText().charAt(i) == '('){
                contAbre++;
            }
            if(txtVisor.getText().charAt(i) == ')'){
                contFecha++;
            }
        }
        if(!txtNumero.getText().equals("")){
            txtVisor.setText(txtVisor.getText() + txtNumero.getText());
            txtNumero.setText("");
            if(contAbre > contFecha){
                for(int i = 0; i < contAbre - contFecha; i++){
                    txtVisor.setText(txtVisor.getText() + ")");
                }
            }
        txtNumero.setText(calcularConta(txtVisor.getText()));
        }
    }
 
    private void calcCien(String op){
        if(!txtNumero.getText().equals("") || op.equals("pi") || op.equals("euler")){
            switch (op){
                case "log":
                    txtNumero.setText(String.valueOf(Math.log10(Double.parseDouble(txtNumero.getText()))));
                    break;
                case "ln":
                    txtNumero.setText(String.valueOf(Math.log(Double.parseDouble(txtNumero.getText()))));
                    break;
                case "raiz":
                    txtNumero.setText(String.valueOf(Math.sqrt(Double.parseDouble(txtNumero.getText()))));
                    break;
                case "potencia":
                    txtNumero.setText(String.valueOf(Math.pow(Double.parseDouble(txtNumero.getText()), 2)));
                    break; 
                case "inverterSinal":
                    txtNumero.setText(String.valueOf(Double.parseDouble(txtNumero.getText())*(-1)));
                    break;
                case "porcentagem":
                    txtNumero.setText(String.valueOf(Double.parseDouble(txtNumero.getText())/100));
                    break;
                case "fatorial":
                    float num1 = Float.parseFloat(txtNumero.getText());
                    int fatorial = (int) num1;                
                    int resultado = 1;
                    for(int i = 1; i <= fatorial; i++){ 
                        resultado *= i;
                    }
                    txtNumero.setText(String.valueOf(resultado));
                    break;
                case "somatorial":
                    float num2 = Float.parseFloat(txtNumero.getText());
                    int somatorial = (int) num2; 
                    int resultado2 = 0;
                    for(int i = 1; i <= somatorial; i++){
                        resultado2 += i;
                    }
                    txtNumero.setText(String.valueOf(resultado2));
                    break;
                case "pi":
                    txtNumero.setText(String.valueOf(Math.PI)); 
                    break;
                case "euler":
                	txtNumero.setText("");
                    txtNumero.setText(String.valueOf(Math.E));
                    break; 
                case "10potencia":
                    float num3 = Float.parseFloat(txtNumero.getText());
                    int p10 = (int) num3,valor =1;
                    for(int i = 1; i <= p10; i++){
                        valor*=10;
                    }
                    txtNumero.setText(String.valueOf(valor));
                    break;
                case "inverte":
                    txtNumero.setText(String.valueOf(1/Double.parseDouble(txtNumero.getText())));
                    break;
                case "modulo":
                    txtNumero.setText(String.valueOf(Math.abs(Double.parseDouble(txtNumero.getText()))));
                    break;
                case "teto":
                String teto =String.valueOf(Math.ceil(Double.parseDouble(txtNumero.getText())));
                teto = teto.substring(0, teto.length()-2);
                    txtNumero.setText(teto);
                    break;
                case "piso":
                String piso =String.valueOf(Math.floor(Double.parseDouble(txtNumero.getText())));
                piso = piso.substring(0, piso.length()-2);
                    txtNumero.setText(piso);
                    break;
                
            }
            limpa2 = true;

        }
    }

    private void verificaErro() {
        String str = txtNumero.getText();
        if(str.matches(".*[a-zA-Z].*")){
            txtNumero.setText("");
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
    
    public static String calcularConta(String conta)   {
    	
    	if (conta.charAt(0) == '-') {
    		conta="0" + conta;
        }
    	
    	conta=conta.replaceAll("/-(\\d+\\.?\\d*)", "/(0-$1)");
    	
    	conta=conta.replaceAll("(\\d+\\.?\\d*|\\.\\d+)(\\()", "$1*$2");
    	
    	conta=conta.replaceAll("(\\))(\\d+\\.?\\d*|\\.\\d+)", "$1*$2");
    	
        Stack<Float> valores = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < conta.length(); i++) {
            char c = conta.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                while (i + 1 < conta.length() && (Character.isDigit(conta.charAt(i + 1)) || conta.charAt(i + 1) == '.')) {
                    sb.append(conta.charAt(i + 1));
                    i++;
                }
                float valor = Float.parseFloat(sb.toString());
                valores.push(valor);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operadores.isEmpty() && prioridade(operadores.peek()) >= prioridade(c)) {
                    float b = valores.pop();
                    float a = valores.pop();
                    char op = operadores.pop();
                    if (op == '/' && b == 0) {
                    	return"erro";
                    }
                    float resultado = executarOperacao(a, b, op);
                    valores.push(resultado);
                }
                operadores.push(c); 
            } else if (c == '(') {
                operadores.push(c);
            } else if (c == ')') {
                while (operadores.peek() != '(') {
                    float b = valores.pop();
                    float a = valores.pop();
                    char op = operadores.pop(); 
                    if (op == '/' && b == 0) {
                        return "erro";
                    }
                    float resultado = executarOperacao(a, b, op);
                    valores.push(resultado);
                }
                operadores.pop();
            }
        }

        while (!operadores.isEmpty()) {
            float b = valores.pop();
            float a = valores.pop();
            char op = operadores.pop();
            if (op == '/' && b == 0) {
            	return"erro";
            }
            float resultado = executarOperacao(a, b, op);
            valores.push(resultado);
        }

        return String.valueOf(valores.pop());
	}
	


	private static int prioridade(char operador) {
	    switch (operador) {
	        case '+':
	        case '-': 
	            return 1;
	        case '*': 
	        case '/':
	            return 2;
	        default: 
	            return 0;
	    }
	}

	private static float executarOperacao(float a, float b, char operador) {
	    switch (operador) {
	        case '+':
	            return a + b;
	        case '-':
	            return a - b;
	        case '*':
	            return a * b;
	        case '/': 
	            return a / b;
	        default:
	            return 0;   
	    } 
	} 
    
    public static void main(String[] args) {
    	new Interface().setVisible(true);
	}

    
}
