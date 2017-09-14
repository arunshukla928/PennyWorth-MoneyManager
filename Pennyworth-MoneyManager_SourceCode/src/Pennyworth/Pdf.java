
package Pennyworth;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.lang.Math.* ;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.util.Date;
import javax.swing.*;


/**

 */
public class Pdf {

    
     public Pdf(String content){
         
         
                 Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                new FileOutputStream("/home/arun/Desktop/TransactionReceipt.pdf"));

            document.open();
            document.add(new Paragraph(content));
            
            
            document.close(); // no need to close PDFwriter?

            JOptionPane.showMessageDialog(null,"Receipt Generated");
            
            if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("/home/arun/Desktop/TransactionReceipt.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
        // no application registered for PDFs
    }
}
       
      
            
            
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

     }
    
    
    
    
}