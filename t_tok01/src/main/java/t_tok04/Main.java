package t_tok04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// ������ �����̳� ����
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();

		// ������ �����̳� ����
		context.load("beans.xml");
		context.refresh();

		// ������ �����̳� ���
		Student student = (Student) context.getBean("student");
		System.out.println(student.getName());

		// ������ �����̳� ����
		context.close();
	}
}
