package t_tok03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

//Advice : �ΰ������ ����ϴ� ����. �α��� ����� Ŭ����
public class LoggingAdvice {
	public void beforeAdvice() {
		System.out.println("#####�޼ҵ� �������� �α׸� ����մϴ�.#####");

	}
	public void beforeBuyConfirm() {
		System.out.println("@@@@���� �� ������ Ȯ���� �ʼ��Դϴ�.@@@@");

	}
	public void afterAdvice() {
		System.out.println("$$$$$$$$$$�������ּż� �����մϴ�.$$$$$$$$$$");

	}
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		//�߰�����
		Signature method = joinPoint.getSignature();
		System.out.println("&&&&&&&���� ������ �޼ҵ�:::" + method.getName());
		
		//�޼ҵ� ����
		joinPoint.proceed();
		
		//�߰� ����
		if ("buyGoods".equals(method.getName())) {
			System.out.println("Goods�� �������ּż� �����մϴ�.");
		} else {
			System.out.println("Item�� �������ּż� �����մϴ�.");
		}
	}

}
