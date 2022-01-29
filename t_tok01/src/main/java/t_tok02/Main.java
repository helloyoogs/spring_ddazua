package t_tok02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// ���͸� ��ü��
		WhitePhone wp = new WhitePhone();
		wp.show();

		// ���͸� �и��� - DI ������ ����
		BlackPhone bp = new BlackPhone();
		bp.show();
		//���� �� ���͸� ��ü
		// - ������ ���� ���
		Battery newBattery = new Battery("���� �� ���͸� - ������");
		bp.setBattery(newBattery);
		bp.show();
		
		// - ���� ���Թ�
		newBattery.setName("���� �� ���͸� - ����");
		bp.setBattery(newBattery);
		bp.show();
		
		//�������� �̿��� ���
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BlackPhone newBp = (BlackPhone)context.getBean("blackPhone");
		newBp.show();
	}
}
