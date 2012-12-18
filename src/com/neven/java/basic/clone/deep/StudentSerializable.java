package com.neven.java.basic.clone.deep;

import java.beans.Transient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

import com.neven.java.basic.clone.Professor;

public class StudentSerializable implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;// ��������
	public int age;
	public transient Professor p;// ѧ��1��ѧ��2������ֵ����һ���ġ�

	StudentSerializable(String name, int age, Professor p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}

	public Object deepClone() throws IOException, OptionalDataException,ClassNotFoundException {
		// ������д������
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		// �����������
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		
		return (oi.readObject());
	}

}
