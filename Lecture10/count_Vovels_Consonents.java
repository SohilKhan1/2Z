package Lecture10;

public class count_Vovels_Consonents{
	public static void main(String[] args) {
		String str = "hello";
		
		int count=0;
		int count2=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			//String s = "aeiouAEIOU";
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}else {
				count2++;
			}
		}
		System.out.println(count);
		System.out.println(count2);

	}
	

}
