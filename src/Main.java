public class Main {

    public static void main(String[] args) {

		E();

		if(ip == input.length-1)//说明输入串已经分析完
			System.out.println("分析结果：符合文法");
		else//输入串没有分析完就结束
			System.out.println("分析结果：ERROR	不符合文法");

        System.out.println("Hello World!");
    }

	public static void E()
	{
		T();
		while(sym == '+')
		{
			ip++;
			sym = input[ip];//advance
			T();
		}
	}

	public static void T()
	{
		F();
		while(sym == '*')
		{
			ip++;
			sym = input[ip];//advance
			F();
		}
	}

	public static void F()
	{
		if(sym == 'i')
}
