package cn.dgut.test01;

import java.io.*;

public class ��ʾFile��ĳ��÷��� {
	public static void main(String[] args) {
		//�����ļ����󣬱�ʾһ���ļ�
		File file = new File("example.txt");
		//��ȡ�ļ�����
		System.out.println("�ļ�����Ϊ��" + file.getName());
		//��ȡ�ļ������·��
		System.out.println("�ļ������·��Ϊ��" + file.getPath());
		//��ȡ�ļ��ľ���·��
		System.out.println("�ļ��ľ���·��Ϊ��" + file.getAbsolutePath());
		//��ȡ�ļ��ĸ�·��
		System.out.println("�ļ��ĸ�·��Ϊ��" + file.getParent());
		//��ȡ�ļ��Ƿ�ɶ�
		System.out.println(file.canRead() ? "�ļ��ɶ�" : "�ļ����ɶ�");
		//��ȡ�ļ��Ƿ��д
		System.out.println(file.canWrite() ? "�ļ���д" : "�ļ�����д");
		//�ж��Ƿ���һ���ļ�
		System.out.println(file.isFile() ? "��һ���ļ�" : "����һ���ļ�");
		//�ж��Ƿ���һ��Ŀ¼
		System.out.println(file.isDirectory() ? "��һ��Ŀ¼" : "����һ��Ŀ¼");
		//�ж��Ƿ���һ������·��
		System.out.println(file.isAbsolute() ? "��һ������·��" : "����һ������·��");
		//�õ��ļ�������޸�ʱ��
		System.out.println("�ļ�������޸�ʱ��Ϊ��" + file.lastModified());
		//�õ��ļ��Ĵ�С
		System.out.println("�ļ��Ĵ�СΪ��" + file.length() + "bytes");
		//�Ƿ�ɹ�ɾ���ļ�
		System.out.println(file.delete() ? "�ɹ�ɾ���ļ�" : "δ�ɹ�ɾ���ļ�");
	}
}