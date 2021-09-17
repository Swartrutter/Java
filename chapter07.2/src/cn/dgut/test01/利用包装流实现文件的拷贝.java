package cn.dgut.test01;

import java.io.*;

public class 利用包装流实现文件的拷贝 {
	public static void main(String[] args) throws Exception{
		FileReader r = new FileReader("src.txt");
		//创建一个bufferedReader对象
		BufferedReader br = new BufferedReader(r);
		FileWriter w = new FileWriter("des.txt");
		//创建一个bufferedWriter对象
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
