/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import dentaltoolkit.Frame.InfoPaciente;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ertim
 */

public class Despachador {
    private static final String QR_CODE_IMAGE_PATH = "./QRIP.png";
    public JLabel lbl;
    public JOptionPane A;
    public String obtenerUsuario() throws IOException, WriterException{
        DatagramSocket serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            String sentence="";
            int a = 1;
            crearQR();
            while(a==1){
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                sentence = new String(receivePacket.getData());
                if(!sentence.equals("")){
                   A.getRootFrame().dispose();
                   System.out.println("RECEIVED: " + sentence);
                   serverSocket.disconnect();
                   serverSocket.close();
                   return sentence;
                }
            }return "";
    }private static void generateQRCodeImage(String text, int width, int height, String filePath)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
        File archivo= new File(QR_CODE_IMAGE_PATH);
        MatrixToImageWriter.writeToFile(bitMatrix, "PNG", archivo);
    }
    
    public void crearQR() throws WriterException, IOException{
        InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getLocalHost();
                } catch (UnknownHostException ex) {
                    Logger.getLogger(InfoPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
                generateQRCodeImage(inetAddress.getHostAddress(), 350, 350,QR_CODE_IMAGE_PATH);
                lbl = new JLabel(new ImageIcon("QRIP.png"));
                A.showMessageDialog(null, lbl, "Escanea QR",
                A.PLAIN_MESSAGE, null);
    }
}
