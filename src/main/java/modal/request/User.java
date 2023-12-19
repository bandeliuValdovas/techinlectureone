package modal.request;



import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Builder(setterPrefix = "with")
@ToString
@Getter
public class User {

    private int id;


    @Setter
    private String name;
    private int age;





    //
//    private User(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//    private int id;
//    private String name;
//    private int age;
//
//
//
//    public int getId() {
//        return id;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//
//
//    public int getAge() {
//        return age;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public static class Builder{
//        private int id;
//        private String name;
//        private int age;
//
//        public Builder withId ( int id){
//            this.id = id;
//            return this; // returning instance of the class
//        }
//
//        public Builder withName ( String name){
//            this.name = name;
//            return this; // returning instance of the class
//        }
//
//        public Builder withAge ( int age){
//            this.age = age;
//            return this; // returning instance of the class
//        }
//
//        public User build(){
//            return new User(
//                    id,name,age
//            );
//        }













    }




