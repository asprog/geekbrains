package ru.gb_cource2.lesson7.accuWeather;

import java.util.Date;

public class Headline {

    private Date EffectiveDate;
    private long EffectiveEpochDate;
    private int Severity;
    private String Text;
    private String Category;
    private Date EndDate;
    private long EndEpochDate;
    private String MobileLink;
    private String Link;
    public void setEffectiveDate(Date EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }
    public Date getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveEpochDate(long EffectiveEpochDate) {
        this.EffectiveEpochDate = EffectiveEpochDate;
    }
    public long getEffectiveEpochDate() {
        return EffectiveEpochDate;
    }

    public void setSeverity(int Severity) {
        this.Severity = Severity;
    }
    public int getSeverity() {
        return Severity;
    }

    public void setText(String Text) {
        this.Text = Text;
    }
    public String getText() {
        return Text;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    public String getCategory() {
        return Category;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    public Date getEndDate() {
        return EndDate;
    }

    public void setEndEpochDate(long EndEpochDate) {
        this.EndEpochDate = EndEpochDate;
    }
    public long getEndEpochDate() {
        return EndEpochDate;
    }

    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }
    public String getMobileLink() {
        return MobileLink;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }
    public String getLink() {
        return Link;
    }
}
