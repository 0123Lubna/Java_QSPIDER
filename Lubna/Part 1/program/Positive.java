class Positive{
	public static void main(String[] args){
	int a= 9;
	System.out.println((a>0) ? "a is positive" :"a is not  positive");
	int b = -7; 
	System.out.println((b<0) ? "b is negative" :"b is not  negative");
	int c = 0;
	System.out.println((c==0) ? "c is zero " :" c is not  zero");
	int d = 9;
	System.out.println((d<10) ? "d is less than 10 " :"d  is larger than 10 ");
	int e = 6;
	System.out.println((e>=5) ? "e is greater than  equal to 5" : "e is not greater than equal to 5");
	int f = 15;
	System.out.println((f%3==0) ? "f is divisible by 3" : "f is not divisible by 3");
	char ch = 'A';
	String res=((ch >= 'A' && ch <= 'Z') ? (ch +  "is upper case"):(ch +  "is not upper  case"));
	System.out.println(res);
	char ch1 = 'a';
	String re=((ch1 >= 'a' && ch1 <= 'z') ? (ch1 +  "is lower case"):(ch1 +  "is not lower  case"));
	System.out.println(re);

	char ch2 ='A';
	String resu=((ch2 == 'A' || ch2 =='E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') ? (ch2 + "is upper case vowel"):(ch2 + "is not upper case vowel"));
	System.out.println(resu);

	char ch3 ='E';
	String r=((ch3 == 'A' || ch3 =='E' || ch3 == 'I' || ch3 == 'O' || ch3 == 'U') ? (ch3 + "is upper case vowel"):(ch3 + "is not upper case vowel"));
	System.out.println(r);


	char chh ='A';
	while(chh >='A' && chh <='E'){
	System.out.println(chh);


	chh++;

}
	int p  =1;
	while(p>=1 && p <=6){
	System.out.println(p);


	p++;

}

  System.out.println("=============================================");

	char ch9 ='A';
	while(ch9<='I'){
	System.out.println(ch9);


	ch9+=2;

}
 System.out.println("=============================================");


	char v ='Z';
	while(v >='S'  ){
	System.out.println(v);
	v--;
}
 System.out.println("=============================================");
	

	char l ='Z';
	while(l>='T'){
	System.out.println(l);
	l-=2;
}
 System.out.println("=============================================");
	
	int g = 5;
	while(g<=25){
	System.out.println(g);
	g+=5;
}





	






	
	
	
 
	
	
	
	


	
	
	
	
	
	
	

	


	



	
	
	

	
	
}
}
