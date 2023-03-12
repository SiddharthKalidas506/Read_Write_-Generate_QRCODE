package org.example.ReadQR;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Read_URL_From_QR {

    public static void main(String[] args) {

        // selenium code to read QR code from website location
/*
        String QRCodeLink=driver.findElement(By.tagName("img")).getAttribute("src")
        String []base64Url=QRCodeLink.split(",")
        String base64UpdatedURL=base64Url[1]byte[] decoded = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64UpdatedURL)
        // convert into bytesBufferedImage bufferedImage= ImageIO.read(new ByteArrayInputStream(decoded))
        LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedImage)
        BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource))
        Result result=new MultiFormatReader().decode(binaryBitmap)
        String URLInQr=result.getText()
 */

        // This is to read QR code from framework location  via img

        String filePath = "/Users/sikalidas/IdeaProjects/Read_Write_Generate_QRCODE/src/Base64QRCodeIMG/base64QR.png";
        try {
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
                    new BufferedImageLuminanceSource(
                            ImageIO.read(new FileInputStream(filePath)))));
            Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap);
            System.out.println(qrCodeResult);
        } catch (Exception e) {
            // TODO: handle exception
        }



    }
}
