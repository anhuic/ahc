package com.djxs.qrcode;

import java.io.IOException;

public class Test {
public static void main(String[] args) throws IOException {
	QRCode1 qrcode = new QRCode1();
	qrcode.CreatQrCode(15, 'Q', "BEGIN:VCARD\n" +
			"PHOTO;VALUE:http://img4.imgtn.bdimg.com/it/u=3630352509,3120025421&fm=27&gp=0.jpg\n" +
			  "N:安\n"+
			  "FN:慧成\n" + 
			  "ORG:第嘉学社\n" + 
			  "TITLE:科师科技1601班学生\n" + 
			  "ADR;WORK:秦皇岛海港区河北大街西段360号\n" + 
			  "ADR;HOME:南院\n" + 
			  "TEL;CELL,VOICE:771401541\n" + 
			  "TEL;WORK,VOICE:0335-126516111\n" + 
			  "URL;WORK;:http://www.fdgdsfgt.com\n" + 
			  "EMAIL;INTERNET,HOME:7165682@qq.com\n" + 

			"END:VCARD ", "D:/1.jpg", 20, "d:/ahc.png", "255,0,0", "0,0,255");
	System.out.println("ok");
}
}
