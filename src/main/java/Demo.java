import com.google.gson.Gson;

public class Demo {
    public static void main(String[] args) {
        String name = "Julia";
        String lastName = "Varvaryuk";
        User user = new User(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}
