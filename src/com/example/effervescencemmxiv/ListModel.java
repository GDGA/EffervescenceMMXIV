package com.example.effervescencemmxiv;


public class ListModel {
    
    private  String Name="";
    private  String Post="";
    private  String Phone="";
    private  String Email="";
     
    /*********** Set Methods ******************/
     
    public void setName(String Name)
    {
        this.Name = Name;
    }
     
    public void setPost(String Post)
    {
        this.Post = Post;
    }
     
    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }
    
    public void setEmail(String Email)
    {
        this.Email = Email;
    }
     
    /*********** Get Methods ****************/
     
    public String getName()
    {
        return this.Name;
    }
     
    public String getPost()
    {
        return this.Post;
    }
 
    public String getPhone()
    {
        return this.Phone;
    }
    
    public String getEmail()
    {
        return this.Email;
    }
}
