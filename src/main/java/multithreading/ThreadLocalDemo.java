package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class UserThreadLocalHolder{
    public static ThreadLocal<User> threadLocalHolder = new ThreadLocal<>();
}
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i=0; i<20; i++){
            int finalI = i;
            Runnable user = () -> {
                setUserService(new User(finalI, "Sriman "+finalI));
                System.out.println(getUserService());
            };
            service.execute(user);
        }
        service.shutdown();
    }

    public static void setUserService(User user){
        UserThreadLocalHolder.threadLocalHolder.set(user);
    }

    public static User getUserService(){
        return UserThreadLocalHolder.threadLocalHolder.get();
    }


}

class User{
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
