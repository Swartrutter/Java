package cn.dgut.test01;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.*;

public class �ַ�������д���ļ��ַ�{
	public static void main(String[] args) throws Exception{
		//����һ��FileWriter�����������ļ���д���ַ�
		FileWriter w = new FileWriter("writer.txt" , true);//����Ϊ׷��ģʽ
		String str = "Eyden";
		w.write(str);
		w.write("\r\n");
		w.close();
	}
}