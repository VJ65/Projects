/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtp;

/**
 *
 * @author VJ
 */
class User {
    
    private String first_name;
    private String last_name;
    private String email;
    private String username;
    private String password;
    private String contact;
    
    public User(String first_name ,String last_name , String email , String username , String password , String contact)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.contact=contact;
        
    }

  
    public String getfn(){
        return first_name;
    }
     public String getln(){
        return last_name;
    }
      public String email(){
        return email;
    }
       public String username(){
        return username;
    }
        public String password(){
        return password;
    }
         public String contact(){
        return contact;
    }
}
