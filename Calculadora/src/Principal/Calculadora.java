package Principal;
import Clases.Archivos;
import Clases.Metodos;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {
    String Temporal01, Temporal02, signo;
    private Color Color;
    boolean inicio=true;
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }
public void Blanco(){
    jPanel1.setBackground(Color.white);//Seteamos color del Panel
    ComboBoxColores.setBackground(Color.white);//Seteamos color del Combobox
    //Seteamos color de letra de botones
    btnMS.setForeground(Color.black);btnMR.setForeground(Color.black);
    btnMC.setForeground(Color.black);btnCE.setForeground(Color.black);
    btnPunto.setForeground(Color.black);btnIgual.setForeground(Color.black);
    btnDivision.setForeground(Color.black);btnMulti.setForeground(Color.black);
    btnMenos.setForeground(Color.black);btnSuma.setForeground(Color.black);
    btn0.setForeground(Color.black);btn1.setForeground(Color.black);
    btn2.setForeground(Color.black);btn3.setForeground(Color.black);
    btn4.setForeground(Color.black);btn5.setForeground(Color.black);
    btn6.setForeground(Color.black);btn7.setForeground(Color.black);
    btn8.setForeground(Color.black);btn9.setForeground(Color.black);
    btnC.setForeground(Color.black);btnSigno.setForeground(Color.black);
    //Seteamos color de fondo botones
    btnMS.setBackground(Color.white);btnMR.setBackground(Color.white);
    btnMC.setBackground(Color.white);btnCE.setBackground(Color.white);
    btnPunto.setBackground(Color.white);btnIgual.setBackground(Color.white);
    btnDivision.setBackground(Color.white);btnMulti.setBackground(Color.white);
    btnMenos.setBackground(Color.white);btnSuma.setBackground(Color.white);
    btn0.setBackground(Color.white);btn1.setBackground(Color.white);
    btn2.setBackground(Color.white);btn3.setBackground(Color.white);
    btn4.setBackground(Color.white);btn5.setBackground(Color.white);
    btn6.setBackground(Color.white);btn7.setBackground(Color.white);
    btn8.setBackground(Color.white);btn9.setBackground(Color.white);
    btnC.setBackground(Color.white);btnSigno.setBackground(Color.white);
    //Seteamos color del boton Creadores
    btnCreadores.setBackground(Color.white);btnCreadores.setForeground(Color.black);
    //Seteamos color de pantalla y cinta
    txtPantalla.setBackground(Color.white);TextAreaCinta.setBackground(Color.white);
    txtPantalla.setForeground(Color.black);TextAreaCinta.setForeground(Color.black);
}

