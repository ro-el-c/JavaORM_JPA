package helloJpa;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String userName;

    private Integer age;

    @Enumerated(EnumType.STRING) // Enum 타입 / STRING, ORDINAL
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP) // DATE, TIME, TIMESTAMP
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    private LocalDateTime dateTime;

    @Lob // varchar 을 넘는 큰 컨텐츠
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }
}
