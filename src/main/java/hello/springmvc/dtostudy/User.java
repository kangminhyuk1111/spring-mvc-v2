package hello.springmvc.dtostudy;

public class User {

    private final String id;
    private final String password;

    public User(final String id, final String password) {
        this.id = id;
        this.password = password;
    }

    public UserDto toDto() {
        return new UserDto(id, password);
    }
}
