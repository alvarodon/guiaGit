/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Principal.Carrito;
import Principal.CarritoItem;
import Principal.Comprador;

/**
 *
 * @author treme
 */
public class JPanel_Boleta extends javax.swing.JPanel {

    /**
     * Creates new form JPanel_Boleta
     */
    private Comprador comprador;
    public JPanel_Boleta(Comprador comprador) {
        this.comprador=comprador;
        initComponents();
        actualizarBoleta();
        
    }
    public void actualizarBoleta(){
        Carrito carrito = comprador.getCarrito();
        if (carrito != null) {
            StringBuilder boleta = new StringBuilder();
            double total = 0;

        boleta.append("========== BOLETA DE COMPRA ==========\n");
        boleta.append(String.format("%-20s %5s %10s %10s\n", "Producto", "Cant", "Precio", "Subtotal"));
        boleta.append("======================================\n");

        for (CarritoItem item : carrito.getItems()) {
            String nombre = item.getProducto().getNombre();
            int cantidad = item.getCantidad();
            double precio = item.getProducto().getPrecio();
            double subtotal = cantidad * precio;
            total += subtotal;

            boleta.append(String.format("%-20s %5d %10.2f %10.2f\n", nombre, cantidad, precio, subtotal));
        }

        boleta.append("======================================\n");
        boleta.append(String.format("%-37s %10.2f\n", "TOTAL:", total));

    TABoleta.setText(boleta.toString());
    } else {
    TABoleta.setText("El carrito está vacío.");
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SPBoleta = new javax.swing.JScrollPane();
        TABoleta = new javax.swing.JTextArea();

        TABoleta.setColumns(20);
        TABoleta.setRows(5);
        SPBoleta.setViewportView(TABoleta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(SPBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SPBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SPBoleta;
    private javax.swing.JTextArea TABoleta;
    // End of variables declaration//GEN-END:variables
}
