package com.zgs.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "course")
public class Course {
    private String id;
    private String courseName;
    private String courseHour;

    public Course(String id, String courseName, String courseHour) {
        this.id = id;
        this.courseName = courseName;
        this.courseHour = courseHour;
    }

    public Course() {
    }

    public String getId() {
        return this.id;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseHour() {
        return this.courseHour;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseHour(String courseHour) {
        this.courseHour = courseHour;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Course)) return false;
        final Course other = (Course) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$courseName = this.getCourseName();
        final Object other$courseName = other.getCourseName();
        if (this$courseName == null ? other$courseName != null : !this$courseName.equals(other$courseName))
            return false;
        final Object this$courseHour = this.getCourseHour();
        final Object other$courseHour = other.getCourseHour();
        if (this$courseHour == null ? other$courseHour != null : !this$courseHour.equals(other$courseHour))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Course;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $courseName = this.getCourseName();
        result = result * PRIME + ($courseName == null ? 43 : $courseName.hashCode());
        final Object $courseHour = this.getCourseHour();
        result = result * PRIME + ($courseHour == null ? 43 : $courseHour.hashCode());
        return result;
    }

    public String toString() {
        return "Course(id=" + this.getId() + ", courseName=" + this.getCourseName() + ", courseHour=" + this.getCourseHour() + ")";
    }
}
