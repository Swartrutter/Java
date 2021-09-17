package cn.dgut.test01;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.*;

public class 字符输入流写入文件字符{
	public static void main(String[] args) throws Exception{
		//创建一个FileWriter对象用于向文件中写入字符
		FileWriter w = new FileWriter("writer.txt" , true);//设置为追加模式
		String str = "Eyden";
		w.write(str);
		w.write("\r\n");
		w.close();
	}
}