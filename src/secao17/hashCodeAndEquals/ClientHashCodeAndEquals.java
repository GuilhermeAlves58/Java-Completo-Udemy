package secao17.hashCodeAndEquals;

import java.util.Objects;

public class ClientHashCodeAndEquals {
    private String name;
    private String email;

    public ClientHashCodeAndEquals(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ClientHashCodeAndEquals that = (ClientHashCodeAndEquals) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }
}
