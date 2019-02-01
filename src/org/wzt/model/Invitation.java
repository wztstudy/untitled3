package org.wzt.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invitation {
    private int id;

    private String title;

    private String summary;

    private String auto;

    private Date createdate;

    public Invitation() {
    }

    public Invitation(int id, String title, String summary, String auto, Date createdate) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.auto = auto;
        this.createdate = createdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getCreatedate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createdate);
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "InvitationMapper{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", auto='" + auto + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
