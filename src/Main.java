class Main{
    public static void main(String[] args) {
//        String s = "1241";
//        String b = "23141";
//        int a = Integer.parseInt(s);
//        int q = Integer.parseInt(b);
//        System.out.println(a * q);

//        String sl ="This is John Doe";
//        String otvet = sl.substring(8,12);
//        System.out.println(otvet);
//        System.out.println(sl.split(" ")[2]);\
//        System.out.println("Hello World");
//        System.out.println(" World2");

        MyArrayList list = getEmployees();
        list.add("Aliya");
        list.getSize();
        for(int i =0 ; i < list.getSize(); i++){
            System.out.println(list.getName(i));
        }
    }
    private static MyArrayList  getEmployees(){
        MyArrayList list = new MyArrayList();
        list.add("era");
        list.add("aman");
        list.add("aha");
        list.add("zhas");
        list.add("das");
        list.remove("das");
        return list;

    }

}
