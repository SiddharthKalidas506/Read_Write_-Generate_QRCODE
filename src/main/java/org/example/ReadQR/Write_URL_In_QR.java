package org.example.ReadQR;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;

public class Write_URL_In_QR {
    public static void main(String[] args) {
        try {
            String qrCodeData = "www.chillyfacts.com";
            String filePath = "/Users/sikalidas/IdeaProjects/Read_Write_Generate_QRCODE/src/Base64QRCodeIMG/QRCODEDIMG.png";
            String charset = "UTF-8"; // or "ISO-8859-1"
            BitMatrix matrix = new MultiFormatWriter().encode(
                    new String(qrCodeData.getBytes(charset), charset),
                    BarcodeFormat.QR_CODE, 200, 200);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
            System.out.println("QR Code image created successfully!");
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
