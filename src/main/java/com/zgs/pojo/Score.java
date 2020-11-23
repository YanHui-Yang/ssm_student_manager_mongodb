package com.zgs.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "score")
public class Score {
    private String id;
    private String stuName;
    private String courseName;
    private String score;

    public Score(String id, String stuName, String courseName, String score) {
        this.id = id;
        this.stuName = stuName;
        this.courseName = courseName;
        this.score = score;
    }

    public Score() {
    }

    public String getId() {
        return this.id;
    }

    public String getStuName() {
        return this.stuName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getScore() {
        return this.score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Score)) return false;
        final Score other = (Score) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$stuName = this.getStuName();
        final Object other$stuName = other.getStuName();
        if (this$stuName == null ? other$stuName != null : !this$stuName.equals(other$stuName)) return false;
        final Object this$courseName = this.getCourseName();
        final Object other$courseName = other.getCourseName();
        if (this$courseName == null ? other$courseName != null : !this$courseName.equals(other$courseName))
            return false;
        final Object this$score = this.getScore();
        final Object other$score = other.getScore();
        if (this$score == null ? other$score != null : !this$score.equals(other$score)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Score;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $stuName = this.getStuName();
        result = result * PRIME + ($stuName == null ? 43 : $stuName.hashCode());
        final Object $courseName = this.getCourseName();
        result = result * PRIME + ($courseName == null ? 43 : $courseName.hashCode());
        final Object $score = this.getScore();
        result = result * PRIME + ($score == null ? 43 : $score.hashCode());
        return result;
    }

    public String toString() {
        return "Score(id=" + this.getId() + ", stuName=" + this.getStuName() + ", courseName=" + this.getCourseName() + ", score=" + this.getScore() + ")";
    }
}
