import java.util.Scanner;

public class TemeleClass {

	public static void main(String[] args) {
	//Exercitiul1();
	//Exercitiul2();
	//Exercitiul3();
	//Exercitiul4();
	//Exercitiul5();
	//Exercitiul6();
	//Exercitiul7();
	//Exercitiul8();
	//Exercitiul9();
	//Exercitiul9();
	Exercitiul10();
	//Exercitiul11();
	//Exercitiul12();
	//Exercitiul13();
	//Exercitiul14();
	//Exercitiul15();
	//Exercitiul16();
	//Exercitiul17();
	//Exercitiul18();
	//Exercitiul19();
	//Exercitiul20();
	}
	public static void Exercitiul1() {
		int a;
		System.out.print("dati numarul natural = ");
		 a = new Scanner(System.in).nextInt();
		if((a>=1) && (a<5))
		{
		System.out.println("Respins");
		}
		else if((a>=5) && (a<=10))
		{
			System.out.println("Admis");
		}
		else if((a>10) || (a<1))
		{
			System.out.println("Invalid");
		}
	}
	public static void Exercitiul2() {
		int a;
		System.out.print("dati numarul natural = ");
		 a = new Scanner(System.in).nextInt();
		switch(a) {
		case 1: System.out.println("Unu ");break;
		case 2: System.out.println("Doi ");break;
		case 3: System.out.println("Trei");break;
		case 4: System.out.println("Patru");break;
		case 5: System.out.println("Cinci");break;
		default:System.out.println("INVALID");break;
		}
	
	}
	public static void Exercitiul3() {
		int s = 0;
		int a;
		System.out.print("dati numarul natural = ");
		 a = new Scanner(System.in).nextInt();
		 int b;
			System.out.print("dati un alt numar natural = ");
			 b = new Scanner(System.in).nextInt();
	if((a%2==0) && (b%2==0))
		s=((a+b)/2);
	else if ((a%2==1) && (b%2==1))
		s=a*b;
	else if (((a%2==1) && (b%2==0)) || ((a%2==0) && (b%2==1)))
		s=a+b;
System.out.println(s);
	}
	public static void Exercitiul4() {
		int min = 0;
		int a;
		System.out.print("dati numarul natural = ");
		 a = new Scanner(System.in).nextInt();
		int b;
		System.out.print("dati numarul natural = ");
		b = new Scanner(System.in).nextInt();
		int c;
		System.out.print("dati numarul natural = ");
		 c = new Scanner(System.in).nextInt();
		
		if(a<b) min = a;
		else min = b;
		if(c<min) min = c;
		
		System.out.println(min);
	}
	public static void Exercitiul5() {
		int n;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		int s=0;
		for(int i=0; i<=n; i++)
			if(i%2==0)
			s+=i;
		System.out.println(s);
	}
	public static void Exercitiul6() {
		int n;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		int s=0;
		for(int i=0; i<=n; i++)
			if(i%2==1)
			s+=i;
		System.out.println(s);
	}
	public static void Exercitiul7() {
		System.out.print("dati numarul natural = ");
		int n = new Scanner(System.in).nextInt();
		int s = 0;
		int y = 0;
		for(int i=1; i<=n; i++)
		{
			s+=i;
			y=s/n;
		}
		
		System.out.println("Suma: " + s);
		System.out.println("Cate numere sunt: " + n);
		System.out.println("Media aritmetica: " + y);
	}
	public static void Exercitiul8() {
		int n;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		int factori = 1;
		
		for(int i=1; i<=n; i++)
			factori*=i;
		
		System.out.println(factori);
	}
	public static void Exercitiul9() {
		System.out.print("dati numarul natural = ");
		int n = new Scanner(System.in).nextInt();
		boolean flag = true;
		for(int i=2; i<n; i++)
		{if(n%i==0)
			flag=false;
			
		}
		if((n==0) || (n==1) || (n<1))
			System.out.println("Invalid numar");
		else
		{
		if(flag==true)
			System.out.println(n + " este prim");
		else
			System.out.println(n + " nu este prim");
			}
	}
	public static void Exercitiul10() {
	
	int n = 1001;
	
	while(true)
	{	boolean flag = true;
		n++;
	for(int i=2; i<n; i++)
	{if(n%i==0)
		flag=false;
	}
	if(flag==true)
		{
		System.out.println(n + " este urmatorul numar prim");
	     break;
	    }
	
	}	
	}
	public static void Exercitiul11() {
		System.out.print("dati numarul natural = ");
		int n = new Scanner(System.in).nextInt();
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
				System.out.println(i);
			
		}
	}
	public static void Exercitiul12() {
		System.out.print("dati numarul natural = ");
		int n = new Scanner(System.in).nextInt();
		for(int i=2; i<n; i++)
			{boolean flag = true;
				if(n%i==0)
				{
					for(int j=2; j<i;j++)
					{if(i%j==0)
						flag=false;
					}
					if(flag == true)
				System.out.println(i);
				}
				
			}
	}
	public static void Exercitiul13() {
		System.out.println("Numerele care sunt divizibile cu 17 sau 19, iar suma lor ete 1000: ");
		for(int i = 1; i<=1000; i++)
			{for(int j = 1000; j>=1; j--)
				{
					{
						if((i%17==0) && (j%19==0) &&(i+j==1000))
							System.out.println(i + " + " + j + ", ");
						if((j%17==0) && (i%19==0) &&(i+j==1000))
							System.out.println(i + " + " + j + ", ");		
					}
				}
			}
	}
	public static void Exercitiul14() {
		System.out.println("Numerele care sunt divizibile cu 17 si 19: ");
		for(int i = 1; i<=1000; i++)
			{for(int j = 1000; j>=1; j--)
				{
					{
						if(((i%17==0) || (i%13==0))  && ((j%19==0) || (j%7==0)) && (i+j==1000))
							System.out.println(i + " + " + j + ", ");		
					}
				}
			}	
	}
	public static void Exercitiul15() {
		int c = 0;
		for(int a=1; a<10; a++)
		{
			for(int b=1; b<10; b++)
			{
				c=3000+(100*a)+(20)+b;
				if(c%9==0)
					System.out.print(c + " ");
			}
				
		}
	}
	public static void Exercitiul16() {
		int n;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		 while(n!=0)
		 {
			 System.out.println(n%10);
		 n=n/10;
		 }	
	}
	public static void Exercitiul17() {
		int n;
		int max = 0;
		int max2 = 0;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		 while(n!=0)
		 {
		if(n%10>max) 
			max=n%10;
		else max2=max;
		n=n/10;	
		 }
		 System.out.print(max);	
	}
	public static void Exercitiul18() {
		int n;
		int min = 9;
		int min2 = 0;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		 while(n!=0)
		 {
		if(n%10<=min) 
			min=n%10;
		else min2=min;
		n=n/10;	
		 }
		 System.out.print(min);	
	}
	public static void Exercitiul19() {
		int n;
		int z = 0;
		int s = 1;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		int m=n;
		 while(n!=0)
		 {
			s=s*10; 
		 n=n/10;
		 }
		// System.out.print(s);
		 System.out.println();
		 while(m!=0)
		 {s=s/10;
		z=z+m%10*s;
		 m=m/10;
		 }
		 System.out.println(z);	
	}
	public static void Exercitiul20() {
		int n;
		int z = 0;
		int s = 1;
		System.out.print("dati numarul natural = ");
		 n = new Scanner(System.in).nextInt();
		int m=n;
		int o = n;
		 while(n!=0)
		 {
			s=s*10; 
		 n=n/10;
		 }
		// System.out.print(s);
		 System.out.println();
		 while(m!=0)
		 {s=s/10;
		z=z+m%10*s;
		 m=m/10;
		 }
if(o==z)
	System.out.println("Este palindrom");
else System.out.println("Nu este palindrom");	
	}
}
