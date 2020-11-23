package com.zgs.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teacher")
public class Teacher {
    private String id;
    private String teaId;//工号
    private String teaName;
    private String teaPhone;

    public Teacher(String id, String teaId, String teaName, String teaPhone) {
        this.id = id;
        this.teaId = teaId;
        this.teaName = teaName;
        this.teaPhone = teaPhone;
    }

    public Teacher() {
    }

    public String getId() {
        return this.id;
    }

    public String getTeaId() {
        return this.teaId;
    }

    public String getTeaName() {
        return this.teaName;
    }

    public String getTeaPhone() {
        return this.teaPhone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Teacher)) return false;
        final Teacher other = (Teacher) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$teaId = this.getTeaId();
        final Object other$teaId = other.getTeaId();
        if (this$teaId == null ? other$teaId != null : !this$teaId.equals(other$teaId)) return false;
        final Object this$teaName = this.getTeaName();
        final Object other$teaName = other.getTeaName();
        if (this$teaName == null ? other$teaName != null : !this$teaName.equals(other$teaName)) return false;
        final Object this$teaPhone = this.getTeaPhone();
        final Object other$teaPhone = other.getTeaPhone();
        if (this$teaPhone == null ? other$teaPhone != null : !this$teaPhone.equals(other$teaPhone)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Teacher;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $teaId = this.getTeaId();
        result = result * PRIME + ($teaId == null ? 43 : $teaId.hashCode());
        final Object $teaName = this.getTeaName();
        result = result * PRIME + ($teaName == null ? 43 : $teaName.hashCode());
        final Object $teaPhone = this.getTeaPhone();
        result = result * PRIME + ($teaPhone == null ? 43 : $teaPhone.hashCode());
        return result;
    }

    public String toString() {
        return "Teacher(id=" + this.getId() + ", teaId=" + this.getTeaId() + ", teaName=" + this.getTeaName() + ", teaPhone=" + this.getTeaPhone() + ")";
    }
}
