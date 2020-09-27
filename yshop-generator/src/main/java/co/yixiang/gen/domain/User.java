package co.yixiang.gen.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class User {
    private Long id;

    private Long avatarId;

    private String email;

    private Long enabled;

    private String password;

    private String username;

    private Long deptId;

    private String phone;

    private Long jobId;

    private Date createTime;

    private Date lastPasswordResetTime;

    private String nickName;

    private String sex;

    private Integer typeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Long avatarId) {
        this.avatarId = avatarId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getEnabled() {
        return enabled;
    }

    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastPasswordResetTime() {
        return lastPasswordResetTime;
    }

    public void setLastPasswordResetTime(Date lastPasswordResetTime) {
        this.lastPasswordResetTime = lastPasswordResetTime;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", avatarId=").append(avatarId);
        sb.append(", email=").append(email);
        sb.append(", enabled=").append(enabled);
        sb.append(", password=").append(password);
        sb.append(", username=").append(username);
        sb.append(", deptId=").append(deptId);
        sb.append(", phone=").append(phone);
        sb.append(", jobId=").append(jobId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastPasswordResetTime=").append(lastPasswordResetTime);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", typeId=").append(typeId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAvatarId() == null ? other.getAvatarId() == null : this.getAvatarId().equals(other.getAvatarId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastPasswordResetTime() == null ? other.getLastPasswordResetTime() == null : this.getLastPasswordResetTime().equals(other.getLastPasswordResetTime()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAvatarId() == null) ? 0 : getAvatarId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastPasswordResetTime() == null) ? 0 : getLastPasswordResetTime().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "BIGINT", false),
        avatarId("avatar_id", "avatarId", "BIGINT", false),
        email("email", "email", "VARCHAR", false),
        enabled("enabled", "enabled", "BIGINT", false),
        password("password", "password", "VARCHAR", true),
        username("username", "username", "VARCHAR", false),
        deptId("dept_id", "deptId", "BIGINT", false),
        phone("phone", "phone", "VARCHAR", false),
        jobId("job_id", "jobId", "BIGINT", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        lastPasswordResetTime("last_password_reset_time", "lastPasswordResetTime", "TIMESTAMP", false),
        nickName("nick_name", "nickName", "VARCHAR", false),
        sex("sex", "sex", "VARCHAR", false),
        typeId("type_id", "typeId", "INTEGER", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}