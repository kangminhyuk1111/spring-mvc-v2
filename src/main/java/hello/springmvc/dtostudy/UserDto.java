package hello.springmvc.dtostudy;

public class UserDto {

    private final String id;
    private final String password;

    public UserDto(final String id, final String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public User toEntity() {
        return new User(id, password);
    }
}
