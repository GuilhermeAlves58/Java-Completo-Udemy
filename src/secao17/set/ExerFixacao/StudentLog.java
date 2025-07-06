package secao17.set.ExerFixacao;

import java.util.Objects;

public class StudentLog {
    private Integer id;

    public StudentLog(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        StudentLog that = (StudentLog) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
