package com.djxs.qrcode;

import java.io.IOException;

public class Test {
public static void main(String[] args) throws IOException {
	QRCode1 qrcode = new QRCode1();
	qrcode.CreatQrCode(15, 'Q', "BEGIN:VCARD\n" +
			"PHOTO;VALUE:http://img4.imgtn.bdimg.com/it/u=3630352509,3120025421&fm=27&gp=0.jpg\n" +
			  "N:��\n"+
			  "FN:�۳�\n" + 
			  "ORG:�ڼ�ѧ��\n" + 
			  "TITLE:��ʦ�Ƽ�1601��ѧ��\n" + 
			  "ADR;WORK:�ػʵ��������ӱ��������360��\n" + 
			  "ADR;HOME:��Ժ\n" + 
			  "TEL;CELL,VOICE:771401541\n" + 
			  "TEL;WORK,VOICE:0335-126516111\n" + 
			  "URL;WORK;:http://www.fdgdsfgt.com\n" + 
			  "EMAIL;INTERNET,HOME:7165682@qq.com\n" + 

			"END:VCARD ", "D:/1.jpg", 20, "d:/ahc.png", "255,0,0", "0,0,255");
	System.out.println("ok");
}
}
