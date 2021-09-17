package cn.dgut.test01;

import java.io.*;

public class 演示File类的常用方法 {
	public static void main(String[] args) {
		//创建文件对象，表示一个文件
		File file = new File("example.txt");
		//获取文件名称
		System.out.println("文件名称为：" + file.getName());
		//获取文件的相对路径
		System.out.println("文件的相对路径为：" + file.getPath());
		//获取文件的绝对路径
		System.out.println("文件的绝对路径为：" + file.getAbsolutePath());
		//获取文件的父路径
		System.out.println("文件的父路径为：" + file.getParent());
		//获取文件是否可读
		System.out.println(file.canRead() ? "文件可读" : "文件不可读");
		//获取文件是否可写
		System.out.println(file.canWrite() ? "文件可写" : "文件不可写");
		//判断是否是一个文件
		System.out.println(file.isFile() ? "是一个文件" : "不是一个文件");
		//判断是否是一个目录
		System.out.println(file.isDirectory() ? "是一个目录" : "不是一个目录");
		//判断是否是一个绝对路径
		System.out.println(file.isAbsolute() ? "是一个绝对路径" : "不是一个绝对路径");
		//得到文件的最后修改时间
		System.out.println("文件的最后修改时间为：" + file.lastModified());
		//得到文件的大小
		System.out.println("文件的大小为：" + file.length() + "bytes");
		//是否成功删除文件
		System.out.println(file.delete() ? "成功删除文件" : "未成功删除文件");
	}
}