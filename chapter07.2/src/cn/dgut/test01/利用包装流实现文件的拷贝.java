package cn.dgut.test01;

import java.io.*;

public class ���ð�װ��ʵ���ļ��Ŀ��� {
	public static void main(String[] args) throws Exception{
		FileReader r = new FileReader("src.txt");
		//����һ��bufferedReader����
		BufferedReader br = new BufferedReader(r);
		FileWriter w = new FileWriter("des.txt");
		//����һ��bufferedWriter����
		BufferedWriter bw = new BufferedWriter(w);
		String str;
		while ((str = br.readLine()) != null) {
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
