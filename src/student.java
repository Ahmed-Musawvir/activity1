public class student {

    public static void main(String[] args) {

        studentdetails obj1 = new studentdetails(555,"yelan","yelan@gmail.com",7873946);
        studentdetails obj2 = new studentdetails(556,"Childe","tartaglia@gmail.com",4363664);

        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj2.name);


        obj1.details();




    }


}
