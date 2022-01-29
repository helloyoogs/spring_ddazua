package t_tok04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//������̼����� ����������Ŭ �������
	//�ʱ�ȭ �޼ҵ�
	@PostConstruct
	public void postConstruct() {
		if ("������".equals(name)) {
			System.out.println(name + "�� ���� ������ �ϳ׿�.");
		} else {
			System.out.println(name + "�� ����ΰ���?");
		}
	}
	
	@PreDestroy
	public void preDestroy() {
		if ("������".equals(name)) {
			System.out.println("�����մϴ�. ������ �ϰڽ��ϴ�.");
		} else {
			System.out.println("���̴� ����Դϴ�.");
		}
	}
	
	// �ʱ�ȭ �޼ҵ�
	public void init() {
		System.out.println(name + "�� �л��ΰ���?");
	}

	// �Ҹ� �޼ҵ�
	public void cleanUp() {
		System.out.println(name + "�� �л��� �ƴϾ����ϴ�.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean�� �Ҹ�� �� ȣ��˴ϴ�. �ڿ��� �ݳ��� �κ��� �ִٸ� ���⼭ �����մϴ�.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean�� ������ �� ȣ��˴ϴ�. Bean������ DI ���Ŀ� �ʱ�ȭ �κ��� �ִٸ� ���⼭ �����մϴ�.");
	}

}
