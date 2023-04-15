package ObjectOrientedProgrammingTest6;

/**
 * 关于JavaBean类的演示
 */
public class User {
    // 属性
    private String userName;
    private String password;
    private String email;
    private String gender;
    private int age;

    // 空参  NOTE 生成空参构造方法的快捷键: Alt + Insert ,跳出的选项中选中 Constructor选项,然后不选变量,点击 Select None按钮即可.
    public User(){
    }

    // 带全部参数的构造-- NOTE 生成带全部参数的构造方法的快捷键: Alt + Insert ,跳出的选项中选中 Constructor选项,再选中全部变量.
    public User(String userName1,String password1,String email1,String gender1,int age1){
        this.userName = userName1;
        this.password = password1;
        this.email = email1;
        this.gender = gender1;
        this.age = age1;
    }

    // get和set方法--五个变量都要对应书写
    public void setUserName(String userName2){
        this.userName = userName2;
    }
    public String getUserName(){
        return userName;
    }

    // NOTE 创建get和set方法的快捷键: Alt + Insert,跳出的选项中选中 Getters and Setters,再全选变量名点击OK.
    // 使用PTG插件 1秒生成标准JavaBean类
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
