class pc {
      public static void main(String[] args){
        Province city1=Province.getInstance();
        Province city2=Province.getInstance();
		Province city3=Province.getInstance();
         city1.name="����";     
		 SS.fuzhi(city1.name,city2.name,city3.name);

}
}
class Province{
    String name;
    private static Province INSTANCE=new Province();
    private Province(){}
    public static Province getInstance(){
        return INSTANCE;
    }
}
class SS{ 

    public static void fuzhi(String n1,String n2,String n3){
         System.out.println("city1���֣�"+n1); 
         System.out.println("city2���֣�"+n2);
		 System.out.println("city3���֣�"+n3);


}
}