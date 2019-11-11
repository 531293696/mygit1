import java.util.Scanner;
public class Studentsmannage{
	public static void main(String[] args){
		while(true){
	        System.out.println("增加学生信息：1");
			System.out.println("删除学生信息：2");
			System.out.println("修改学生信息：3");
			System.out.println("查找学生信息：4");
			System.out.println("退出：5");
			System.out.println("请选择：");
			Scanner input=new Scanner(System.in);
			int b=input.nextInt();
			if(b==1){
				System.out.println("请输入学生信息：学号+姓名");
			add();
			}
			if(b==2){
				System.out.println("请输入删除学生信息：学号+姓名");
		    remove();
			}
			if(b==3){
				System.out.println("请输入修改学生信息：学号+姓名");
		    alter();
			}
			if(b==4){
				System.out.println("请输入学生信息：学号+姓名");
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
		System.out.println("指定范围删除：1");
		System.out.println("指定位置删除：2");
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
		System.out.println("修改指定范围：1");
		System.out.println("修改指定位置：2");
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		if(d==1){
			System.out.println("请输入修改的范围：");
			Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		int g=e.nextInt();
		System.out.println("请输入修改的内容:");
		String k=e.next();
		sb.replace(f,g,k);
		System.out.println(""+sb);
		}
				if(d==2){
								System.out.println("请输入修改的位置：");
			Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		System.out.println("请输入修改的内容:");
		String j=e.next();
		char h=j.charAt(0);
		sb.setCharAt(f,j.charAt(0));
		System.out.println("修改成功:"+sb);
		}

}
public static void find(){
	StringBuffer sb=new StringBuffer();
        Scanner in=new Scanner(System.in);
		System.out.println("请输入查找学生信息:");
		sb.append(in.nextLine());
	 	System.out.println("已查到该学生信息:"+sb);
}
}
