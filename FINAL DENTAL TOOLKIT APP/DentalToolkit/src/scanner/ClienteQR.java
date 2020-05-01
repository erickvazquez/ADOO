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

/**
 *
 * @author ertim
 */

public class ClienteQR {
    private static final String QR_CODE_IMAGE_PATH = "./QR.png";
    
    private static void generateQRCodeImage(String text, int width, int height, String filePath)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
        File archivo= new File(QR_CODE_IMAGE_PATH);
        MatrixToImageWriter.writeToFile(bitMatrix, "PNG", archivo);
    }
    
    public void crearQR(String Palabra) throws WriterException, IOException{
                generateQRCodeImage(Palabra, 350, 350,QR_CODE_IMAGE_PATH);
    }
}