public void Negro(){
    jPanel1.setBackground(Color.black);//Seteamos color del Panel
    ComboBoxColores.setBackground(Color.DARK_GRAY);//Seteamos color del Combobox
    //Seteamos color de letra de botones
    btnMS.setForeground(Color.white);btnMR.setForeground(Color.white);
    btnMC.setForeground(Color.white);btnCE.setForeground(Color.white);
    btnPunto.setForeground(Color.white);btnIgual.setForeground(Color.white);
    btnDivision.setForeground(Color.white);btnMulti.setForeground(Color.white);
    btnMenos.setForeground(Color.white);btnSuma.setForeground(Color.white);
    btn0.setForeground(Color.white);btn1.setForeground(Color.white);
    btn2.setForeground(Color.white);btn3.setForeground(Color.white);
    btn4.setForeground(Color.white);btn5.setForeground(Color.white);
    btn6.setForeground(Color.white);btn7.setForeground(Color.white);
    btn8.setForeground(Color.white);btn9.setForeground(Color.white);
    btnC.setForeground(Color.white);btnSigno.setForeground(Color.white);
    //Seteamos color de fondo botones
    btnMS.setBackground(Color.DARK_GRAY);btnMR.setBackground(Color.DARK_GRAY);
    btnMC.setBackground(Color.DARK_GRAY);btnCE.setBackground(Color.DARK_GRAY);
    btnPunto.setBackground(Color.DARK_GRAY);btnIgual.setBackground(Color.DARK_GRAY);
    btnDivision.setBackground(Color.DARK_GRAY);btnMulti.setBackground(Color.DARK_GRAY);
    btnMenos.setBackground(Color.DARK_GRAY);btnSuma.setBackground(Color.DARK_GRAY);
    btn0.setBackground(Color.DARK_GRAY);btn1.setBackground(Color.DARK_GRAY);
    btn2.setBackground(Color.DARK_GRAY);btn3.setBackground(Color.DARK_GRAY);
    btn4.setBackground(Color.DARK_GRAY);btn5.setBackground(Color.DARK_GRAY);
    btn6.setBackground(Color.DARK_GRAY);btn7.setBackground(Color.DARK_GRAY);
    btn8.setBackground(Color.DARK_GRAY);btn9.setBackground(Color.DARK_GRAY);
    btnC.setBackground(Color.DARK_GRAY);btnSigno.setBackground(Color.DARK_GRAY);
    //Seteamos color del boton Creadores
    btnCreadores.setBackground(Color.DARK_GRAY);btnCreadores.setForeground(Color.white);
    //Seteamos color de pantalla y cinta
    txtPantalla.setBackground(Color.DARK_GRAY);TextAreaCinta.setBackground(Color.DARK_GRAY);
    txtPantalla.setForeground(Color.white);TextAreaCinta.setForeground(Color.white);
}
  
public void Verde(){
   jPanel1.setBackground(Color.green);//Seteamos color del Panel
    ComboBoxColores.setBackground(Color.orange);//Seteamos color del Combobox
    //Seteamos color de letra de botones
    btnMS.setForeground(Color.blue);btnMR.setForeground(Color.blue);
    btnMC.setForeground(Color.blue);btnCE.setForeground(Color.blue);
    btnPunto.setForeground(Color.blue);btnIgual.setForeground(Color.blue);
    btnDivision.setForeground(Color.blue);btnMulti.setForeground(Color.blue);
    btnMenos.setForeground(Color.blue);btnSuma.setForeground(Color.blue);
    btn0.setForeground(Color.blue);btn1.setForeground(Color.blue);
    btn2.setForeground(Color.blue);btn3.setForeground(Color.blue);
    btn4.setForeground(Color.blue);btn5.setForeground(Color.blue);
    btn6.setForeground(Color.blue);btn7.setForeground(Color.blue);
    btn8.setForeground(Color.blue);btn9.setForeground(Color.blue);
    btnC.setForeground(Color.blue);btnSigno.setForeground(Color.blue);
    //Seteamos color de fondo botones
    btnMS.setBackground(Color.orange);btnMR.setBackground(Color.orange);
    btnMC.setBackground(Color.orange);btnCE.setBackground(Color.orange);
    btnPunto.setBackground(Color.orange);btnIgual.setBackground(Color.orange);
    btnDivision.setBackground(Color.orange);btnMulti.setBackground(Color.orange);
    btnMenos.setBackground(Color.orange);btnSuma.setBackground(Color.orange);
    btn0.setBackground(Color.orange);btn1.setBackground(Color.orange);
    btn2.setBackground(Color.orange);btn3.setBackground(Color.orange);
    btn4.setBackground(Color.orange);btn5.setBackground(Color.orange);
    btn6.setBackground(Color.orange);btn7.setBackground(Color.orange);
    btn8.setBackground(Color.orange);btn9.setBackground(Color.orange); 
    btnC.setBackground(Color.orange);btnSigno.setBackground(Color.orange);
    //Seteamos color del boton Creadores
    btnCreadores.setBackground(Color.orange);btnCreadores.setForeground(Color.blue);
    //Seteamos color de pantalla y cinta
    txtPantalla.setBackground(Color.orange);TextAreaCinta.setBackground(Color.orange);
    txtPantalla.setForeground(Color.blue);TextAreaCinta.setForeground(Color.blue);  
}

