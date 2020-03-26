package com.lfchaim.tess4jdemo.main;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCRFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}

	private static void test1() {
		Tesseract tesseract = new Tesseract();
		try {
			// tesseract.setDatapath("D:/DataScienceCollection/Jars/tessdata");
			tesseract.setDatapath("D:/tmp/Tess4J/tessdata");
			//tesseract.setLanguage("por");
			String text = tesseract.doOCR(new File("D:/tmp/img/CNH/CNH Fernando Cinza 20181209.png"));
			System.out.print(text);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
	}
	
	private static void test2() {
		Tesseract tesseract = new Tesseract();
		try {
			// tesseract.setDatapath("D:/DataScienceCollection/Jars/tessdata");
			tesseract.setDatapath("d:/github/tesseract/tessdata");
			tesseract.setLanguage("por");
			String text = tesseract.doOCR(new File("D:/tmp/img/CNH/CNH Fernando Cinza 20181209.png"));
			System.out.print(text);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
	}
}
