
package Views;


public class View extends javax.swing.JFrame {

    
    public View() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jta_texto = new javax.swing.JTextArea();
        jmenu = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jm_abrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jm_cifrado = new javax.swing.JMenu();
        jmcifrar = new javax.swing.JMenuItem();
        jmdes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jm_guardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloc de Notas");

        jta_texto.setColumns(20);
        jta_texto.setRows(5);
        jScrollPane1.setViewportView(jta_texto);

        jmenu.setBackground(new java.awt.Color(0, 255, 255));
        jmenu.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        jm_archivo.setText("Archivo");

        jm_abrir.setText("Abrir...");
        jm_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_abrirActionPerformed(evt);
            }
        });
        jm_archivo.add(jm_abrir);
        jm_archivo.add(jSeparator1);

        jm_cifrado.setText("Cifrado");

        jmcifrar.setText("Cifrar");
        jm_cifrado.add(jmcifrar);

        jmdes.setText("Decifrar");
        jm_cifrado.add(jmdes);

        jm_archivo.add(jm_cifrado);
        jm_archivo.add(jSeparator2);

        jm_guardar.setText("Guardar");
        jm_archivo.add(jm_guardar);

        jmenu.add(jm_archivo);

        setJMenuBar(jmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_abrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm_abrirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JMenuItem jm_abrir;
    public javax.swing.JMenu jm_archivo;
    public javax.swing.JMenu jm_cifrado;
    public javax.swing.JMenuItem jm_guardar;
    public javax.swing.JMenuItem jmcifrar;
    public javax.swing.JMenuItem jmdes;
    public javax.swing.JMenuBar jmenu;
    public javax.swing.JTextArea jta_texto;
    // End of variables declaration//GEN-END:variables
}
