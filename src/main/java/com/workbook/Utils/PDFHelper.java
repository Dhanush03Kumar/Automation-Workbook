package com.workbook.Utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PDFHelper {

    public static String getPDFContent(String filepath){
        File file = new File(filepath);
        PDDocument pdDocument=null;
        try{
            pdDocument=PDDocument.load(file);
            PDFTextStripper stripper = new PDFTextStripper();
            String textContent = stripper.getText(pdDocument);
            return textContent;
        } catch (IOException e) {
            throw new RuntimeException("Error reading file "+e.getMessage());
        }finally {
            if(pdDocument!=null){
                try{
                    pdDocument.close();
                } catch (IOException e) {
                    throw new RuntimeException("Error in closing file "+e.getMessage());
                }
            }
        }

    }
}
