import java.util.Scanner;
public class Studentsmannage{
	public static void main(String[] args){
		while(true){
	        System.out.println("����ѧ����Ϣ��1");
			System.out.println("ɾ��ѧ����Ϣ��2");
			System.out.println("�޸�ѧ����Ϣ��3");
			System.out.println("����ѧ����Ϣ��4");
			System.out.println("�˳���5");
			System.out.println("��ѡ��");
			Scanner input=new Scanner(System.in);
			int b=input.nextInt();
			if(b==1){
				System.out.println("������ѧ����Ϣ��ѧ��+����");
			add();
			}
			if(b==2){
				System.out.println("������ɾ��ѧ����Ϣ��ѧ��+����");
		    remove();
			}
			if(b==3){
				System.out.println("�������޸�ѧ����Ϣ��ѧ��+����");
		    alter();
			}
			if(b==4){
				System.out.println("������ѧ����Ϣ��ѧ��+����");
		    find();
			}
			if(b==5){
				break;
			}

		}
	}
	public static void add(){
	StringBuffer sb=new StringBuffer();
        Scanner in=new Scanner(System.in);
		
		sb.append(in.nextLine());
	 	System.out.println(""+sb);
}
	public static void remove(){
   StringBuffer sb=new StringBuffer();
        Scanner in=new Scanner(System.in);
		sb.append(in.nextLine());
		System.out.println("ָ����Χɾ����1");
		System.out.println("ָ��λ��ɾ����2");
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		if(d==1){
			Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		int g=e.nextInt();
		sb.delete(f,g);
		System.out.println(""+sb);
		}
				if(d==2){
			Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		sb.deleteCharAt(f);
		System.out.println(""+sb);
		}

}
	public static void alter(){
   StringBuffer sb=new StringBuffer();
        Scanner in=new Scanner(System.in);
		sb.append(in.nextLine());
		System.out.println("�޸�ָ����Χ��1");
		System.out.println("�޸�ָ��λ�ã�2");
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		if(d==1){
			System.out.println("�������޸ĵķ�Χ��");
			Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		int g=e.nextInt();
		System.out.println("�������޸ĵ�����:");
		String k=e.next();
		sb.replace(f,g,k);
		System.out.println(""+sb);
		}
				if(d==2){
								System.out.println("�������޸ĵ�λ�ã�");
			Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		System.out.println("�������޸ĵ�����:");
		String j=e.next();
		char h=j.charAt(0);
		sb.setCharAt(f,j.charAt(0));
		System.out.println("�޸ĳɹ�:"+sb);
		}

}
public static void find(){
	StringBuffer sb=new StringBuffer();
        Scanner in=new Scanner(System.in);
		System.out.println("���������ѧ����Ϣ:");
		sb.append(in.nextLine());
	 	System.out.println("�Ѳ鵽��ѧ����Ϣ:"+sb);
}
}