public void Amarillo(){
    jPanel1.setBackground(Color.yellow);//Seteamos color del Panel
    ComboBoxColores.setBackground(Color.blue);//Seteamos color del Combobox
    //Seteamos color de letra de botones
    btnMS.setForeground(Color.white);btnMR.setForeground(Color.white);
    btnMC.setForeground(Color.white);btnCE.setForeground(Color.white);
    btnPunto.setForeground(Color.white);btnIgual.setForeground(Color.white);
    btnDivision.setForeground(Color.white);btnMulti.setForeground(Color.white);
    btnMenos.setForeground(Color.white);btnSuma.setForeground(Color.white);
    btn0.setForeground(Color.white);btn1.setForeground(Color.white);
    btn2.setForeground(Color.white);btn3.setForeground(Color.white);
    btn4.setForeground(Color.white);btn5.setForeground(Color.white);
    btn6.setForeground(Color.white);btn7.setForeground(Color.white);
    btn8.setForeground(Color.white);btn9.setForeground(Color.white);
    btnC.setForeground(Color.white);btnSigno.setForeground(Color.white);
    //Seteamos color de fondo botones
    btnMS.setBackground(Color.blue);btnMR.setBackground(Color.blue);
    btnMC.setBackground(Color.blue);btnCE.setBackground(Color.blue);
    btnPunto.setBackground(Color.blue);btnIgual.setBackground(Color.blue);
    btnDivision.setBackground(Color.blue);btnMulti.setBackground(Color.blue);
    btnMenos.setBackground(Color.blue);btnSuma.setBackground(Color.blue);
    btn0.setBackground(Color.blue);btn1.setBackground(Color.blue);
    btn2.setBackground(Color.blue);btn3.setBackground(Color.blue);
    btn4.setBackground(Color.blue);btn5.setBackground(Color.blue);
    btn6.setBackground(Color.blue);btn7.setBackground(Color.blue);
    btn8.setBackground(Color.blue);btn9.setBackground(Color.blue);
    btnC.setBackground(Color.blue);btnSigno.setBackground(Color.blue);
    //Seteamos color del boton Creadores
    btnCreadores.setBackground(Color.blue);btnCreadores.setForeground(Color.white);
    //Seteamos color de pantalla y cinta
    txtPantalla.setBackground(Color.blue);TextAreaCinta.setBackground(Color.blue);
    txtPantalla.setForeground(Color.white);TextAreaCinta.setForeground(Color.white);
}

public void Encender(){
    String path = "/Imagenes/on.png";
    URL url = this.getClass().getResource(path);
    ImageIcon icon = new ImageIcon(url);
    btnEncendidoApagado.setIcon(icon);
    btnMS.setEnabled(true);btnMR.setEnabled(true);btnMC.setEnabled(true);
    btnC.setEnabled(true);btnCE.setEnabled(true);btnPunto.setEnabled(true);
    btnIgual.setEnabled(true);btnDivision.setEnabled(true);btnMulti.setEnabled(true);
    btnMenos.setEnabled(true);btnSuma.setEnabled(true);btn0.setEnabled(true);
    btn1.setEnabled(true);btn2.setEnabled(true);btn3.setEnabled(true);
    btn4.setEnabled(true);btn5.setEnabled(true);btn6.setEnabled(true);
    btn7.setEnabled(true);btn8.setEnabled(true);btn9.setEnabled(true);
    ComboBoxColores.setEnabled(true);TextAreaCinta.setEnabled(true);
    txtPantalla.setEnabled(true);btnCreadores.setEnabled(true);btnSalir.setEnabled(false);
    txtPantalla.setText("0"); inicio=true;btnSigno.setEnabled(true);
    String linea;FileReader file = null;//Carga de Info
    try {
        file = new FileReader("InfoCinta.txt");
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
    }
    try (BufferedReader buffer = new BufferedReader(file)) {
        while ((linea = buffer.readLine()) != null) {
            String orden[] = linea.split(",");
            TextAreaCinta.append(orden[0]+"\n");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e);
    }//Fin carga info
}

