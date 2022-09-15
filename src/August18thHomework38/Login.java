package August18thHomework38;

public class Login {

//    Write a Class named "Login" where it has private data members of String Username and String Password.
//    Create another Class where you create instance (Object) of Login class,  set those private data members Then Print Those Values

    private String Username;
    private String Password;

    public void SetUN(String UN){
      this.Username=UN;
    }
    public void SetPass(String PASS){
        this.Password=PASS;
    }

//    public String GetUN(){
//        return Username;
//    }
//    public String GetPASS(){
//        return Password;
//    }

    public Login(String UN,String PASS){
        SetUN(UN);
        SetPass(PASS);
    }
  public void Username(){
      System.out.println("Please UserName : " +Username);
  }
  public void Password(){
      System.out.println("Please Password : " +Password);
  }
}
