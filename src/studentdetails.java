public class studentdetails {

    //attributes

    //syntax = type + name + value

    int id;
    String name;
    String email;
    int phoneno;

    //syntax of constructor = className +( ) + {this.attributeName = attributeName}
    studentdetails(int id, String name , String email,int phoneno){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;


    }

    //syntax of method = return type + method name + () + {}


    // below are the attributes of a student
    //study
    //read
    //eat

    void study () {
        System.out.println("Student can study");

    }
    void read () {
        System.out.println("Student can read");

    }
    void eat () {
        System.out.println("Student can eat");

    }

    void details(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(phoneno);
    }

}
