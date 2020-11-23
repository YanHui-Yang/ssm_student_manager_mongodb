package com.zgs.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
    private String id;
    private String stuName;
    private String stuClazz;
    private String stuPhone;
    private Double stuScore;

    public Student(String id, String stuName, String stuClazz, String stuPhone, Double stuScore) {
        this.id = id;
        this.stuName = stuName;
        this.stuClazz = stuClazz;
        this.stuPhone = stuPhone;
        this.stuScore = stuScore;
    }

    public Student() {
    }

    public String getId() {
        return this.id;
    }

    public String getStuName() {
        return this.stuName;
    }

    public String getStuClazz() {
        return this.stuClazz;
    }

    public String getStuPhone() {
        return this.stuPhone;
    }

    public Double getStuScore() {
        return this.stuScore;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuClazz(String stuClazz) {
        this.stuClazz = stuClazz;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public void setStuScore(Double stuScore) {
        this.stuScore = stuScore;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Student)) return false;
        final Student other = (Student) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$stuName = this.getStuName();
        final Object other$stuName = other.getStuName();
        if (this$stuName == null ? other$stuName != null : !this$stuName.equals(other$stuName)) return false;
        final Object this$stuClazz = this.getStuClazz();
        final Object other$stuClazz = other.getStuClazz();
        if (this$stuClazz == null ? other$stuClazz != null : !this$stuClazz.equals(other$stuClazz)) return false;
        final Object this$stuPhone = this.getStuPhone();
        final Object other$stuPhone = other.getStuPhone();
        if (this$stuPhone == null ? other$stuPhone != null : !this$stuPhone.equals(other$stuPhone)) return false;
        final Object this$stuScore = this.getStuScore();
        final Object other$stuScore = other.getStuScore();
        if (this$stuScore == null ? other$stuScore != null : !this$stuScore.equals(other$stuScore)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Student;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $stuName = this.getStuName();
        result = result * PRIME + ($stuName == null ? 43 : $stuName.hashCode());
        final Object $stuClazz = this.getStuClazz();
        result = result * PRIME + ($stuClazz == null ? 43 : $stuClazz.hashCode());
        final Object $stuPhone = this.getStuPhone();
        result = result * PRIME + ($stuPhone == null ? 43 : $stuPhone.hashCode());
        final Object $stuScore = this.getStuScore();
        result = result * PRIME + ($stuScore == null ? 43 : $stuScore.hashCode());
        return result;
    }

    public String toString() {
        return "Student(id=" + this.getId() + ", stuName=" + this.getStuName() + ", stuClazz=" + this.getStuClazz() + ", stuPhone=" + this.getStuPhone() + ", stuScore=" + this.getStuScore() + ")";
    }
}
