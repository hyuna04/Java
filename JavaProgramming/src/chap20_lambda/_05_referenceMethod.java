package chap20_lambda;

import chap20_lambda.clazz.Convertor;
import chap20_lambda.clazz.MoneyConvertor;

public class _05_referenceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(MoneyConvertor :: convert);
		
		MoneyConvertor mcv = new MoneyConvertor();
		
		action(mcv :: instanceConvert);
	}
	
	public static void action(Convertor con) {
		int result = con.conv(1000000, '$');
		System.out.println("변환된 돈 : $" + result);
	}
}
