package model;

public class CourseFormat {
    private String format;
    private int durationInWeek;
    private boolean online;
    private int lessonDuration;
    private int lessonCountPerWeek;
    private long id;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDurationInWeek() {
        return durationInWeek;
    }

    public void setDurationInWeek(int durationInWeek) {
        this.durationInWeek = durationInWeek;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getLessonDuration() {
        return lessonDuration;
    }

    public void setLessonDuration(int lessonDuration) {
        this.lessonDuration = lessonDuration;
    }

    public int getLessonCountPerWeek() {
        return lessonCountPerWeek;
    }

    public void setLessonCountPerWeek(int lessonCountPerWeek) {
        this.lessonCountPerWeek = lessonCountPerWeek;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CourseFormat{" +
                "format='" + format + '\'' +
                ", durationInWeek=" + durationInWeek +
                ", online=" + online +
                ", lessonDuration=" + lessonDuration +
                ", lessonCountPerWeek=" + lessonCountPerWeek +
                ", id=" + id +
                '}';
    }
}