public void Apagar(){
    URL url = this.getClass().getResource("/Imagenes/off.png");
    ImageIcon icon = new ImageIcon(url);
    btnEncendidoApagado.setIcon(icon);
    btnMS.setEnabled(false);btnMR.setEnabled(false);btnMC.setEnabled(false);
    btnC.setEnabled(false);btnCE.setEnabled(false);btnPunto.setEnabled(false);
    btnIgual.setEnabled(false);btnDivision.setEnabled(false);btnMulti.setEnabled(false);
    btnMenos.setEnabled(false);btnSuma.setEnabled(false);btn0.setEnabled(false);
    btn1.setEnabled(false);btn2.setEnabled(false);btn3.setEnabled(false);
    btn4.setEnabled(false);btn5.setEnabled(false);btn6.setEnabled(false);
    btn7.setEnabled(false);btn8.setEnabled(false);btn9.setEnabled(false);
    ComboBoxColores.setEnabled(false);TextAreaCinta.setEnabled(false);
    txtPantalla.setEnabled(false);btnCreadores.setEnabled(false);btnSalir.setEnabled(true);
    txtPantalla.setText("");TextAreaCinta.setText("");btnSigno.setEnabled(false);
    Temporal01=""; Temporal02=""; signo="";
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPantalla = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaCinta = new javax.swing.JTextArea();
        ComboBoxColores = new javax.swing.JComboBox<>();
        btnMS = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCreadores = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnEncendidoApagado = new javax.swing.JToggleButton();
        btnSigno = new javax.swing.JButton();
        btn_definirColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculadora");
        setLocation(new java.awt.Point(350, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtPantalla.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPantalla.setEnabled(false);
        txtPantalla.setFocusable(false);
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });

        TextAreaCinta.setEditable(false);
        TextAreaCinta.setColumns(20);
        TextAreaCinta.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        TextAreaCinta.setRows(5);
        TextAreaCinta.setAutoscrolls(false);
        TextAreaCinta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TextAreaCinta.setEnabled(false);
        TextAreaCinta.setFocusable(false);
        jScrollPane1.setViewportView(TextAreaCinta);

        ComboBoxColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Color Blanco", "Color Negro", "Color Verde", "Color Amarillo" }));
        ComboBoxColores.setEnabled(false);
        ComboBoxColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxColoresActionPerformed(evt);
            }
        });

        btnMS.setBackground(new java.awt.Color(255, 255, 255));
        btnMS.setText("MS");
        btnMS.setEnabled(false);
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnMR.setBackground(new java.awt.Color(255, 255, 255));
        btnMR.setText("MR");
        btnMR.setEnabled(false);
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnMC.setBackground(new java.awt.Color(255, 255, 255));
        btnMC.setText("MC");
        btnMC.setEnabled(false);
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnCE.setBackground(new java.awt.Color(255, 255, 255));
        btnCE.setText("CE");
        btnCE.setEnabled(false);
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setEnabled(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setEnabled(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setEnabled(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("/");
        btnDivision.setEnabled(false);
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setEnabled(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setEnabled(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setEnabled(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMulti.setBackground(new java.awt.Color(255, 255, 255));
        btnMulti.setText("X");
        btnMulti.setEnabled(false);
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setEnabled(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setEnabled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setEnabled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 255, 255));
        btnMenos.setText("-");
        btnMenos.setEnabled(false);
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenosMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setEnabled(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setEnabled(false);
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(255, 255, 255));
        btnIgual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setEnabled(false);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.setEnabled(false);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.jpg"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCreadores.setBackground(new java.awt.Color(255, 255, 255));
        btnCreadores.setText("Acerca de...");
        btnCreadores.setEnabled(false);
        btnCreadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreadoresActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");
        btnC.setEnabled(false);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnEncendidoApagado.setBackground(new java.awt.Color(255, 255, 255));
        btnEncendidoApagado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/off.png"))); // NOI18N
        btnEncendidoApagado.setMaximumSize(new java.awt.Dimension(47, 23));
        btnEncendidoApagado.setMinimumSize(new java.awt.Dimension(47, 23));
        btnEncendidoApagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncendidoApagadoActionPerformed(evt);
            }
        });

        btnSigno.setBackground(new java.awt.Color(255, 255, 255));
        btnSigno.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnSigno.setText("+/-");
        btnSigno.setEnabled(false);
        btnSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoActionPerformed(evt);
            }
        });

        btn_definirColor.setBackground(new java.awt.Color(255, 255, 255));
        btn_definirColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_definirColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_definirColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPantalla)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnSigno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnEncendidoApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnMR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxColores, 0, 0, Short.MAX_VALUE)
                                    .addComponent(btnCreadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEncendidoApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboBoxColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreadores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btn_definirColor)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxColoresActionPerformed
        String eleccion = ComboBoxColores.getSelectedItem().toString();
        if(eleccion.equalsIgnoreCase("Color Blanco")){
            Blanco();
        }else if(eleccion.equalsIgnoreCase("Color Negro")){
            Negro();
        }else if(eleccion.equalsIgnoreCase("Color Verde")){
            Verde();
        }else if(eleccion.equalsIgnoreCase("Color Amarillo")){
            Amarillo();
        }
    }//GEN-LAST:event_ComboBoxColoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCreadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreadoresActionPerformed
        Creadores abrir = new Creadores();  //instancia el form 
        abrir.txtCreadores.setText("Calculadora\n"
                + "Version 1.0\n"
                + "Carlos A. Pérez M.\n"
                + "Jose Meneses\n"
                + "\n"
                + "            Marzo 2018\n"
                + "            Programación II\n"
                + "            Universidad Americana");
        abrir.setVisible(true);  //abre el form seleccionCampos
        this.dispose(); //Oculta ventana Actual
    }//GEN-LAST:event_btnCreadoresActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("0");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"0");
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("1");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"1");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("2");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"2");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("3");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"3");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("4");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"4");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("5");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"5");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("6");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"6");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("7");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"7");
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("8");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"8");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(inicio){
           txtPantalla.setText("");txtPantalla.setText("9");
           inicio=false;
        }else{
           txtPantalla.setText(txtPantalla.getText()+"9");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        Metodos Buscarpunto = new Metodos();
        String pantalla = txtPantalla.getText();
        if(pantalla.length()<=0){
            txtPantalla.setText("0.");
        }else{
            if(!Buscarpunto.punto(txtPantalla.getText()) && inicio==false){
                txtPantalla.setText(txtPantalla.getText()+".");inicio=false;
            }
            if(!Buscarpunto.punto(txtPantalla.getText()) && inicio==true){
                txtPantalla.setText(txtPantalla.getText()+".");inicio=false;
            }
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        String pantalla = txtPantalla.getText();
        if(pantalla.length()>0){
            pantalla=pantalla.substring(0,pantalla.length()-1);
            txtPantalla.setText(pantalla);
        }
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        Archivos archivos = new Archivos();
        if(!txtPantalla.getText().isEmpty() && inicio==false){
            try {
                txtPantalla.setText("");
                TextAreaCinta.append("--Clear--\n");
                archivos.GuardarCinta("--Clear--\r\n");//Guardando en el archivo
                Temporal01=""; Temporal02=""; signo="";
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEncendidoApagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncendidoApagadoActionPerformed
        if(btnEncendidoApagado.isSelected()==true){
            Encender();
        }else{
            Apagar();
        }
    }//GEN-LAST:event_btnEncendidoApagadoActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if(!txtPantalla.getText().isEmpty() && inicio==false){
            Temporal01 =  txtPantalla.getText();
            signo = "-";txtPantalla.setText("");
            TextAreaCinta.append("  "+Temporal01+"\n");
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if(!txtPantalla.getText().isEmpty() && inicio==false){
            Temporal01 =  txtPantalla.getText();
            signo = "+";txtPantalla.setText("");
            TextAreaCinta.append("  "+Temporal01+"\n");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        if(!txtPantalla.getText().isEmpty() && inicio==false){
            Temporal01 =  txtPantalla.getText();
            signo = "*";txtPantalla.setText("");
            TextAreaCinta.append("  "+Temporal01+"\n");
        }
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        if(!txtPantalla.getText().isEmpty() && inicio==false){
            Temporal01 =  txtPantalla.getText();
            signo = "/";txtPantalla.setText("");
            TextAreaCinta.append("  "+Temporal01+"\n");
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Metodos calcular = new Metodos();
        Archivos archivos = new Archivos();
        String resultado;
        try {
            Temporal02 = txtPantalla.getText();
            if(!Temporal02.equals("") && inicio==false){
                resultado = calcular.HacerCalculo(Temporal01, Temporal02,signo);
                if(resultado.equalsIgnoreCase("Infinity")){
                    txtPantalla.setText(resultado);
                    TextAreaCinta.append("------\nInfinity\n\n");
                }else{
                    txtPantalla.setText(resultado);
                    TextAreaCinta.append(signo+" "+Temporal02+"\n");
                    TextAreaCinta.append("------\n"+"= "+resultado+"\n\n");
                    //Guardando en el archivo 
                    archivos.GuardarCinta("  "+Temporal01);
                    archivos.GuardarCinta(signo+" "+Temporal02);
                    archivos.GuardarCinta("------\n");
                    archivos.GuardarCinta("= "+resultado);
                }
            }
        } catch (Exception e) {
            try {
                archivos.GuardarError("Error: "+e.toString());
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }/*Este tryCatch controla el error al presionar un digito y luego el igual*/
        }
    }//GEN-LAST:event_btnIgualActionPerformed
    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        if(!txtPantalla.getText().isEmpty() && inicio==false){
            try {
                Archivos MS = new Archivos();
                MS.MS(txtPantalla.getText());
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        String linea;FileReader file = null;
        try {
            file = new FileReader("MS.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader buffer = new BufferedReader(file)) {
            while ((linea = buffer.readLine()) != null) {
                String orden[] = linea.split(",");
                txtPantalla.setText(orden[0]);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        try {
            Archivos MC = new Archivos();
            MC.MS("");
        } catch (IOException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtPantalla.setText("");
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMenosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMousePressed
        //se elimina codigo par cambio de metodo de btnMenosMousePressed a 
        //btnMenosMouseClicked
    }//GEN-LAST:event_btnMenosMousePressed

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
        /*int CuentaClick =  evt.getClickCount();
        if(CuentaClick==1){
            if(!txtPantalla.getText().isEmpty() && inicio==false){
                Temporal01 =  txtPantalla.getText();
                signo = "-";
                txtPantalla.setText("");
                TextAreaCinta.append("  "+Temporal01+"\n");
            }
        }
        if(CuentaClick==2){
            if(!txtPantalla.getText().isEmpty() || txtPantalla.getText().isEmpty()){
                if(inicio){
                    txtPantalla.setText("");
                    txtPantalla.setText("-");
                    inicio=false;
                 }else{
                    txtPantalla.setText(txtPantalla.getText()+"-");
                }
            }
        }*/
        //Se comenta metodo btnMenosMouseClicked y se crea el boton (+/-)
    }//GEN-LAST:event_btnMenosMouseClicked

    private void btnSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoActionPerformed
        Double numero;
        String pantalla = txtPantalla.getText();
        if(pantalla.length()>0){
           numero=(-1)*Double.parseDouble(pantalla);
           txtPantalla.setText(numero.toString());
        }
    }//GEN-LAST:event_btnSignoActionPerformed

    private void btn_definirColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_definirColorActionPerformed
       Color = JColorChooser.showDialog(null, "Coge color", Color);
       jPanel1.setBackground(Color);
    }//GEN-LAST:event_btn_definirColorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxColores;
    private javax.swing.JTextArea TextAreaCinta;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCreadores;
    private javax.swing.JButton btnDivision;
    public static javax.swing.JToggleButton btnEncendidoApagado;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSigno;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btn_definirColor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
